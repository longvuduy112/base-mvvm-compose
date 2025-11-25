package com.longvuduy.basecompose.data.datasource.remote.source.auth


import com.longvuduy.basecompose.data.datasource.remote.model.request.LoginBody
import com.longvuduy.basecompose.data.datasource.remote.model.response.LoginResponse
import com.longvuduy.basecompose.data.datasource.remote.service.AuthService
import javax.inject.Inject

class AuthRemoteDataSourceImpl @Inject constructor(
    private val authService: AuthService
) : AuthRemoteDataSource {
    override suspend fun login(body: LoginBody): LoginResponse = authService.login(body)
}
