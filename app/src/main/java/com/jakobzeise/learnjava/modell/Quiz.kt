package com.jakobzeise.learnjava.modell

//DataClass for the QuizActivity
data class Quiz(
    val question: MutableList<String>,
    val firstOption: MutableList<String>,
    val secondOption: MutableList<String>,
    val thirdOption: MutableList<String>,
    val fourthOption: MutableList<String>,
    val correctAnswer: MutableList<String>
)