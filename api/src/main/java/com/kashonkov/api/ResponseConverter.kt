package ru.avangard.ib.api

@Throws(ApiException::class)
fun <E> convertToEntity(retrofitResponse: retrofit2.Response<E>): E where E : BaseResponse {
    val response = convert(retrofitResponse);
    if (response.isSuccessful) {
        return response.data
    } else {
        throw ApiException(response.code, response.error)
    }
}

@Throws(ApiException::class)
fun <E> convert(retrofitResponse: retrofit2.Response<E>): Response<E> where E : BaseResponse {
    if (retrofitResponse.isSuccessful) {
        val data = retrofitResponse.body()

        if (data?.errorCode != null) {
            throw ApiException(data.errorDesc ?: "", data.errorCode)
        }
        return Response(data, null, retrofitResponse.code())
    } else {
        val responseBody = retrofitResponse.errorBody()
                ?: throw ApiException(retrofitResponse.code())
        var message = ""
        try {
            message = responseBody.string()
        } catch (e: Exception) {
            throw ApiException(e, retrofitResponse.code())
        }
        throw ApiException(message, retrofitResponse.code())
    }
}