package com.longvuduy.basecompose.navigation

import androidx.annotation.StringRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.longvuduy.basecompose.R

sealed class Screen(
    val route: String,
    @param:StringRes val title: Int = R.string.app_name,
    val navIcon: (@Composable () -> Unit) = {},
    val objectName: String = "",
    val objectPath: String = ""
) {
    data object Detail : Screen("detail")
    data object Home : Screen("home")
}
