package com.longvuduy.basecompose.data.repository.auth

import com.longvuduy.basecompose.data.datasource.remote.model.request.LoginBody
import com.longvuduy.basecompose.data.model.LoginModel

interface AuthRepository {
    suspend fun login(body: LoginBody): Result<LoginModel>
}