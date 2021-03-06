package com.jakobzeise.learnjava.view

import android.annotation.SuppressLint
import android.content.Intent
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
                "Value"
            ),
            mutableListOf(
                "Code",
                "C++",
                "Storage"
            ),
            mutableListOf(
                "Data",
                "Integers Variables",
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
                "It depends on yourself"
            )
        ),

        //Chapter 7 Loops
        Quiz(
            mutableListOf(
                "What are loops?",
                "How do you loop something?",
                "What does a loop?",
            ),
            mutableListOf(
                "A loop is used for executing a block of statements repeatedly until a particular condition is satisfied.",
                "Play piano",
                "Loop a part of the code"
            ),
            mutableListOf(
                "Comments",
                "Recreate something",
                "A loop"
            ),
            mutableListOf(
                "A repeating task",
                "Write a comment",
                "Make everything faster"
            ),
            mutableListOf(
                "If-Statements",
                "public class NestedForExample {\n" +
                        "public static void main(String[] args) {\n" +
                        "//loop of i.\n" +
                        "for(int i=1;i<=3;i++){\n" +
                        "//loop of j.\n" +
                        "for(int j=1;j<=3;j++){\n" +
                        "System.out.println(i+\" \"+j);\n" +
                        "}//end of i.",
                "Create a layout"
            ),
            mutableListOf(
                "A loop is used for executing a block of statements repeatedly until a particular condition is satisfied.",
                "public class NestedForExample {\n" +
                        "public static void main(String[] args) {\n" +
                        "//loop of i.\n" +
                        "for(int i=1;i<=3;i++){\n" +
                        "//loop of j.\n" +
                        "for(int j=1;j<=3;j++){\n" +
                        "System.out.println(i+\" \"+j);\n" +
                        "}//end of i.",
                "Loop a part of the code"
            )
        ),

        //Chapter 8 Comments
        Quiz(
            mutableListOf(
                "What are  comments?",
                "What are not using the comments for?",
                "How to make single-line comments?",
            ),
            mutableListOf(
                "A statement executed by the compiler and interpreter",
                "Provide information",
                ".."
            ),
            mutableListOf(
                "Statement",
                "Explanation about any statement",
                "::"
            ),
            mutableListOf(
                "Message",
                "Explanation about the variable,method or class",
                "//"
            ),
            mutableListOf(
                "Statements not executed by the compiler and interpreter",
                "To add something",
                "()"
            ),
            mutableListOf(
                "Statements are not executing by the compiler and interpreter",
                "To add something",
                "//"
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
                    onProgressUpdate()

                    //If the first answer is wrong
                } else {
                    Toast.makeText(this, "Try it again", Toast.LENGTH_SHORT).show()
                    onProgressUpdate()
                }
            }
        }
        backAnimationQuizActivity.setOnClickListener {
            val goToTutorialIntent = Intent(this, LearningActivity::class.java)
            goToTutorialIntent.putExtra("Chapter", chapter)
            startActivity(goToTutorialIntent)
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