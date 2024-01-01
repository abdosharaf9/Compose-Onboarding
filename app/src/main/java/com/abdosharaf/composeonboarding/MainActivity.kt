package com.abdosharaf.composeonboarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.abdosharaf.composeonboarding.navigation.SetupNavigation
import com.abdosharaf.composeonboarding.ui.theme.ComposeOnboardingTheme
import com.abdosharaf.composeonboarding.viewmodels.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val splashViewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }

        setContent {
            ComposeOnboardingTheme {
                val screen by splashViewModel.startDestination
                val navController = rememberNavController()
                SetupNavigation(navController = navController, startDestination = screen)
            }
        }
    }
}