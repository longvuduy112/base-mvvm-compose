package com.longvuduy.basecompose.data.datasource.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.longvuduy.basecompose.data.model.UserToken
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import androidx.core.content.edit
import com.longvuduy.basecompose.base.utils.toJson
import com.longvuduy.basecompose.base.utils.toObject

@Singleton
class SharedPrefsHelperImpl @Inject constructor(
    @ApplicationContext
    private val context: Context
) : SharedPrefsHelper {

    companion object {
        private const val SHARED_PREF_NAME = "app-shared-preference"

        private const val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private const val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"

        private const val CURRENT_USER_TOKEN = "PREF_KEY_CURRENT_USER_TOKEN"
    }

    private val mSharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    override var currentUserToken: UserToken?
        get() = mSharedPreferences
            .getString(CURRENT_USER_TOKEN, null)
            ?.toObject<UserToken>()
        set(value) {
            mSharedPreferences.edit { putString(CURRENT_USER_TOKEN, value?.toJson()) }
        }

    override fun getAccessToken() = currentUserToken?.accessToken

    override fun setAccessToken(accessToken: String) {
        mSharedPreferences.edit { putString(PREF_KEY_ACCESS_TOKEN, accessToken) }
    }
}
