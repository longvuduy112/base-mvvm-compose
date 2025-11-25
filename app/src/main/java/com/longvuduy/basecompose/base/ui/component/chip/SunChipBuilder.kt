package com.longvuduy.basecompose.base.ui.component.chip

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.longvuduy.basecompose.base.ui.theme.SunTheme

val XSmallSunChipSize
    @Composable
    get() = SunChipSize(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
        textStyleActive = SunTheme.typography.bodyBaseBold,
        textStyleInactive = SunTheme.typography.bodyBaseRegular,
        iconSize = 12.dp
    )
val SmallSunChipSize
    @Composable
    get() = SunChipSize(
        modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
        textStyleInactive = SunTheme.typography.bodyBaseRegular,
        textStyleActive = SunTheme.typography.bodyBaseBold,
        iconSize = 16.dp
    )

data class SunChipSize(
    val modifier: Modifier,
    val textStyleActive: TextStyle,
    val textStyleInactive: TextStyle,
    val iconSize: Dp
)

data class SunChipColor(
    val textColorActiveDefault: Color,
    val borderColorActiveDefault: Color,
    val bgColorActiveDefault: Color,
    val textColorInactiveDefault: Color,
    val borderColorInactiveDefault: Color,
    val bgColorInactiveDefault: Color,
    val textColorActiveDisable: Color,
    val borderColorActiveDisable: Color,
    val bgColorActiveDisable: Color,
    val textColorInactiveDisable: Color,
    val borderColorInactiveDisable: Color,
    val bgColorInactiveDisable: Color
)

val SunChipColorDefault
@Composable
get() = SunChipColor(
    textColorActiveDefault = SunTheme.colorScheme.colorSchemeContent.contentBrandDefault,
    borderColorActiveDefault = SunTheme.colorScheme.colorSchemeBorder.borderBrandDefault,
    bgColorActiveDefault = SunTheme.colorScheme.colorSchemeBg.bgBrandSubtle,
    textColorInactiveDefault = SunTheme.colorScheme.colorSchemeContent.contentAliasDefault,
    borderColorInactiveDefault = Color.Transparent,
    bgColorInactiveDefault = SunTheme.colorScheme.colorSchemeBg.bgOpacityLight,
    textColorActiveDisable = SunTheme.colorScheme.colorSchemeContent.contentAliasDisable,
    borderColorActiveDisable = Color.Transparent,
    bgColorActiveDisable = SunTheme.colorScheme.colorSchemeBg.bgAlliasDisable,
    textColorInactiveDisable = SunTheme.colorScheme.colorSchemeContent.contentAliasDisable,
    bgColorInactiveDisable = SunTheme.colorScheme.colorSchemeBg.bgAlliasDisable,
    borderColorInactiveDisable = Color.Transparent
)