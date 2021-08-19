package com.kashonkov.avangard_compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kashonkov.avangard_compose.R

// Set of Material typography styles to start with
val InterFontFamily = FontFamily(
    Font(R.font.inter_regular, weight = FontWeight.Normal),
    Font(R.font.inter_black, weight = FontWeight.Black),
    Font(R.font.inter_bold, weight = FontWeight.Bold),
    Font(R.font.inter_extrabold, weight = FontWeight.ExtraBold),
    Font(R.font.inter_extralight, weight = FontWeight.ExtraLight),
    Font(R.font.inter_light, weight = FontWeight.Light),
    Font(R.font.inter_medium, weight = FontWeight.Medium),
    Font(R.font.inter_semibold, weight = FontWeight.SemiBold),
    Font(R.font.inter_thin, weight = FontWeight.Thin),
)
val Typography = Typography(
    defaultFontFamily = InterFontFamily,
    h1 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 93.0.sp,
        letterSpacing = (-1.5).sp,
    ),
    h2 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 58.0.sp,
        letterSpacing = (-0.5).sp,
    ),
    h3 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 46.0.sp,
    ),
    h4 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 46.0.sp,
        letterSpacing = 0.25.sp,
    ),
    h5 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 23.0.sp,
        lineHeight = 1.56.sp,
    ),
    h6 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 19.0.sp,
        letterSpacing = 0.15.sp,
        lineHeight = 1.68.sp,
    ),
    caption = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.0.sp,
        letterSpacing = 0.4.sp,
        lineHeight = 1.33.sp,
    ),
    overline = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.0.sp,
        letterSpacing = 1.5.sp,
        lineHeight = 1.6.sp,
    ),
    body1 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.0.sp,
        letterSpacing = 0.5.sp,
        lineHeight = 1.6.sp,
    ),
    body2 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.0.sp,
        letterSpacing = 0.25.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 0.1.sp
    ),
    button = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        letterSpacing = 1.25.sp
    ),
)

