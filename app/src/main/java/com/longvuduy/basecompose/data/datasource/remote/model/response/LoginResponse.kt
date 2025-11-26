package com.longvuduy.basecompose.data.datasource.remote.model.response

import com.google.gson.annotations.SerializedName

// Move this file to: data/model/remote/response/LoginResponse.kt
data class LoginResponse(
    @SerializedName("data")
    val data: LoginData? = null,
) {
    data class LoginData(
        @SerializedName("accessToken")
        val accessToken: String? = null,
        @SerializedName("refreshToken")
        val refreshToken: String? = null,)
}