package com.longvuduy.basecompose.data.datasource.remote.model.response

import com.google.gson.annotations.SerializedName

data class PhoneValidationResponse(
    @SerializedName("valid")
    val valid: Boolean? = null,
    @SerializedName("number")
    val number: String? = null,
    @SerializedName("local_format")
    val localFormat: String? = null,
    @SerializedName("international_format")
    val internationalFormat: String? = null,
    @SerializedName("country_prefix")
    val countryPrefix: String? = null,
    @SerializedName("country_code")
    val countryCode: String? = null,
    @SerializedName("country_name")
    val countryName: String? = null,
    @SerializedName("location")
    val location: String? = null,
    @SerializedName("carrier")
    val carrier: String? = null,
    @SerializedName("line_type")
    val lineType: String? = null
)
