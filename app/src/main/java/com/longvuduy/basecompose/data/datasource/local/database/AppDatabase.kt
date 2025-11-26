package com.longvuduy.basecompose.data.datasource.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.longvuduy.basecompose.data.datasource.local.database.dao.PhoneNumberDao
import com.longvuduy.basecompose.data.datasource.local.model.PhoneNumberEntity

@Database(
    entities = [
        PhoneNumberEntity::class,
    ],
    version = 1,
    exportSchema = false,
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun phoneNumberDao(): PhoneNumberDao
}