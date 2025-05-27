package ir.teamix.dordor.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp
import ir.teamix.dordor.R
import ir.teamix.dordor.ui.theme.Begonia
import ir.teamix.dordor.ui.theme.Crayola
import ir.teamix.dordor.ui.theme.Desire
import ir.teamix.dordor.ui.theme.JellyBeanBlue
import ir.teamix.dordor.ui.theme.JungleGreen
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
    Box(
        modifier = modifier
            .padding(start = 20.dp)
            .width(80.sdp)
            .height(20.sdp),
        contentAlignment = Alignment.Center
    ) {
        // پس‌زمینه کارت
        Image(
            painter = painterResource(R.drawable.background_balance_money),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        // عدد وسط
        Text(
            text = "9999",
            color = White,
            fontSize = 10.ssp,
            modifier = Modifier.align(Alignment.Center)
        )

        // آیکن پول سمت چپ بصری (در RTL میشه End)
        Image(
            painter = painterResource(R.drawable.icon_money),
            contentDescription = "money",
            modifier = Modifier
                .size(30.sdp)
                .align(Alignment.CenterEnd)
                .offset(x = 12.dp) // بیرون زدگی به سمت چپ (در RTL)
        )

        // آیکن + سمت راست بصری (در RTL میشه Start)
        ElevatedButton(
            onClick = {},
            modifier = modifier
                .size(15.sdp)
                .align(Alignment.CenterStart)
                .offset(x = (-6).dp),
            shape = CircleShape,
            elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 2.sdp),
            colors = ButtonDefaults.buttonColors(containerColor = JungleGreen),
            border = BorderStroke(width = 1.sdp, color = White),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Add,
                contentDescription = "iconAdd",
                modifier = modifier.size(10.sdp),
                tint = White
            )
        }
    }
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