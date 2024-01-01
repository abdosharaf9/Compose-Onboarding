package com.abdosharaf.composeonboarding.navigation

sealed class Screen(val route: String) {
    data object Onboarding: Screen(route = "onboarding_screen")
    data object Home: Screen(route = "home_screen")
}