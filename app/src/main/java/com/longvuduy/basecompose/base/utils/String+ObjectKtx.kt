package com.longvuduy.basecompose.base.utils

import com.google.gson.Gson

inline fun <reified R> String?.toObject(): R? {
    return runCatching {
        Gson().fromJson(this, R::class.java)
    }.getOrNull()
}

fun Any.toJson(): String? {
    return runCatching {
        Gson().toJson(this)
    }.getOrNull()
}