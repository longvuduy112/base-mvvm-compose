package com.longvuduy.basecompose.data.datasource.local.prefs

import com.longvuduy.basecompose.data.model.UserToken


interface SharedPrefsHelper {

    var currentUserToken: UserToken?

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String)
}
