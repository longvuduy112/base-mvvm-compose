package com.longvuduy.basecompose.data.datasource.remote.service

import com.longvuduy.basecompose.data.datasource.remote.model.request.LoginBody
import com.longvuduy.basecompose.data.datasource.remote.model.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
    suspend fun login(@Body body: LoginBody): LoginResponse
}