package com.longvuduy.basecompose.data.model

import com.longvuduy.basecompose.data.datasource.remote.model.response.PhoneValidationResponse


data class PhoneValidationModel(
    val valid: Boolean,
    val number: String,
    val localFormat: String,
    val internationalFormat : String,
    val countryPrefix: String,
    val countryCode: String,
    val countryName: String,
    val location: String,
    val carrier: String,
    val lineType: String,
)
fun PhoneValidationResponse.toModel() = PhoneValidationModel(
    valid = valid ?: false,
    number = number.orEmpty(),
    localFormat = localFormat.orEmpty(),
    internationalFormat = internationalFormat.orEmpty(),
    countryPrefix = countryPrefix.orEmpty(),
    countryCode = countryCode.orEmpty(),
    countryName = countryName.orEmpty(),
    location = location.orEmpty(),
    carrier = carrier.orEmpty(),
    lineType = lineType.orEmpty()
)