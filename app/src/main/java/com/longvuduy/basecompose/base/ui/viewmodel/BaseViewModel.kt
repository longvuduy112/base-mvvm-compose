package com.longvuduy.basecompose.base.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel<S : BaseViewState> : ViewModel() {
    abstract val viewState: StateFlow<S>
}