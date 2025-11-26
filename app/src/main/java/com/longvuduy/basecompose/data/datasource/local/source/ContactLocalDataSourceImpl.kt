package com.longvuduy.basecompose.data.datasource.local.source

import com.longvuduy.basecompose.data.datasource.local.database.dao.PhoneNumberDao
import com.longvuduy.basecompose.data.datasource.local.model.PhoneNumberEntity
import jakarta.inject.Inject

class ContactLocalDataSourceImpl @Inject constructor(private val phoneNumberDao: PhoneNumberDao) :
    ContactLocalDataSource {
    override suspend fun getContacts(): List<PhoneNumberEntity> =
        phoneNumberDao.getListPhoneNumber()
}