package com.jakobzeise.learnjava.view

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.Quiz
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {


    //Quizlist with the Question, PossibleAnswers and Right Answer
    private val quizList = mutableListOf(

        //Chapter 1 Introduction
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 2 Variables
        Quiz(
            mutableListOf(
                "What is inside a variable?",
                "How do you store numbers?",
                "There are three steps to create a variable which of these is not a step?",
            ),
            mutableListOf(
                "Data",
                "Variables",
                "Type"
            ),
            mutableListOf(
                "Storage space",
                "Integer variable",
                "Name"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "value"
            ),
            mutableListOf(
                "Code",
                "C++",
                "Storage"
            ),
            mutableListOf(
                "Data",
                "Integers variables",
                "Storage"
            )
        ),

        //Chapter 3 Operators
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 4 Conditional Statements
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 5 Print Statements
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 6 Strings
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 7 Loops
        Quiz(
            mutableListOf(
                "What is programming?",
                "What language are you learning?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "Giving Instructions",
                "C++",
                "One Year"
            ),
            mutableListOf(
                "Playing Piano",
                "Java",
                "A Month"
            ),
            mutableListOf(
                "Mind Reading",
                "Kotlin",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Playing Soccer",
                "Python",
                "10 Years"
            ),
            mutableListOf(
                "Giving Instructions",
                "Java",
                "It Depends On Yourself"
            )
        ),

        //Chapter 8 Comments
        Quiz(
            mutableListOf(
                "What are  comments?",
                "What are not using the comments for?",
                "How long does it take to learn programming?",
            ),
            mutableListOf(
                "A statement executing by the compiler and interpreter",
                "Provide information",
                "One Year"
            ),
            mutableListOf(
                "Statement",
                "Explanation about any statement",
                "A Month"
            ),
            mutableListOf(
                "A Message",
                "Explanation about the variable,method or class",
                "It Depends On Yourself"
            ),
            mutableListOf(
                "Statements are not executing by the compiler and interpreter",
                "To add something",
                "10 Years"
            ),
            mutableListOf(
                "Statements are not executing by the compiler and interpreter",
                "Java",
                "It Depends On Yourself"
            )
        )
    )

    //Get the Current Chapter
    private var chapter = 0

    //The states for the textViews
    var first = false
    var second = false
    var third = false
    var forth = false



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)



        //Gets the current chapter
        chapter = intent.extras?.get("Chapter") as Int

        //Sets the quiz based on the Progress
        onProgressUpdate()


        //The first answer
        textViewOptionOne.setOnClickListener {
            //If the first answer is already selected
            if (first) {
                first = false
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //If the first answer is not selected
            } else {
                //Selects the first answer
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.ugly_green))

                //Unselects the other answers
                textViewOptionTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionThree.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionFour.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //Sets the states of the textViews
                first = true
                second = false
                third = false
                forth = false
            }
        }


        textViewOptionTwo.setOnClickListener {

            //If the second answer is already selected
            if (second) {
                second = false
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //If the second answer is not selected
            } else {

                //Selects the second answer
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.ugly_green))

                //Unselects the other answers
                textViewOptionOne.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionThree.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionFour.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //Sets the states of the textViews
                second = true
                first = false
                third = false
                forth = false
            }
        }


        textViewOptionThree.setOnClickListener {

            //If the third answer is already selected
            if (third) {
                third = false
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //If the first answer is not selected
            } else {
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.ugly_green))

                //Unselects the other answers
                textViewOptionTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionOne.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionFour.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //Sets the states of the textViews
                third = true
                second = false
                first = false
                forth = false
            }
        }


        textViewOptionFour.setOnClickListener {

            //If the forth answer is already selected
            if (forth) {
                forth = false
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //If the forth answer is not selected
            } else {
                it.setBackgroundColor(ContextCompat.getColor(this, R.color.ugly_green))

                //Unselects the other answers
                textViewOptionTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionThree.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
                textViewOptionOne.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))

                //Sets the states of the textViews
                forth = true
                second = false
                third = false
                first = false
            }
        }

        submitButtonQuiz.setOnClickListener {
            if (first) {
                //Checks if the first answer is the right one
                if (textViewOptionOne.text == quizList[chapter].correctAnswer[progressBarQuiz.progress]) {
                    progressBarQuiz.progress = progressBarQuiz.progress + 1
                    val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.correct_answer_sound)
                    mediaPlayer.stop()
                    mediaPlayer.start()
                    onProgressUpdate()

                    //If the first answer is wrong
                } else {
                    Toast.makeText(this, "Try it again", Toast.LENGTH_SHORT).show()
                    onProgressUpdate()
                }
            }
            if (second) {
                //Checks if the first answer is the right one
                if (textViewOptionTwo.text == quizList[chapter].correctAnswer[progressBarQuiz.progress]) {
                    progressBarQuiz.progress = progressBarQuiz.progress + 1
                    val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.correct_answer_sound)
                    mediaPlayer.stop()
                    mediaPlayer.start()
                    onProgressUpdate()

                    //If the first answer is wrong
                } else {
                    Toast.makeText(this, "Try it again", Toast.LENGTH_SHORT).show()
                    onProgressUpdate()
                }
            }
            if (third) {
                //Checks if the first answer is the right one
                if (textViewOptionThree.text == quizList[chapter].correctAnswer[progressBarQuiz.progress]) {
                    progressBarQuiz.progress = progressBarQuiz.progress + 1
                    val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.correct_answer_sound)
                    mediaPlayer.stop()
                    mediaPlayer.start()
                    onProgressUpdate()

                    //If the first answer is wrong
                } else {
                    Toast.makeText(this, "Try it again", Toast.LENGTH_SHORT).show()
                    onProgressUpdate()
                }
            }
            if (forth) {
                //Checks if the first answer is the right one
                if (textViewOptionFour.text == quizList[chapter].correctAnswer[progressBarQuiz.progress]) {
                    progressBarQuiz.progress = progressBarQuiz.progress + 1
                    val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.correct_answer_sound)
                    mediaPlayer.stop()
                    mediaPlayer.start()
                    onProgressUpdate()

                    //If the first answer is wrong
                } else {
                    Toast.makeText(this, "Try it again", Toast.LENGTH_SHORT).show()
                    onProgressUpdate()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun onProgressUpdate() {

        if(progressBarQuiz.progress < 3) {
            val quizActivity = QuizActivity()

            textViewProgress.text = "${progressBarQuiz.progress}/3"

            //Set the text of the question
            textViewQuestion.text =
                quizActivity.quizList[chapter].question[progressBarQuiz.progress]

            //Set the text of the textViews
            textViewOptionOne.text = quizList[chapter].firstOption[progressBarQuiz.progress]
            textViewOptionTwo.text = quizList[chapter].secondOption[progressBarQuiz.progress]
            textViewOptionThree.text = quizList[chapter].thirdOption[progressBarQuiz.progress]
            textViewOptionFour.text = quizList[chapter].fourthOption[progressBarQuiz.progress]

            textViewOptionOne.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
            textViewOptionTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
            textViewOptionThree.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
            textViewOptionFour.setBackgroundColor(ContextCompat.getColor(this, R.color.navy))
            first = false
            second = false
            third = false
            forth = false
        } else{
            val intentOpenCongratulationsActivity = Intent(this, CongratulationsActivity::class.java).apply {
                putExtra("Chapter", chapter)
            }
            startActivity(intentOpenCongratulationsActivity)
        }
    }
}