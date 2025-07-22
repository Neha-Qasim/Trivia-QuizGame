# 🎮 Trivia - Jetpack Compose Quiz App

Welcome to **Trivia**, a modern, age-intelligent quiz app built with **Jetpack Compose**!
Designed for fun and learning across all age groups, 
Trivia challenges users with engaging multiple-choice questions filtered by age and category – a
ll in a sleek dark-themed UI.

---

##  Features

### 👤 User Personalization
- Enter your **name** and **age**
- Choose your desired **quiz category**
- Get a **personalized welcome** with motivational quotes
  ![image alt](https://github.com/Neha-Qasim/Trivia-QuizGame/blob/3a84c1c0d934f4557915ca34cc02a94f7b9d8564/Screenshot%202025-07-22%20123621.png)
  

### 🧠 Smart Questioning
- **Age-based difficulty levels**
  - Ages 3–8
  - Ages 9–14
  - Ages 15–20
  - Ages 21–26
  - Ages 27+
- **7 quiz categories**: Math, Science, History, Tech, General Knowledge, Gaming, Sports
- **5 questions** per quiz session

### ⏱️ Game Mechanics
- One question at a time
- **10-second countdown timer** for each question
- **Auto-skip** when time runs out
- **Real-time score tracking**

### 🧾 Result Summary
- Final score display
- Feedback based on performance
- Option to **play again**

---

## 🎨 UI & Design

- ✨ **Modern card-style layout**
- 🌙 **Dark theme** with deep purple accents
- 🔤 Bold and readable fonts
- 🧭 **Smooth screen transitions**
- 📱 Fully responsive on different screen sizes

---

## 🛠️ Tech Stack

- 💻 **Kotlin**
- 🧱 **Jetpack Compose**
- 🔄 **State Management** using `remember`, `mutableStateOf`
- 🔁 **Coroutines & LaunchedEffect** for countdowns
- 📦 **Jetpack Navigation** for multi-screen flow

---

## 📂 Project Structure

```bash
📁 com.neha.quizapp
├── MainActivity.kt
├── ui/
│   ├── WelcomeScreen.kt
│   ├── CategorySelectionScreen.kt
│   ├── QuizScreen.kt
│   ├── ResultScreen.kt
│   └── components/
├── data/
│   └── Questions.kt
└── theme/
    └── Theme.kt

