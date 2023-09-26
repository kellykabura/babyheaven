package com.example.babyheaven.ui.theme.screens.home

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.babyheaven.R
import com.example.babyheaven.data.productviewmodel
import com.example.babyheaven.navigation.ROUTE_ABOUT
import com.example.babyheaven.navigation.ROUTE_ADD_PRODUCT
import com.example.babyheaven.navigation.ROUTE_LOGIN
import com.example.babyheaven.navigation.ROUTE_REGISTER
import com.example.babyheaven.navigation.ROUTE_VIEW_PRODUCT

@Composable
fun HomeScreen(navController:NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.baby),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var context = LocalContext.current
            var productdata = productviewmodel(navController, context)

            Text(
                text = "Welcome to the Baby Heaven",
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp

            )
            Image(
                painter = painterResource(id = R.drawable.bhlogo),
                contentDescription = stringResource(id = R.string.app_name),
                modifier = Modifier.size(128.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navController.navigate(ROUTE_ABOUT)
            }, modifier = Modifier.height(50.dp)) {
                Text(
                    text = "About",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = {
                    navController.navigate(ROUTE_LOGIN)
                }, modifier = Modifier.height(50.dp)) {
                    Text(
                        text = "Login",
                        color = Color.Cyan,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 20.sp
                    )

                    Spacer(modifier = Modifier.height(150.dp))
                }
                Button(onClick = {
                    navController.navigate(ROUTE_REGISTER)
                }, modifier = Modifier.height(50.dp)) {
                    Text(
                        text = "Register",
                        color = Color.Cyan,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 20.sp
                    )


                }

            }
        }
    }
}
    @Preview
    @Composable
    fun HomeScreen() {
        HomeScreen(rememberNavController())
    }

