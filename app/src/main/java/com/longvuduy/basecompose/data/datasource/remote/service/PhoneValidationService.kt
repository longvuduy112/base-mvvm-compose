package com.longvuduy.basecompose.data.datasource.remote.service

import com.longvuduy.basecompose.data.datasource.remote.model.response.PhoneValidationResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PhoneValidationService {
    @GET("validate")
    suspend fun validatePhone(
        @Query("access_key") accessToken: String,
        @Query("number") phoneNumber: String,
    ): PhoneValidationResponse
}