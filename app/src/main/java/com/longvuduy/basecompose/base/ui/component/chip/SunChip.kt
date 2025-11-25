package com.longvuduy.basecompose.base.ui.component.chip

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.longvuduy.basecompose.base.ui.theme.SunTheme

enum class SunChipState {
    DEFAULT, DISABLE
}

@Composable
fun DChip(
    text: String,
    state: SunChipState = SunChipState.DEFAULT,
    size: SunChipSize = XSmallSunChipSize,
    colors: SunChipColor = SunChipColorDefault,
    leadingIcon: Int? = null,
    trailingIcon: Int? = null,
    isActive: Boolean = true,
    onClickRemove: (() -> Unit)? = null
) {
    val shape = RoundedCornerShape(16.dp)
    val borderStroke = 1.dp
    val borderColor = if (isActive)  {
        when (state) {
            SunChipState.DEFAULT -> colors.borderColorActiveDefault
            SunChipState.DISABLE -> colors.borderColorActiveDisable
        }
    } else  {
        when (state) {
            SunChipState.DEFAULT -> colors.borderColorInactiveDefault
            SunChipState.DISABLE -> colors.borderColorInactiveDisable
        }
    }
    val textColor = if (isActive)  {
        when (state) {
            SunChipState.DEFAULT -> colors.textColorActiveDefault
            SunChipState.DISABLE -> colors.textColorActiveDisable
        }
    } else  {
        when (state) {
            SunChipState.DEFAULT -> colors.textColorInactiveDefault
            SunChipState.DISABLE -> colors.textColorInactiveDisable
        }
    }
    val bgColor = if (isActive)  {
        when (state) {
            SunChipState.DEFAULT -> colors.bgColorActiveDefault
            SunChipState.DISABLE -> colors.bgColorActiveDisable
        }
    } else  {
        when (state) {
            SunChipState.DEFAULT -> colors.bgColorInactiveDefault
            SunChipState.DISABLE -> colors.bgColorInactiveDisable
        }
    }

    Box(
        modifier = Modifier
            .clip(shape)
            .border(BorderStroke(borderStroke, borderColor), shape)
            .background(color = bgColor)
    ) {
        Row(modifier = size.modifier, verticalAlignment = Alignment.CenterVertically) {
            leadingIcon?.let {
                Image(
                    painter = painterResource(it), contentDescription = null,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Text(
                text = text,
                style = if (isActive) size.textStyleActive else size.textStyleInactive,
                color = textColor
            )
            trailingIcon?.let {
                Image(
                    painter = painterResource(it), contentDescription = null,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            if (onClickRemove != null) {
                Image(
                    painter = painterResource(SunTheme.icon.suggestedMark),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 4.dp).size(size.iconSize)
                        .clickable {
                            onClickRemove.invoke()
                        }
                )
            }
        }
    }
}

@Preview
@Composable
fun DChipPreview() {
    Row {
        DChip(
            state = SunChipState.DISABLE,
            isActive = false,
            text = "Text"
        )
        Spacer(modifier = Modifier.width(8.dp))
        DChip(
            isActive = true,
            text = "Text"
        )
    }
}
