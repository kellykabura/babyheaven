package com.example.babyheaven.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babyheaven.R
import com.example.babyheaven.navigation.ROUTE_HOME



@Composable
fun AboutApp(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.babieshs),
            contentDescription ="Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize() )
    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

         Image(
        painter = painterResource(id = R.drawable.bhlogo),
        contentDescription = stringResource(id = R.string.app_name),
        modifier = Modifier.size(128.dp)

         )
        Text(
            text = "Baby Heaven",
            color = Color.Black,
            fontSize = 40.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.bhlogo),
                contentDescription =null,
                Modifier.size(25.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "About The App",
                color = Color.Red,
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(color = Color.White, thickness = 2.dp, modifier = Modifier.padding(10.dp))

        Text(
            textAlign = TextAlign.Center,
            text = "Baby Heaven is an online baby shop that has all products that babies need. ",
            color = Color.Black,
            fontSize = 20.sp
        )

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.bhlogo),
                contentDescription =null,
                Modifier.size(25.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "The Creator",
                color = Color.Red,
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(color = Color.White, thickness = 2.dp, modifier = Modifier.padding(10.dp))

        Text(
            textAlign = TextAlign.Center,
            text = "The application was created by Kelly Kigotho, an eMobilis Student, with some assistance from his instructor , Mr.Eric Were. ",
            color = Color.Black,
            fontSize = 20.sp
        )

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.bhlogo),
                contentDescription =null,
                Modifier.size(25.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Its Aims",
                color = Color.Red,
                fontSize = 20.sp,
                textAlign = TextAlign.Left,
                fontFamily = FontFamily.SansSerif
            )
        }
        Divider(color = Color.White, thickness = 2.dp, modifier = Modifier.padding(10.dp))

        Text(
            textAlign = TextAlign.Center,
            text = "The application is created to be able to add, view and update baby products ." +
                    "It will hopefully assist mothers in buying baby products and ease in shopping while creating more time to do other things",
            color = Color.Black,
            fontSize = 20.sp
        )

        Divider(color = Color.White, thickness = 2.dp, modifier = Modifier.padding(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Wanna go back?",
                color = Color.Cyan,
                fontSize = 15.sp
            )
            TextButton(onClick = {navController.navigate(ROUTE_HOME)}) {
                Text(text = "Back to Home",
                    fontSize = 15.sp,
                    color = Color.Blue
                )
            }



        }


    }
}

@Preview
@Composable
fun AboutApp(){
    AboutApp(rememberNavController())
  }