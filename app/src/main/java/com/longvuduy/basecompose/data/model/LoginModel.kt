package com.longvuduy.basecompose.data.model

import com.longvuduy.basecompose.data.datasource.remote.model.response.LoginResponse

// Move this file to: data/model/domain/LoginModel.kt

class LoginModel(
    val data: LoginData? = null,
) {
    data class LoginData(
        val accessToken: String,
        val refreshToken: String,
    )
}

fun LoginResponse.toModel() = LoginModel(
    data = data?.toModel(),
)
fun LoginResponse.LoginData.toModel() = LoginModel.LoginData(
    accessToken = accessToken.orEmpty(),
    refreshToken = refreshToken.orEmpty(),
)
fun LoginModel.toUserToken() = data?.let {
    UserToken(
        accessToken = it.accessToken,
        refreshToken = it.refreshToken
    )
}
