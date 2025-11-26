package com.longvuduy.basecompose.data.datasource.local.database

import android.content.Context
import androidx.room.Room
import com.longvuduy.basecompose.data.datasource.local.database.dao.PhoneNumberDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppDatabaseModule {
    private const val APP_DB_NAME = "app_database"

    @Provides
    @Singleton
    fun provideSmartCallerDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            APP_DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providePhoneNumberDao(db: AppDatabase): PhoneNumberDao {
        return db.phoneNumberDao()
    }
}
