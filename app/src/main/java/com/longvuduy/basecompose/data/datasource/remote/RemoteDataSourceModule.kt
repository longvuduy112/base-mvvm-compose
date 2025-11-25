package com.longvuduy.basecompose.data.datasource.remote

import com.longvuduy.basecompose.data.datasource.remote.source.auth.AuthRemoteDataSource
import com.longvuduy.basecompose.data.datasource.remote.source.auth.AuthRemoteDataSourceImpl
import com.longvuduy.basecompose.data.datasource.remote.source.phonevalidation.PhoneValidationDataSource
import com.longvuduy.basecompose.data.datasource.remote.source.phonevalidation.PhoneValidationDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RemoteDataSourceModule {
    @Binds
    @Singleton
    fun bindAuthRemoteDataSource(impl: AuthRemoteDataSourceImpl): AuthRemoteDataSource

    @Binds
    @Singleton
    fun bindPhoneValidationRemoteDataSource(impl: PhoneValidationDataSourceImpl): PhoneValidationDataSource
}
