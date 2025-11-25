package com.longvuduy.basecompose.data.datasource.remote.source.auth

import com.longvuduy.basecompose.data.datasource.remote.model.request.LoginBody
import com.longvuduy.basecompose.data.datasource.remote.model.response.LoginResponse

interface AuthRemoteDataSource {
    suspend fun login(body: LoginBody): LoginResponse
}