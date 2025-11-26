package com.longvuduy.basecompose.data.datasource.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.longvuduy.basecompose.data.datasource.local.model.PhoneNumberEntity

@Dao
interface PhoneNumberDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(table: PhoneNumberEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserts(tables: List<PhoneNumberEntity>)

    @Query("SELECT * FROM PhoneNumberEntity")
    suspend fun getListPhoneNumber(): List<PhoneNumberEntity>

    @Query("DELETE FROM PhoneNumberEntity")
    suspend fun deleteAll()
}
