// File: QuizScreen.kt
package com.neha.quizapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.neha.quizapp.model.getSampleQuestions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun QuizScreen(
    userName: String,
    age: Int,
    category: String,
    onQuizComplete: (Int) -> Unit
) {
    val questions = remember { getSampleQuestions(category, age) }

    var currentIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf(-1) }
    var timer by remember { mutableStateOf(10) }

    val coroutineScope = rememberCoroutineScope()

    // Start timer when a new question appears
    LaunchedEffect(currentIndex) {
        timer = 10
        selectedOption = -1
        while (timer > 0) {
            delay(1000)
            timer--
        }
        // Move to next question if no option was selected
        if (selectedOption == -1) currentIndex++
        if (currentIndex > questions.lastIndex) onQuizComplete(score)
    }

    val question = questions.getOrNull(currentIndex) ?: return

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header with user name and question count
            Text(
                text = "Hello $userName! Question ${currentIndex + 1}/${questions.size}",
                fontSize = 18.sp,
                color = Color.White
            )
            Spacer(Modifier.height(16.dp))

            // Timer
            Text(
                text = "Time Left: $timer",
                fontSize = 20.sp,
                color = Color(0xFFBB86FC)
            )
            Spacer(Modifier.height(16.dp))

            // Question card
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(24.dp)) {

                    // Question text
                    Text(
                        text = question.questionText,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(16.dp))

                    // Options
                    question.options.forEachIndexed { index, option ->
                        Button(
                            onClick = {
                                if (selectedOption == -1) {
                                    selectedOption = index
                                    if (index == question.correctAnswer) score++
                                    coroutineScope.launch {
                                        delay(500)
                                        currentIndex++
                                        if (currentIndex > questions.lastIndex) onQuizComplete(score)
                                    }
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = when {
                                    selectedOption == -1 -> Color(0xFF6200EE)
                                    index == selectedOption && index == question.correctAnswer -> Color(0xFF2E7D32) // Green
                                    index == selectedOption -> Color(0xFFD32F2F) // Red
                                    else -> Color.DarkGray
                                }
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                text = option,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}
