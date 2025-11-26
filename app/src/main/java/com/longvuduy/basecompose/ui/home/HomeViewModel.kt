package com.longvuduy.basecompose.ui.home

import androidx.compose.runtime.Immutable
import androidx.lifecycle.viewModelScope
import com.longvuduy.basecompose.base.ui.viewmodel.BaseViewModel
import com.longvuduy.basecompose.base.ui.viewmodel.BaseViewState
import com.longvuduy.basecompose.data.repository.phonevalidation.PhoneValidationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


@Immutable
data class HomeState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val inputPhoneNumber: String = "",
    val isValidPhoneNumber : Boolean = false,
    val country: String? = null
) : BaseViewState

@HiltViewModel
class MainScreenViewModel @Inject constructor(private val phoneValidationRepository: PhoneValidationRepository) : BaseViewModel<HomeState>() {
    private val _state = MutableStateFlow(HomeState())
    override val viewState: StateFlow<HomeState> = _state.asStateFlow()

    fun onInputPhoneNumberChange(input: String) {
        _state.update {
            it.copy(inputPhoneNumber = input)
        }
    }

    fun validatePhoneNumber() {
        _state.update {
            it.copy(isLoading = true)
        }
        viewModelScope.launch {
            phoneValidationRepository.validatePhone("0318c606aa0e1ff2666fa359ccaef355", viewState.value.inputPhoneNumber).onSuccess { data ->
                _state.update {
                    it.copy(isValidPhoneNumber = data.valid, country = data.countryName, isLoading = false)
                }
            }.onFailure {
                _state.update {
                    it.copy(errorMessage = it.errorMessage, isLoading = false)
                }
            }
        }
    }
}