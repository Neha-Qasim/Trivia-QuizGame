
package com.neha.quizapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultScreen(score: Int, userName: String, onPlayAgain: () -> Unit) {
    val message = when {
        score == 5 -> "Outstanding, $userName! You nailed it! "
        score >= 3 -> "Great job, $userName! Keep practicing! "
        else -> "Don’t give up, $userName! Try again and learn more! "
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Trivia Results!",
                        fontSize = 20.sp,
                        fontWeight = MaterialTheme.typography.headlineLarge.fontWeight,
                        color = Color(0xFFBB86FC)
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        text = "$userName's Score:",
                        fontSize = 20.sp,
                        fontWeight = MaterialTheme.typography.headlineLarge.fontWeight,
                        color = Color(0xFFBB86FC)
                    )
                    Text(
                        text = "$score / 5",
                        fontSize = 24.sp,
                        fontWeight = MaterialTheme.typography.headlineLarge.fontWeight,
                        color = Color(0xFFBB86FC)
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        text = message,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }
            Spacer(Modifier.height(24.dp))
            Button(
                onClick = onPlayAgain,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE))
            ) {
                Text("Play Again", color = Color.White)
            }
        }
    }
}
