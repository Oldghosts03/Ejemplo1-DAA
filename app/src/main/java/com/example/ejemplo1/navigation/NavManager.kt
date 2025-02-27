package com.example.ejemplo1.navigation

import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home")
    {
        composable("Home"){

    }
    }
}

