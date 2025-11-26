package com.longvuduy.basecompose.data.datasource.local.source

import com.longvuduy.basecompose.data.datasource.local.model.PhoneNumberEntity

interface ContactLocalDataSource {
    suspend fun getContacts(): List<PhoneNumberEntity>
}