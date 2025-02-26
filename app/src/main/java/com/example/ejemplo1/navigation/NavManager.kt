package com.example.ejemplo1.navigation

import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home")
    {
        composable(route: "Home")
        {

        }
    }
}

