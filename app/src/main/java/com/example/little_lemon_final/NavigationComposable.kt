package com.example.little_lemon_final

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.little_lemon_final.composables.Home
import com.example.little_lemon_final.composables.Profile
import com.example.little_lemon_final.composables.Onboarding

@Composable
fun NavigationComposable(context: Context,navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = determineStartDestination(context)
    ) {
        composable(Home.route) {
            Home(navController)
        }
        composable(Profile.route) {
            Profile(navController)
        }
        composable(Onboarding.route) {
            Onboarding(navController)
        }
    }
}

private fun determineStartDestination(context: Context): String {
    val sharedPreferences = context.getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)


    return if (sharedPreferences.getBoolean("userRegistered", false)) {
        Home.route
    }
    else{
        Onboarding.route
    }
}