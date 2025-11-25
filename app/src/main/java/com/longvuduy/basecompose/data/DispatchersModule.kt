package com.longvuduy.basecompose.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Qualifier
import kotlinx.coroutines.Dispatchers

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IoDispatchers

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultDispatchers

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UnconfinedDispatchers

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainDispatchers

@Module
@InstallIn(SingletonComponent::class)
class DispatchersModule {
    @Provides
    @IoDispatchers
    fun ioDispatcher() = Dispatchers.IO

    @Provides
    @DefaultDispatchers
    fun defaultDispatchers() = Dispatchers.Default

    @Provides
    @UnconfinedDispatchers
    fun unconfinedDispatchers() = Dispatchers.Unconfined

    @Provides
    @MainDispatchers
    fun mainDispatchers() = Dispatchers.Main
}
