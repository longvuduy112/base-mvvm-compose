package com.longvuduy.basecompose.data.datasource.remote

import com.longvuduy.basecompose.data.datasource.local.prefs.SharedPrefsHelper
import jakarta.inject.Inject
import jakarta.inject.Singleton
import okhttp3.Interceptor
import okhttp3.Response

@Singleton
class AuthInterceptor @Inject constructor(
    private val sharedPrefsHelper: SharedPrefsHelper
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val token = sharedPrefsHelper.getAccessToken()

        val newRequest = request.newBuilder().apply {
            if (!token.isNullOrEmpty()) {
                header("Authorization", "Bearer $token")
            }
        }.build()
        return chain.proceed(newRequest)
    }
}