package com.example.babyheaven.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.babyheaven.ui.theme.screens.about.AboutApp
import com.example.babyheaven.ui.theme.screens.home.HomeScreen
import com.example.babyheaven.ui.theme.screens.login.LoginScreen
import com.example.babyheaven.ui.theme.screens.product.AddProductsScreen
import com.example.babyheaven.ui.theme.screens.product.UpdateProductsScreen
import com.example.babyheaven.ui.theme.screens.product.ViewProductsScreen
import com.example.babyheaven.ui.theme.screens.register.RegisterScreen
import com.example.babyheaven.ui.theme.screens.splash.Splash

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_HOME) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutApp(navController )

        }
        composable(ROUTE_HOME){
            HomeScreen(navController)

        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)

        }
        composable(ROUTE_SPLASH){
           Splash (navController)

        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController )

        }
        composable(ROUTE_UPDATE_PRODUCTS+"/{id}"){passedData->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)

        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController )

        }

    }

}