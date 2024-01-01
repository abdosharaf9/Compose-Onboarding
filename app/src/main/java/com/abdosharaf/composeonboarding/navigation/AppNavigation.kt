package com.abdosharaf.composeonboarding.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abdosharaf.composeonboarding.screens.HomeScreen
import com.abdosharaf.composeonboarding.screens.OnboardingScreen

@Composable
fun SetupNavigation(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(route = Screen.Onboarding.route) {
            OnboardingScreen(navController = navController)
        }

        composable(route = Screen.Home.route) {
            HomeScreen()
        }
    }
}