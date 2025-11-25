package com.longvuduy.basecompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.longvuduy.basecompose.base.ui.theme.DarkSunColorScheme
import com.longvuduy.basecompose.base.ui.theme.DarkSunIcon
import com.longvuduy.basecompose.base.ui.theme.LightSunColorScheme
import com.longvuduy.basecompose.base.ui.theme.LightSunIcon
import com.longvuduy.basecompose.base.ui.theme.LocalSunColorScheme
import com.longvuduy.basecompose.base.ui.theme.LocalSunIcon
import com.longvuduy.basecompose.base.ui.theme.LocalSunTypography
import com.longvuduy.basecompose.base.ui.theme.RobotoSunTypography
import com.longvuduy.basecompose.base.ui.theme.SunThemeMode

@Composable
fun AppTheme(
    viewModel: MainViewModel = hiltViewModel(),
    content: @Composable (MainViewModel) -> Unit
) {
    val theme by viewModel.themeColor.collectAsState()

    val colors = if (theme == SunThemeMode.DARK) DarkSunColorScheme else LightSunColorScheme
    val icons = if (theme == SunThemeMode.DARK) DarkSunIcon else LightSunIcon

    CompositionLocalProvider(
        LocalSunColorScheme provides colors,
        LocalSunIcon provides icons,
        LocalSunTypography provides RobotoSunTypography
    ) {
        content(viewModel)
    }
}


