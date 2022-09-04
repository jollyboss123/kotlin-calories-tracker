package com.example.calories_tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.calories_tracker.navigation.navigate
import com.example.core.navigation.Route
import com.example.onboarding_presentation.gender.GenderScreen
import com.example.onboarding_presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloriesTrackerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME,
                ) {
                    composable(Route.WELCOME)
                    {
                        WelcomeScreen(onNavigate = navController::navigate)
                    }

                    composable(Route.AGE)
                    {

                    }

                    composable(Route.GENDER)
                    {
                        GenderScreen(onNavigate = navController::navigate)
                    }

                    composable(Route.HEIGHT)
                    {

                    }

                    composable(Route.WEIGHT)
                    {

                    }

                    composable(Route.NUTRIENT_GOAL)
                    {

                    }

                    composable(Route.ACTIVITY)
                    {

                    }

                    composable(Route.GOAL)
                    {

                    }

                    composable(Route.TRACKER_OVERVIEW)
                    {

                    }

                    composable(Route.SEARCH)
                    {

                    }
                }
            }
        }
    }
}