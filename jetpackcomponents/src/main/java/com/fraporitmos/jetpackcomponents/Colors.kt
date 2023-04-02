package com.fraporitmos.jetpackcomponents

import androidx.compose.ui.graphics.Color

class JCColors(
    var primaryColor: Color = Color(0xFF386A20),
    var secondaryColor: Color = Color(0xFF55624C),
    var whiteColor : Color = Color(0xFFFFFFFF),

) {
    fun setPrimaryColorValue(color: Color) {
        primaryColor = color
    }

    fun setSecondaryColorValue(color: Color) {
        secondaryColor = color
    }


    fun getPrimaryColorValue(): Color {
        return primaryColor
    }

    fun getSecondaryColorValue(): Color {
        return secondaryColor
    }

    fun getWhiteColorValue(): Color {
        return whiteColor
    }



}