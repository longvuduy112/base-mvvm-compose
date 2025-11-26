package com.longvuduy.basecompose.data.datasource.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class PhoneNumberEntity(
    @PrimaryKey
    val id: Long = 0,
    val contactId: Long? = null,
    val phoneNumber: String,
    val formatNumber: String,
    val name: String,
    val email: String,
    val avatarUri: String,
    val isFavourite: Boolean
)

// Move this file to: data/model/database/PhoneNumberEntity.kt
