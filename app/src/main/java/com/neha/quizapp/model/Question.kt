// File: Question.kt
package com.neha.quizapp.model

data class Question(
    val questionText: String,
    val options: List<String>,
    val correctAnswer: Int,
    val category: String,
    val ageRange: IntRange
)

fun getSampleQuestions(category: String, age: Int): List<Question> {
    return when (category) {
        "Math" -> listOf(
            Question("What is 2 + 3?", listOf("4", "5", "6", "3"), 1, "Math", 3..8),
            Question("What is 9 - 2?", listOf("6", "5", "7", "8"), 2, "Math", 3..8),
            Question("What number comes after 6?", listOf("5", "6", "7", "8"), 2, "Math", 3..8),
            Question("What is 4 + 4?", listOf("6", "8", "7", "9"), 1, "Math", 3..8),
            Question("What is 3 x 2?", listOf("6", "5", "4", "7"), 0, "Math", 3..8),

            Question("What is 15 / 3?", listOf("5", "6", "4", "3"), 0, "Math", 9..14),
            Question("What is 7 x 6?", listOf("42", "36", "48", "40"), 0, "Math", 9..14),
            Question("What is 25 - 10?", listOf("15", "10", "20", "5"), 0, "Math", 9..14),
            Question("What is 12 + 11?", listOf("21", "23", "22", "24"), 1, "Math", 9..14),
            Question("What is 8 x 4?", listOf("36", "30", "32", "28"), 2, "Math", 9..14),

            Question("What is the square of 6?", listOf("36", "30", "42", "24"), 0, "Math", 15..20),
            Question("What is the cube of 3?", listOf("6", "9", "27", "18"), 2, "Math", 15..20),
            Question("What is √49?", listOf("6", "8", "7", "9"), 2, "Math", 15..20),
            Question("What is 100 - 45?", listOf("55", "60", "65", "50"), 0, "Math", 15..20),
            Question("What is 14 x 2?", listOf("26", "28", "30", "24"), 1, "Math", 15..20),

            Question("What is 15% of 200?", listOf("25", "30", "35", "40"), 3, "Math", 21..26),
            Question("What is 13 x 11?", listOf("143", "123", "133", "153"), 0, "Math", 21..26),
            Question("Solve: 50 / 2 + 10", listOf("35", "30", "40", "25"), 0, "Math", 21..26),
            Question("What is √64?", listOf("6", "7", "8", "9"), 2, "Math", 21..26),
            Question("What is 90 - 37?", listOf("53", "55", "57", "52"), 0, "Math", 21..26),

            Question("What is 125 / 5?", listOf("25", "30", "20", "24"), 0, "Math", 27..100),
            Question("What is the square root of 121?", listOf("10", "11", "12", "13"), 1, "Math", 27..100),
            Question("What is 12.5 x 2?", listOf("25", "20", "22", "30"), 0, "Math", 27..100),
            Question("Solve: (10 + 5) x 2", listOf("30", "25", "20", "35"), 0, "Math", 27..100),
            Question("What is 100 - 36?", listOf("64", "60", "66", "68"), 0, "Math", 27..100)
        )

        "Science" -> listOf(
            Question("What do plants need to grow?", listOf("Sunlight", "Plastic", "Stone", "Paper"), 0, "Science", 3..8),
            Question("Which one is a source of light?", listOf("Moon", "Sun", "Tree", "Cloud"), 1, "Science", 3..8),
            Question("What is water made of?", listOf("H2O", "CO2", "O2", "NaCl"), 0, "Science", 3..8),
            Question("Which part of body helps us see?", listOf("Eyes", "Hands", "Feet", "Nose"), 0, "Science", 3..8),
            Question("Which gas do we breathe in?", listOf("Oxygen", "Carbon", "Nitrogen", "Helium"), 0, "Science", 3..8),

            Question("What planet do we live on?", listOf("Mars", "Venus", "Earth", "Jupiter"), 2, "Science", 9..14),
            Question("Which part of plant makes food?", listOf("Leaf", "Root", "Stem", "Flower"), 0, "Science", 9..14),
            Question("What gas do plants take in?", listOf("Oxygen", "Carbon Dioxide", "Nitrogen", "Helium"), 1, "Science", 9..14),
            Question("What’s the boiling point of water?", listOf("100°C", "90°C", "80°C", "70°C"), 0, "Science", 9..14),
            Question("Which organ pumps blood?", listOf("Heart", "Liver", "Brain", "Kidney"), 0, "Science", 9..14),

            Question("Which planet is known as Red Planet?", listOf("Mars", "Jupiter", "Saturn", "Venus"), 0, "Science", 15..20),
            Question("What is DNA?", listOf("Genetic Code", "Energy", "Protein", "Sugar"), 0, "Science", 15..20),
            Question("Which vitamin from sunlight?", listOf("A", "C", "D", "E"), 2, "Science", 15..20),
            Question("Unit of electric current?", listOf("Ampere", "Volt", "Ohm", "Watt"), 0, "Science", 15..20),
            Question("What is H2SO4?", listOf("Sulfuric Acid", "Hydrochloric Acid", "Nitric Acid", "Ammonia"), 0, "Science", 15..20),

            Question("What’s the largest organ?", listOf("Heart", "Skin", "Liver", "Brain"), 1, "Science", 21..26),
            Question("Process of water cycle?", listOf("Evaporation", "Condensation", "Precipitation", "All of these"), 3, "Science", 21..26),
            Question("Symbol for Sodium?", listOf("Na", "So", "Sn", "Sm"), 0, "Science", 21..26),
            Question("What is force measured in?", listOf("Newton", "Joule", "Watt", "Ohm"), 0, "Science", 21..26),
            Question("Gas in fire extinguishers?", listOf("CO2", "O2", "H2", "N2"), 0, "Science", 21..26),

            Question("Chemical symbol for gold?", listOf("Au", "Ag", "Gd", "Go"), 0, "Science", 27..100),
            Question("Study of cells?", listOf("Biology", "Cytology", "Botany", "Zoology"), 1, "Science", 27..100),
            Question("Who developed gravity theory?", listOf("Einstein", "Newton", "Galileo", "Tesla"), 1, "Science", 27..100),
            Question("What is ATP?", listOf("Energy", "Acid", "Protein", "DNA"), 0, "Science", 27..100),
            Question("What causes tides?", listOf("Sun", "Moon", "Waves", "Earthquake"), 1, "Science", 27..100)
        )
        "Sports" -> listOf(
            Question("How many players in a football team?", listOf("11", "10", "9", "12"), 0, "Sports", 3..8),
            Question("What is used to hit the ball in cricket?", listOf("Bat", "Stick", "Club", "Hand"), 0, "Sports", 3..8),
            Question("What sport uses a racket?", listOf("Tennis", "Football", "Hockey", "Golf"), 0, "Sports", 3..8),
            Question("Which game uses a goal post?", listOf("Football", "Tennis", "Cricket", "Chess"), 0, "Sports", 3..8),
            Question("What is played on a table with paddles?", listOf("Table Tennis", "Badminton", "Hockey", "Snooker"), 0, "Sports", 3..8),

            Question("How long is a football match?", listOf("90 mins", "60 mins", "45 mins", "120 mins"), 0, "Sports", 9..14),
            Question("Who is famous cricketer of Pakistan?", listOf("Babar Azam", "Neymar", "Messi", "Ronaldo"), 0, "Sports", 9..14),
            Question("How many rings in Olympics logo?", listOf("5", "6", "4", "3"), 0, "Sports", 9..14),
            Question("What is bowled in cricket?", listOf("Ball", "Bat", "Stick", "Stone"), 0, "Sports", 9..14),
            Question("What sport has wickets?", listOf("Cricket", "Football", "Tennis", "Hockey"), 0, "Sports", 9..14),

            Question("Who won FIFA 2022?", listOf("Argentina", "France", "Brazil", "Germany"), 0, "Sports", 15..20),
            Question("Fastest man on Earth?", listOf("Usain Bolt", "Messi", "Ronaldo", "Yohan Blake"), 0, "Sports", 15..20),
            Question("How many players in basketball?", listOf("5", "6", "7", "8"), 0, "Sports", 15..20),
            Question("Most centuries in cricket?", listOf("Sachin", "Babar", "Virat", "Afridi"), 0, "Sports", 15..20),
            Question("Tennis Grand Slam held in UK?", listOf("Wimbledon", "US Open", "French Open", "Aussie Open"), 0, "Sports", 15..20),

            Question("Where are Olympics held every 4 years?", listOf("Different Cities", "Same City", "USA", "UK"), 0, "Sports", 21..26),
            Question("Captain of Pakistan cricket 2023?", listOf("Babar Azam", "Sarfaraz", "Shaheen", "Rizwan"), 0, "Sports", 21..26),
            Question("What sport is Serena Williams known for?", listOf("Tennis", "Golf", "Basketball", "Athletics"), 0, "Sports", 21..26),
            Question("Total Olympic sports?", listOf("33", "30", "28", "40"), 0, "Sports", 21..26),
            Question("When did T20 cricket start?", listOf("2003", "2007", "2005", "2009"), 2, "Sports", 21..26),

            Question("Who won Cricket World Cup 2019?", listOf("England", "India", "Australia", "NZ"), 0, "Sports", 27..100),
            Question("What’s a hat-trick in football?", listOf("3 goals", "2 goals", "1 goal", "4 goals"), 0, "Sports", 27..100),
            Question("Where is Wimbledon played?", listOf("London", "Paris", "NYC", "Melbourne"), 0, "Sports", 27..100),
            Question("Who is Lionel Messi?", listOf("Footballer", "Cricketer", "Golfer", "Runner"), 0, "Sports", 27..100),
            Question("What’s a century in cricket?", listOf("100 runs", "50 runs", "150 runs", "200 runs"), 0, "Sports", 27..100)
        )
        "History" -> listOf(
            Question("Who discovered America?", listOf("Columbus", "Newton", "Einstein", "Galileo"), 0, "History", 3..8),
            Question("What did cavemen use to write?", listOf("Stones", "Pens", "Chalk", "Charcoal"), 3, "History", 3..8),
            Question("Who built pyramids?", listOf("Egyptians", "Romans", "Greeks", "Indians"), 0, "History", 3..8),
            Question("Which animal was used in wars?", listOf("Horse", "Tiger", "Elephant", "Monkey"), 2, "History", 3..8),
            Question("Which war ended in 1945?", listOf("WW2", "WW1", "Cold War", "Civil War"), 0, "History", 3..8),

            Question("Who was first US president?", listOf("Lincoln", "Washington", "Obama", "Adams"), 1, "History", 9..14),
            Question("Where is Great Wall?", listOf("China", "India", "Japan", "Egypt"), 0, "History", 9..14),
            Question("Who ruled India before 1947?", listOf("British", "French", "Dutch", "Chinese"), 0, "History", 9..14),
            Question("What was used before money?", listOf("Barter", "Coins", "Gold", "Paper"), 0, "History", 9..14),
            Question("What year did WW1 start?", listOf("1914", "1920", "1939", "1945"), 0, "History", 9..14),

            Question("What caused WW2?", listOf("Hitler", "Napoleon", "Gandhi", "Stalin"), 0, "History", 15..20),
            Question("When did Pakistan become independent?", listOf("1947", "1950", "1945", "1960"), 0, "History", 15..20),
            Question("Who invented printing press?", listOf("Gutenberg", "Newton", "Da Vinci", "Tesla"), 0, "History", 15..20),
            Question("Roman Empire capital?", listOf("Rome", "Paris", "London", "Berlin"), 0, "History", 15..20),
            Question("When Berlin Wall fell?", listOf("1989", "1990", "1980", "1995"), 0, "History", 15..20),

            Question("When was UN formed?", listOf("1945", "1950", "1939", "1960"), 0, "History", 21..26),
            Question("Who ruled Rome?", listOf("Caesar", "Hitler", "Lincoln", "Churchill"), 0, "History", 21..26),
            Question("Battle of Plassey year?", listOf("1757", "1857", "1764", "1800"), 0, "History", 21..26),
            Question("First man on moon?", listOf("Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "Elon Musk"), 0, "History", 21..26),
            Question("Founder of Pakistan?", listOf("Quaid-e-Azam", "Allama Iqbal", "Liaqat Ali", "Bhutto"), 0, "History", 21..26),

            Question("Partition of India?", listOf("1947", "1945", "1950", "1960"), 0, "History", 27..100),
            Question("Who fought in WW2?", listOf("Allies vs Axis", "East vs West", "North vs South", "None"), 0, "History", 27..100),
            Question("What empire was in India?", listOf("Mughal", "Roman", "Ottoman", "French"), 0, "History", 27..100),
            Question("Cold War was between?", listOf("USA & USSR", "UK & India", "France & China", "Germany & Italy"), 0, "History", 27..100),
            Question("Hitler was leader of?", listOf("Germany", "Italy", "Russia", "France"), 0, "History", 27..100)
        )

        "Tech" -> listOf(
            Question("What is CPU?", listOf("Central Processing Unit", "Central Power Unit", "Control Program Unit", "Computer Program Unit"), 0, "Tech", 3..8),
            Question("Which device is used to type?", listOf("Keyboard", "Mouse", "Monitor", "Speaker"), 0, "Tech", 3..8),
            Question("Which is a smart device?", listOf("Tablet", "Fan", "Chair", "Bulb"), 0, "Tech", 3..8),
            Question("What is WiFi?", listOf("Wireless Internet", "Wired Internet", "TV", "Cable"), 0, "Tech", 3..8),
            Question("Computer brain?", listOf("CPU", "Mouse", "Keyboard", "Speaker"), 0, "Tech", 3..8),

            Question("Who founded Microsoft?", listOf("Bill Gates", "Steve Jobs", "Elon Musk", "Sundar Pichai"), 0, "Tech", 9..14),
            Question("What is RAM?", listOf("Memory", "Storage", "Software", "Monitor"), 0, "Tech", 9..14),
            Question("Popular OS?", listOf("Windows", "Tesla", "Android", "iOS"), 0, "Tech", 9..14),
            Question("Inventor of WWW?", listOf("Tim Berners-Lee", "Bill Gates", "Jobs", "Musk"), 0, "Tech", 9..14),
            Question("File transfer app?", listOf("SHAREit", "Facebook", "Zoom", "Twitter"), 0, "Tech", 9..14),

            Question("What is AI?", listOf("Artificial Intelligence", "Animal Intelligence", "Active Internet", "Augmented Info"), 0, "Tech", 15..100),
            Question("Programming language for Android?", listOf("Kotlin", "Python", "HTML", "C#"), 0, "Tech", 15..100),
            Question("Full form of USB?", listOf("Universal Serial Bus", "Ultra Speed Band", "United Signal Block", "Universal Speed Bridge"), 0, "Tech", 15..100),
            Question("Main chip of computer?", listOf("Processor", "Hard Disk", "RAM", "Monitor"), 0, "Tech", 15..100),
            Question("Google’s OS?", listOf("Android", "iOS", "Linux", "Windows"), 0, "Tech", 15..100)
        )

        "General Knowledge" -> listOf(
            Question("Color of sky?", listOf("Blue", "Red", "Green", "Yellow"), 0, "General Knowledge", 3..8),
            Question("How many days in a week?", listOf("7", "5", "6", "8"), 0, "General Knowledge", 3..8),
            Question("Largest animal?", listOf("Blue Whale", "Elephant", "Giraffe", "Tiger"), 0, "General Knowledge", 3..8),
            Question("Fastest animal?", listOf("Cheetah", "Lion", "Horse", "Dog"), 0, "General Knowledge", 3..8),
            Question("Which is a fruit?", listOf("Apple", "Potato", "Tomato", "Carrot"), 0, "General Knowledge", 3..8),

            Question("Capital of Pakistan?", listOf("Islamabad", "Karachi", "Lahore", "Peshawar"), 0, "General Knowledge", 9..14),
            Question("Largest continent?", listOf("Asia", "Africa", "Europe", "America"), 0, "General Knowledge", 9..14),
            Question("Currency of USA?", listOf("Dollar", "Euro", "Rupee", "Yen"), 0, "General Knowledge", 9..14),
            Question("How many planets?", listOf("8", "9", "10", "7"), 0, "General Knowledge", 9..14),
            Question("Tallest mountain?", listOf("Everest", "K2", "Nanga Parbat", "Kilimanjaro"), 0, "General Knowledge", 9..14),

            Question("Who is UN Secretary General?", listOf("Guterres", "Biden", "Putin", "Modi"), 0, "General Knowledge", 15..100),
            Question("Which ocean is largest?", listOf("Pacific", "Atlantic", "Indian", "Arctic"), 0, "General Knowledge", 15..100),
            Question("Human body has how many bones?", listOf("206", "201", "210", "208"), 0, "General Knowledge", 15..100),
            Question("Smallest country?", listOf("Vatican City", "Monaco", "Malta", "Iceland"), 0, "General Knowledge", 15..100),
            Question("Deepest ocean trench?", listOf("Mariana Trench", "Sunda Trench", "Puerto Rico Trench", "Java Trench"), 0, "General Knowledge", 15..100)
        )

        "Gaming" -> listOf(
            Question("Which game has creepers?", listOf("Minecraft", "Roblox", "PUBG", "Valorant"), 0, "Gaming", 3..100),
            Question("Mario jumps to catch?", listOf("Coins", "Stars", "Balls", "Bombs"), 0, "Gaming", 3..100),
            Question("What is PUBG?", listOf("Shooting game", "Puzzle", "Farming", "Racing"), 0, "Gaming", 3..100),
            Question("Which is battle royale?", listOf("Fortnite", "Subway Surfer", "Ludo", "Clash Royale"), 0, "Gaming", 3..100),
            Question("Among Us is a ___ game?", listOf("Social deduction", "Shooting", "Driving", "Strategy"), 0, "Gaming", 3..100)
        )


        else -> emptyList()
    }.filter { age in it.ageRange }
}
