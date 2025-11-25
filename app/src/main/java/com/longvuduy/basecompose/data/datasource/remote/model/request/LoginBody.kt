package com.longvuduy.basecompose.data.datasource.remote.model.request

import com.google.gson.annotations.SerializedName

data class LoginBody(
    @SerializedName("idToken")
    val idToken: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
)
