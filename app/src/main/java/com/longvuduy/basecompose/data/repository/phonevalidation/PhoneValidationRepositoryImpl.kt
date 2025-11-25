package com.longvuduy.basecompose.data.repository.phonevalidation

import com.longvuduy.basecompose.data.IoDispatchers
import com.longvuduy.basecompose.data.datasource.remote.source.phonevalidation.PhoneValidationDataSource
import com.longvuduy.basecompose.data.model.PhoneValidationModel
import com.longvuduy.basecompose.data.model.toModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PhoneValidationRepositoryImpl @Inject constructor(
    @IoDispatchers
    private val ioDispatchers: CoroutineDispatcher,
    private val phoneValidationDataSource: PhoneValidationDataSource
) : PhoneValidationRepository {
    override suspend fun validatePhone(
        accessToken: String,
        phoneNumber: String
    ): Result<PhoneValidationModel> {
        return withContext(ioDispatchers) {
            runCatching {
                phoneValidationDataSource.validatePhone(accessToken, phoneNumber)
                    .toModel()
            }
        }
    }
}