package com.jakobzeise.learnjava.modell

//Data Class for the LearningActivity
data class LearningChapters(
    var text: MutableList<String>,
    var animation: MutableList<String>
)