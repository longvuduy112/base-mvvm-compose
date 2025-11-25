package com.longvuduy.basecompose.data.datasource.remote.source.phonevalidation

import com.longvuduy.basecompose.data.datasource.remote.model.response.PhoneValidationResponse

interface PhoneValidationDataSource {
    suspend fun validatePhone(accessToken: String, phoneNumber: String): PhoneValidationResponse
}