package com.longvuduy.basecompose.ui

import com.longvuduy.basecompose.base.ui.viewmodel.BaseViewModel
import com.longvuduy.basecompose.base.ui.viewmodel.BaseViewState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainState : BaseViewState
class MainViewModel() : BaseViewModel<MainState>() {
    private val _state = MutableStateFlow(MainState())
    override val viewState: StateFlow<MainState> = _state.asStateFlow()
}