package ir.teamix.dordor.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ir.teamix.dordor.R

@Composable
fun ScreenHome(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        WithRtlDirection(modifier = modifier, innerPadding = innerPadding) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.background),
                        contentScale = ContentScale.Crop
                    )
            ) {

            }
        }
    }
}

@Preview()
@Composable
private fun ScreenHomePrev() {
    ScreenHome()
}