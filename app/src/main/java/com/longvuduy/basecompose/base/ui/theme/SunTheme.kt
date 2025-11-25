package com.longvuduy.basecompose.base.ui.theme

import androidx.compose.runtime.Composable

object SunTheme {
    val colorScheme: SunColorScheme
        @Composable get() = LocalSunColorScheme.current
    val typography: SunTypography
        @Composable get() = LocalSunTypography.current
    val icon: SunIcon
        @Composable get() = LocalSunIcon.current

}

enum class SunThemeMode {
    DARK, LIGHT
}
