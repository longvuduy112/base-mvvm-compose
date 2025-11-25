package com.longvuduy.basecompose.data.repository

import com.longvuduy.basecompose.data.repository.auth.AuthRepository
import com.longvuduy.basecompose.data.repository.auth.AuthRepositoryImpl
import com.longvuduy.basecompose.data.repository.phonevalidation.PhoneValidationRepository
import com.longvuduy.basecompose.data.repository.phonevalidation.PhoneValidationRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindAuthRepository(impl: AuthRepositoryImpl): AuthRepository

    @Binds
    @Singleton
    fun bindPhoneValidationRepository(impl: PhoneValidationRepositoryImpl): PhoneValidationRepository
}
