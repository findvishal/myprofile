package com.example.myprofile
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myprofile.ui.theme.MyProfileTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(top = 24.dp, start = 20.dp)) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_plc_profile
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)

            ) {
                Text(
                    text = ""
                )
                Text(
                    text = ""
                )
                Text(
                    text = ""
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_edit),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row()
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(77.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(top = 24.dp, start = 20.dp)) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_coin
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)

            ) {
                Text(
                    text = "Coin Balance", fontSize = 12.sp, fontFamily = SansSerif, color = Color.LightGray
                )
                Text(
                    text = "256 Points", fontSize = 16.sp, fontFamily = SansSerif, color = Color.DarkGray
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_chevron_right),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row()
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(77.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(top = 24.dp, start = 28.dp), verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_myorders
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)

            ) {
                Text(
                    text = "My Orders", fontSize = 16.sp, fontFamily = SansSerif, color = Color.DarkGray, textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_chevron_right),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row()
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(77.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(top = 24.dp, start = 28.dp), verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_settings
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)

            ) {
                Text(
                    text = "Settings", fontSize = 16.sp, fontFamily = SansSerif, color = Color.DarkGray, textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_chevron_right),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row()
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(72.dp).padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){

            Button(
                onClick = {
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.fillMaxWidth().height(72.dp),
                enabled = true,
                border = BorderStroke(width = 1.dp, brush = SolidColor(Color.White)),
                shape = MaterialTheme.shapes.medium,
            )
            {
                Text(text = "Log Out", color = Color.Red)
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyProfileTheme {
        Greeting()
    }
}