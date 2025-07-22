
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

@Composable
fun WelcomeScreen(
    onStartQuiz: (String, String, Int) -> Unit
) {
    var name by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("") }
    var ageInput by remember { mutableStateOf("") }

    // Validate input: all fields must be filled and age must be a valid number
    val isInputValid = name.isNotBlank() && selectedCategory.isNotBlank() && ageInput.toIntOrNull() != null

    // Randomly display a motivational quote
    val motivationalQuotes = listOf(
        "Believe in yourself!",
        "Keep going, you're doing great!",
        "Every step brings progress.",
        "Knowledge is power!",
        "You got this!",
        "Learning is a journey, not a race."
    )
    val displayedQuote = remember { motivationalQuotes.random() }

    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF121212)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(720.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Welcome to Trivia!",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(10.dp))

                    Text(
                        text = displayedQuote,
                        color = Color.LightGray,
                        fontSize = 14.sp
                    )

                    Spacer(Modifier.height(24.dp))

                    // Name Input
                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Your name") },
                        modifier = Modifier.fillMaxWidth(),
                        colors = inputFieldColors()
                    )

                    Spacer(Modifier.height(12.dp))

                    // Age Input
                    OutlinedTextField(
                        value = ageInput,
                        onValueChange = { ageInput = it },
                        label = { Text("Your age") },
                        modifier = Modifier.fillMaxWidth(),
                        colors = inputFieldColors()
                    )

                    Spacer(Modifier.height(24.dp))

                    // Category Selection
                    Text("Pick a category", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                    Spacer(Modifier.height(12.dp))

                    val categories = listOf(
                        "Math", "Science", "History",
                        "Tech", "General Knowledge", "Gaming", "Sports"
                    )

                    CategoryGrid(categories, selectedCategory) { selectedCategory = it }

                    Spacer(Modifier.height(32.dp))

                    // Start Quiz Button
                    Button(
                        onClick = { if (isInputValid) onStartQuiz(name, selectedCategory, ageInput.toInt()) },
                        enabled = isInputValid,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE))
                    ) {
                        Text("Start Quiz", color = Color.White, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

// Custom Composable to show categories in rows
@Composable
fun CategoryGrid(
    options: List<String>,
    selected: String,
    onSelect: (String) -> Unit
) {
    val rows = options.chunked(2)
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        rows.forEach { row ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                row.forEach { item ->
                    CategoryButton(label = item, isSelected = selected == item) {
                        onSelect(item)
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.CategoryButton(label: String, isSelected: Boolean, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) Color(0xFF03DAC5) else Color(0xFF6D6D6D)
        ),
        modifier = Modifier
            .weight(1f)
            .padding(horizontal = 4.dp)
    ) {
        Text(label, color = Color.White)
    }
}

// Centralized colors for text fields
@Composable
fun inputFieldColors() = OutlinedTextFieldDefaults.colors(
    unfocusedBorderColor = Color.White,
    focusedBorderColor = Color.White,
    cursorColor = Color.White,
    focusedLabelColor = Color.White,
    unfocusedLabelColor = Color.White,
    unfocusedTextColor = Color(0xFFBB86FC),
    focusedTextColor = Color(0xFFBB86FC)
)
