package com.longvuduy.basecompose.data.repository.phonevalidation

import com.longvuduy.basecompose.data.model.PhoneValidationModel

interface PhoneValidationRepository {
    suspend fun validatePhone(accessToken: String, phoneNumber: String): Result<PhoneValidationModel>
}