package com.longvuduy.basecompose.data.repository.auth

import com.longvuduy.basecompose.data.IoDispatchers
import com.longvuduy.basecompose.data.datasource.local.prefs.SharedPrefsHelper
import com.longvuduy.basecompose.data.datasource.remote.model.request.LoginBody
import com.longvuduy.basecompose.data.datasource.remote.source.auth.AuthRemoteDataSource
import com.longvuduy.basecompose.data.model.LoginModel
import com.longvuduy.basecompose.data.model.toModel
import com.longvuduy.basecompose.data.model.toUserToken
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    @IoDispatchers
    private val ioDispatchers: CoroutineDispatcher,
    private val authRemoteDataSource: AuthRemoteDataSource,
    private val sharedPrefsHelper: SharedPrefsHelper
) : AuthRepository {
    override suspend fun login(body: LoginBody): Result<LoginModel> {
        return withContext(ioDispatchers) {
            runCatching {
                authRemoteDataSource.login(body)
                    .toModel()
            }.onSuccess {
                sharedPrefsHelper.currentUserToken = it.toUserToken()
            }
        }
    }
}