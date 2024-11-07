package com.example.loginsignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginsignup.Screens.IntroductionScreen
import com.example.loginsignup.Screens.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val navController = rememberNavController()
//            NavHost(
//                navController = navController,
//                startDestination = "introduction_screen"
//            ) {
//                composable("introduction_screen") {
//                    IntroductionScreen(navController = navController)
//                }
//                composable("login_screen") {
//                    LoginScreen()
//                }
//
//            }
            LoginScreen()
        }
    }
}

