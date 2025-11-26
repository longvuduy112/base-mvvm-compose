package com.longvuduy.basecompose.data.datasource.remote.model.request

import com.google.gson.annotations.SerializedName

// Move this file to: data/model/remote/request/LoginBody.kt
data class LoginBody(
    @SerializedName("idToken")
    val idToken: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
)
