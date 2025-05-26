package ir.teamix.dordor.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.kaaveh.sdpcompose.sdp
import ir.teamix.dordor.R
import ir.teamix.dordor.ui.theme.Begonia
import ir.teamix.dordor.ui.theme.Crayola
import ir.teamix.dordor.ui.theme.Desire
import ir.teamix.dordor.ui.theme.JellyBeanBlue
import ir.teamix.dordor.ui.theme.Pink40
import ir.teamix.dordor.ui.theme.Pumpkin
import ir.teamix.dordor.ui.theme.White
import ir.teamix.dordor.ui.theme.buttonSize
import ir.teamix.dordor.ui.theme.iconSize
import ir.teamix.dordor.ui.theme.spaceBetweenButtons

@Composable
fun ScreenHome(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        WithRtlDirection(modifier = modifier, innerPadding = innerPadding) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.background),
                        contentScale = ContentScale.Crop
                    )
            ) {
                Row(modifier = modifier.fillMaxWidth()) {
                    //money
                    BalanceOfMoney()
                }
                Column(
                    modifier = modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    Alignment.CenterHorizontally
                ) {
                    //button
                    Buttons()
                }
            }
        }
    }
}


@Composable
fun BalanceOfMoney(modifier: Modifier = Modifier) {

}

@Composable
fun Buttons(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(spaceBetweenButtons())) {
        Box(
            modifier = modifier
                .size(buttonSize())
                .rotate(-5f)
                .clickable {},
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_button),
                contentDescription = "buttonPlay",
                modifier = modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Desire)
            )
            Icon(
                painter = painterResource(R.drawable.icon_play),
                contentDescription = "iconPlay",
                modifier = modifier
                    .size(iconSize())
                    .rotate(5f),
                tint = White
            )
        }
        Box(
            modifier = modifier
                .size(buttonSize())
                .clickable {}
                .rotate(50f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_button),
                contentDescription = "buttonSetting",
                modifier = modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Crayola)
            )
            Icon(
                painter = painterResource(R.drawable.icon_setting),
                contentDescription = "iconSetting",
                modifier = modifier.size(iconSize()),
                tint = White
            )
        }
        Box(
            modifier = modifier
                .size(buttonSize())
                .rotate(180f)
                .clickable {},
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_button),
                contentDescription = "buttonShop",
                modifier = modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(JellyBeanBlue)
            )
            Icon(
                painter = painterResource(R.drawable.icon_shop),
                contentDescription = "iconShop",
                modifier = modifier
                    .size(iconSize())
                    .rotate(-180f),
                tint = White
            )
        }
        Box(
            modifier = modifier
                .size(buttonSize())
                .rotate(25f)
                .clickable {},
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_button),
                contentDescription = "buttonInfo",
                modifier = modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Begonia)
            )
            Icon(
                painter = painterResource(R.drawable.icon_info),
                contentDescription = "iconInfo",
                modifier = modifier
                    .size(iconSize())
                    .rotate(-25f),
                tint = White
            )
        }
        Box(
            modifier = modifier
                .size(buttonSize())
                .clickable {},
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_button),
                contentDescription = "buttonGame",
                modifier = modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Pumpkin)
            )
            Icon(
                painter = painterResource(R.drawable.icon_game),
                contentDescription = "iconGame",
                modifier = modifier.size(iconSize()),
                tint = White
            )
        }

    }

}


@Preview()
@Composable
private fun ScreenHomePrev() {
    ScreenHome()
}