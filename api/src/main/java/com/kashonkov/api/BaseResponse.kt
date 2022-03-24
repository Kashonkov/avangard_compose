package ru.avangard.ib.api

abstract  class  BaseResponse {
    val errorCode: Int? = null
    val errorDesc: String? = null
    val httpStatus: Int? = null
}