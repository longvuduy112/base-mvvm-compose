package com.longvuduy.basecompose

import androidx.lifecycle.ViewModel
import com.longvuduy.basecompose.base.ui.theme.SunThemeMode
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {
    private val _themeColor = MutableStateFlow(SunThemeMode.DARK)
    val themeColor = _themeColor.asStateFlow()

    fun updateThemeColor(newTheme: SunThemeMode) {
        _themeColor.value = newTheme
    }
}