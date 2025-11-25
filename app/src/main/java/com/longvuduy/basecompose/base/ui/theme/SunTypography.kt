package com.longvuduy.basecompose.base.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.longvuduy.basecompose.R

class SunTypography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val h7: TextStyle,
    val h8: TextStyle,
    val h9: TextStyle,
    val h10: TextStyle,
    val bodyXLargeRegular: TextStyle,
    val bodyXLargeMedium: TextStyle,
    val bodyXLargeBold: TextStyle,
    val bodyLargeRegular: TextStyle,
    val bodyLargeMedium: TextStyle,
    val bodyLargeBold: TextStyle,
    val bodyMediumRegular: TextStyle,
    val bodyMediumMedium: TextStyle,
    val bodyMediumBold: TextStyle,
    val bodyBaseRegular: TextStyle,
    val bodyBaseMedium: TextStyle,
    val bodyBaseBold: TextStyle,
    val bodySmallRegular: TextStyle,
    val bodySmallMedium: TextStyle,
    val bodySmallBold: TextStyle,
    val bodyXSmallRegular: TextStyle,
    val bodyXSmallMedium: TextStyle,
    val bodyXSmallBold: TextStyle,
)

private val robotoFamily = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_regular_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.SemiBold),
    Font(R.font.roboto_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_bold_italic, FontWeight.Bold, FontStyle.Italic),
)

const val scaleLineHeight = 1.4


val RobotoSunTypography
    get() = SunTypography(
        h1 = TextStyle(
            lineHeight = (64 * scaleLineHeight).sp,
            fontSize = 64.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h2 = TextStyle(
            lineHeight = (48 * scaleLineHeight).sp,
            fontSize = 48.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h3 = TextStyle(
            lineHeight = (40 * scaleLineHeight).sp,
            fontSize = 40.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h4 = TextStyle(
            lineHeight = (32 * scaleLineHeight).sp,
            fontSize = 32.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h5 = TextStyle(
            lineHeight = (28 * scaleLineHeight).sp,
            fontSize = 28.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h6 = TextStyle(
            lineHeight = (28 * scaleLineHeight).sp,
            fontSize = 24.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h7 = TextStyle(
            lineHeight = (20 * scaleLineHeight).sp,
            fontSize = 20.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h8 = TextStyle(
            lineHeight = (18 * scaleLineHeight).sp,
            fontSize = 18.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h9 = TextStyle(
            lineHeight = (16 * scaleLineHeight).sp,
            fontSize = 16.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        h10 = TextStyle(
            lineHeight = (14 * scaleLineHeight).sp,
            fontSize = 14.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        bodyXLargeRegular = TextStyle(
            lineHeight = (20 * scaleLineHeight).sp,
            fontSize = 20.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodyXLargeMedium = TextStyle(
            lineHeight = (20 * scaleLineHeight).sp,
            fontSize = 20.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodyXLargeBold = TextStyle(
            lineHeight = (20 * scaleLineHeight).sp,
            fontSize = 20.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        bodyLargeRegular = TextStyle(
            lineHeight = (18 * scaleLineHeight).sp,
            fontSize = 18.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodyLargeMedium = TextStyle(
            lineHeight = (18 * scaleLineHeight).sp,
            fontSize = 18.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodyLargeBold = TextStyle(
            lineHeight = (18 * scaleLineHeight).sp,
            fontSize = 18.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),

        bodyMediumRegular = TextStyle(
            lineHeight = (16 * scaleLineHeight).sp,
            fontSize = 16.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodyMediumMedium = TextStyle(
            lineHeight = (16 * scaleLineHeight).sp,
            fontSize = 16.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodyMediumBold = TextStyle(
            lineHeight = (16 * scaleLineHeight).sp,
            fontSize = 16.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        bodyBaseRegular = TextStyle(
            lineHeight = (14 * scaleLineHeight).sp,
            fontSize = 14.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodyBaseMedium = TextStyle(
            lineHeight = (14 * scaleLineHeight).sp,
            fontSize = 14.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodyBaseBold = TextStyle(
            lineHeight = (14 * scaleLineHeight).sp,
            fontSize = 14.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        bodySmallRegular = TextStyle(
            lineHeight = (12 * scaleLineHeight).sp,
            fontSize = 12.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodySmallMedium = TextStyle(
            lineHeight = (12 * scaleLineHeight).sp,
            fontSize = 12.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodySmallBold = TextStyle(
            lineHeight = (12 * scaleLineHeight).sp,
            fontSize = 12.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
        bodyXSmallRegular = TextStyle(
            lineHeight = (10 * scaleLineHeight).sp,
            fontSize = 10.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Normal
        ),
        bodyXSmallMedium = TextStyle(
            lineHeight = (10 * scaleLineHeight).sp,
            fontSize = 10.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium
        ),
        bodyXSmallBold = TextStyle(
            lineHeight = (10 * scaleLineHeight).sp,
            fontSize = 10.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold
        ),
    )

val LocalSunTypography = staticCompositionLocalOf { RobotoSunTypography }



