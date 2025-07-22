
package com.neha.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.neha.quizapp.ui.QuizScreen
import com.neha.quizapp.ui.ResultScreen
import com.neha.quizapp.ui.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                QuizApp()
            }
        }
    }
}

@Composable
fun QuizApp() {
    val navController = rememberNavController()
    var userName by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var age by remember { mutableStateOf(0) }

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {
        composable("start") {
            WelcomeScreen { name, selectedCategory, enteredAge ->
                userName = name
                category = selectedCategory
                age = enteredAge
                navController.navigate("quiz")
            }
        }

        composable("quiz") {
            QuizScreen(userName, age, category) { score ->
                navController.navigate("result/$score")
            }
        }

        composable(
            route = "result/{score}",
            arguments = listOf(navArgument("score") { type = NavType.IntType })
        ) { backStackEntry ->
            val score = backStackEntry.arguments?.getInt("score") ?: 0
            ResultScreen(score = score, userName = userName) {
                navController.popBackStack("start", inclusive = false)
            }
        }
    }
}
