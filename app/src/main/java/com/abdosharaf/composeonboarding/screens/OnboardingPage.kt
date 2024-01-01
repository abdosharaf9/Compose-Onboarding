package com.abdosharaf.composeonboarding.screens

import androidx.annotation.DrawableRes
import com.abdosharaf.composeonboarding.R

sealed class OnboardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    data object FirstPage : OnboardingPage(
        image = R.drawable.first,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    data object SecondPage : OnboardingPage(
        image = R.drawable.second,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    data object ThirdPage : OnboardingPage(
        image = R.drawable.third,
        title = "Dialogue",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )
}