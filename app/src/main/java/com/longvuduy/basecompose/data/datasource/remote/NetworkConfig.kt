package com.longvuduy.basecompose.data.datasource.remote
import com.longvuduy.basecompose.BuildConfig

object NetworkConfig {
    const val BASE_URL = BuildConfig.BASE_URL
    const val READ_TIMEOUT = 30L
    const val WRITE_TIMEOUT = 30L
    const val CONNECT_TIMEOUT = 30L
}