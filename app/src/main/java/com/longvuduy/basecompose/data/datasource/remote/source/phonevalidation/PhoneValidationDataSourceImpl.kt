package com.longvuduy.basecompose.data.datasource.remote.source.phonevalidation

import com.longvuduy.basecompose.data.datasource.remote.model.response.PhoneValidationResponse
import com.longvuduy.basecompose.data.datasource.remote.service.PhoneValidationService
import javax.inject.Inject

class PhoneValidationDataSourceImpl @Inject constructor(
    private val phoneValidationService: PhoneValidationService
) : PhoneValidationDataSource {
    override suspend fun validatePhone(
        accessToken: String,
        phoneNumber: String
    ): PhoneValidationResponse =
        phoneValidationService.validatePhone(accessToken, phoneNumber)
}