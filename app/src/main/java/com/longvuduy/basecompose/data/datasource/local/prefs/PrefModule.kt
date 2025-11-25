package com.longvuduy.basecompose.data.datasource.local.prefs

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface PrefModule {
    @Binds
    @Singleton
    fun providePreferencesHelper(
        impl: SharedPrefsHelperImpl
    ): SharedPrefsHelper
}