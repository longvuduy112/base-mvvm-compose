package com.longvuduy.basecompose.base.ui.component.segmented

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.longvuduy.basecompose.base.ui.theme.SunTheme

data class ItemSunSegmentedModel(
    val text: String,
    val icon: Int? = null,
    val state: SunSegmentedState = SunSegmentedState.INACTIVE
)

val SunSegmentedColorTypePrimary
    @Composable
    get() = SunSegmentedColor(
        borderColor = Color.Transparent,
        bgColor = SunTheme.colorScheme.colorSchemeBg.bgOpacityLight,
        bgItemActiveColor = SunTheme.colorScheme.colorSchemeBg.bgBrandActive,
        bgItemInactiveColor = Color.Transparent,
        bgItemDisableColor = Color.Transparent,
        textColorActive = SunTheme.colorScheme.colorSchemeContent.contentAliasWhite,
        textColorInactive = SunTheme.colorScheme.colorSchemeContent.contentAliasDefault,
        textColorDisable = SunTheme.colorScheme.colorSchemeContent.contentAliasDisable
    )
val SunSegmentedColorTypeSecondary
    @Composable
    get() = SunSegmentedColor(
        borderColor = Color.Transparent,
        bgColor = SunTheme.colorScheme.colorSchemeBg.bgOpacityLight,
        bgItemActiveColor = SunTheme.colorScheme.colorSchemeBg.bgAlliasFloating,
        bgItemInactiveColor = Color.Transparent,
        bgItemDisableColor = Color.Transparent,
        textColorActive = SunTheme.colorScheme.colorSchemeContent.contentAliasDefault,
        textColorInactive = SunTheme.colorScheme.colorSchemeContent.contentAliasDefault,
        textColorDisable = SunTheme.colorScheme.colorSchemeContent.contentAliasDisable
    )

data class SunSegmentedColor(
    val borderColor: Color,
    val bgColor: Color,
    val bgItemActiveColor: Color,
    val bgItemInactiveColor: Color,
    val bgItemDisableColor: Color,
    val textColorActive: Color,
    val textColorInactive: Color,
    val textColorDisable: Color,
)

enum class SunSegmentedState {
    ACTIVE, INACTIVE, DISABLE
}