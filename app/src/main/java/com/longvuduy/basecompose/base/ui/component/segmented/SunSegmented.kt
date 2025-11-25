package com.longvuduy.basecompose.base.ui.component.segmented

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.longvuduy.basecompose.base.ui.theme.SunTheme


@Composable
fun SunSegmented(
    colors: SunSegmentedColor,
    listSegments: List<ItemSunSegmentedModel>,
    onClick: (ItemSunSegmentedModel) -> Unit,
) {
    val shape = RoundedCornerShape(6.dp)
    val borderStroke = 1.dp
    Box(
        modifier = Modifier
            .clip(shape)
            .border(BorderStroke(borderStroke, color = colors.borderColor), shape)
            .background(colors.bgColor)
    ) {
        Row(Modifier.padding(2.dp)) {
            listSegments.forEach {
                SunSegmentedItem(it, colors, onClick)
            }
        }
    }
}

@Composable
fun SunSegmentedItem(
    item: ItemSunSegmentedModel,
    colors: SunSegmentedColor,
    onClick: (ItemSunSegmentedModel) -> Unit
) {
    val shape = RoundedCornerShape(6.dp)
    val borderStroke = 1.dp

    var bgColor = Color.Transparent
    var textColor = Color.Transparent
    when (item.state) {
        SunSegmentedState.ACTIVE -> {
            textColor = colors.textColorActive
            bgColor = colors.bgItemActiveColor
        }

        SunSegmentedState.INACTIVE -> {
            textColor = colors.textColorInactive
            bgColor = colors.bgItemInactiveColor
        }

        SunSegmentedState.DISABLE -> {
            textColor = colors.textColorDisable
            bgColor = colors.bgItemDisableColor
        }
    }
    Row(
        Modifier
            .clip(shape)
            .border(BorderStroke(borderStroke, color = colors.borderColor), shape)
            .background(bgColor)
            .padding(horizontal = 12.dp, vertical = 4.dp)
            .clickable(enabled = (item.state != SunSegmentedState.DISABLE)) {
                onClick.invoke(item)


            }
    ) {
        item.icon?.let {
            Image(
                painter = painterResource(it),
                contentDescription = null,
                modifier = Modifier.padding(end = 4.dp)
            )
        }
        Text(text = item.text, color = textColor, style = SunTheme.typography.bodyBaseBold)
    }
}

@Preview
@Composable
fun SunSegmentedPreview() {
    val list = mutableListOf(
        ItemSunSegmentedModel(
            "Label",
            state = SunSegmentedState.ACTIVE
        ),
        ItemSunSegmentedModel(
            "Label",
        ),
        ItemSunSegmentedModel(
            "Label",
            state = SunSegmentedState.DISABLE
        ),
        ItemSunSegmentedModel(
            "Label",
        ),
    )
    Box(modifier = Modifier.padding(16.dp)) {
        Column {
            SunSegmented(colors = SunSegmentedColorTypePrimary, listSegments = list) {}
            Spacer(Modifier.height(8.dp))
            SunSegmented(colors = SunSegmentedColorTypeSecondary, listSegments = list) {}
        }

    }
}
