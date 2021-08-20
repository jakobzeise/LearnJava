package com.jakobzeise.learnjava.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.LearningChapters
import kotlinx.android.synthetic.main.activity_learning.*

class LearningActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning)


        //List for the different tutorials in every chapter
        val contents = mutableListOf<LearningChapters>()

        //Chapter 1 Introduction
        contents.add(
            LearningChapters(
                mutableListOf(

                    "WHAT IS PROGRAMMING?\n\n" +
                            "Put simply, programming is\n " +
                            " giving a set of instructions\n " +
                            "to a computer to execute.\n " +
                            "If you’ve ever cooked using \n " +
                            "a recipe before, you can\n " +
                            " think of yourself as the\n " +
                            "computer and the recipe’s\n " +
                            " author as a programmer.\n " +
                            "The recipe author provides\n " +
                            " you with a set of instructions\n " +
                            "which you read and then follow.\n " +
                            " The more complex the instructions,\n " +
                            "the more complex the result!\n ",

                    "Programming is how you get \n " +
                            "computers to solve problems.\n\n " +

                            "There are two key phrases\n " +
                            " here which are important:\n\n" +

                            "you: without the programmer (you),\n " +
                            " the computer is useless.\n " +
                            "It does what you tell it to do.\n\n " +

                            "solve problems:\n " +
                            "computers are tools.\n " +
                            "They are complex tools,\n " +
                            "admittedly, but they are\n" +
                            " not mysterious or magical:\n " +
                            "they exist to make tasks easier.\n\n " +

                            "Computer programs (or software)\n " +
                            " are what make computers work.\n " +
                            " Without software, modern computers\n " +
                            " are just complicated machines\n " +
                            " for turning electricity into heat.\n " +
                            " It’s software on your computer\n " +
                            " that runs your operating system,\n " +
                            " browser, email, games, movie player\n" +
                            " – just about everything.\n\n" +

                            "Programming is a creative task:\n " +
                            " there is no right or wrong\n " +
                            " way to solve a problem,\n " +
                            " in the same way that there\n " +
                            " is no right or wrong way\n " +
                            " to paint a picture.\n " +
                            " There are choices to be made,\n " +
                            " and one way may seem better\n " +
                            " than another, but that does not\n " +
                            " mean the other is wrong!\n\n " +
                            "With the right skills and experience,\n " +
                            " a programmer can craft software\n " +
                            " to solve an unlimited number of problems\n " +
                            " – from telling you when\n " +
                            " your next train will arrive\n " +
                            " to playing your favourite music.\n " +
                            " The possibilities are constrained\n " +
                            " only by your imagination.\n\n\n " +
                            " That’s why I love programming."
                ),
                mutableListOf(
                    "https://assets8.lottiefiles.com/packages/lf20_mplxocmr.json",
                    "https://lottiefiles.com/73810-business-idea-animation"
                )

            )
        )

        //Chapter 2 Variables
        contents.add(
            LearningChapters(
                mutableListOf(
                    "VARIABLES IN JAVA\n\n" +

                            " A Java variable is a piece\n " +
                            " of memory that can contain\n " +
                            " a data value. A variable thus has a data type. Data types are covered in more detail in the text on Java data types. Variables are typically used to store information which your Java program needs to do its job.\n\n" +
                            " HOW TO CREATE A VARIABLE?\n\n" +

                            " To declare (create) a variable,\n" +
                            " you will specify the type,\n" +
                            " leave at least one space,\n" +
                            " then the name for the variable\n" +
                            " and end the line with a semicolon ( ; ).\n\n" +
                            " Java uses the keyword int\n" +
                            " for integer, double for\n" +
                            " a floating point number\n" +
                            " (a double precision number),\n" +
                            " and boolean for a Boolean\n" +
                            " value (true or false).\n",
                    ""

                    ),
                mutableListOf(
                    "https://assets4.lottiefiles.com/packages/lf20_ko8ud57v.json",
                    "https://lottiefiles.com/73376-scanning-documents"
                )

            )
        )

        //Chapter 3 Operators
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT ARE OPERATORS?\n\n" +
                            "In computer programming, operators are constructs defined within programming languages which behave generally like functions, but which differ syntactically or semantically. Common simple examples include arithmetic, comparison, and logical operations.\n\n" +
                            " + (Addition) :\n" +
                            "Adds values on either side of the operator.\n\n" +
                            "- (Subtraction) :\n" +
                            "Subtracts right-hand operand from left-hand operand.\n\n" +
                            "* (Multiplication) :\n" +
                            "Multiplies values on either side of the operator.\n\n" +
                            "/ (Division) :\n" +
                            "Divides left-hand operand by right-hand operand.\n\n" +
                            "% (Modulus) :\n" +
                            "Divides left-hand operand by right-hand operand and returns remainder.\n\n" +
                            "++ (Increment) :\n" +
                            "Increases the value of operand by 1.\n\n" +
                            "-- (Decrement) :\n" +
                            "\tDecreases the value of operand by 1.\n\n",
                    ""
                ),
                mutableListOf(
                    "https://assets6.lottiefiles.com/packages/lf20_wzgyyian.json",
                    "https://assets3.lottiefiles.com/packages/lf20_j1yzugut.json"
                )


            )
        )

        //Chapter 4 Conditional Statements
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT IS AN IF STATEMENT?\n\n" +
                            " If statements Java\n" +
                            " Java has the following conditional\n" +
                            " statements: Use if to specify a\n" +
                            " block of code to be executed,\n" +
                            " if a specified condition is true.\n" +
                            " Use else to specify a block of\n" +
                            " code to be executed, if the same\n" +
                            " condition is false. Use else if\n" +
                            " to specify a new condition to test,\n" +
                            " if the first condition is false.\n",
                    ""

                    ),
                mutableListOf(
                    "https://assets7.lottiefiles.com/private_files/lf30_vAtD7F.json",
                    "https://assets9.lottiefiles.com/private_files/lf30_vAtD7F.json"
                )

            )
        )

        //Chapter 5 Print
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT IS A PRINT STATEMENT?\n\n" +
                            " A print \"statement\" is actually\n" +
                            " a call to the print or println\n" +
                            " method of the System.\n" +
                            " ... The print method\n" +
                            " takes exactly one argument;\n" +
                            " the println method takes\n" +
                            " one argument or no arguments.\n" +
                            " However, the one argument may\n" +
                            " be a String which you create\n" +
                            " using the string\n" +
                            " concatenation operator + .\n",
                    ""

                    ),
                mutableListOf(
                    "https://assets5.lottiefiles.com/packages/lf20_i7dxj8qw.json",
                    "https://assets9.lottiefiles.com/packages/lf20_k86wxpgr.json"
                )

            )
        )

        //Chapter 6 String
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT ARE STRINGS?\n\n" +
                            " Strings, which are widely\n " +
                            " used in Java programming,\n " +
                            " are a sequence of characters.\n " +
                            " In the Java programming language,\n " +
                            " strings are objects\n " +
                            " The Java platform provides\n " +
                            " the String class to create and manipulate strings.\n\n" +
                            " HOW TO CREATE A STRING?\n\n" +
                            " There are two ways to\n " +
                            " create a String object:\n\n" +
                            " By string literal :\n " +
                            " Java String literal\n " +
                            " is created by using double quotes.\n\n" +
                            " For Example: String s=“Welcome”;\n" +
                            " By new keyword :\n " +
                            " Java String is created\n " +
                            " by using a keyword “new”.\n" +
                            " For example:\n " +
                            " String s=new String(“Welcome”);\n" +
                            " It creates two objects\n " +
                            " (in String pool and in heap)\n " +
                            " and one reference variable\n " +
                            " where the variable ‘s’ will\n " +
                            " refer to the object in the heap.",
                    ""

                    ),
                mutableListOf(
                    "https://assets5.lottiefiles.com/packages/lf20_hr9whrgf.json",
                    "https://assets7.lottiefiles.com/private_files/lf30_sisdcihk.json"
                )


            )
        )

        //Chapter 7 Loops
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT ARE LOOPS?\n\n" +
                            "The Java for loop is a\n " +
                            " control flow statement\n " +
                            " that iterates a part of\n " +
                            " the programs multiple times.\n " +
                            " The Java while loop is a\n " +
                            " control flow statement\n " +
                            " that executes a part of\n " +
                            " the programs repeatedly\n " +
                            " on the basis of given\n " +
                            " boolean condition.\n " +
                            " ... If the number of\n " +
                            " iteration is fixed,\n " +
                            " it is recommended\n " +
                            " to use for loop.\n\n" +
                            "HOW TO CREATE A LOOP?\n\n" +
                            "Initialization: It is the\n " +
                            " initial condition which\n " +
                            " is executed once when\n " +
                            " the loop starts.\n " +
                            " Here, we can initialize\n " +
                            " the variable, or we can use\n " +
                            " an already initialized variable.\n " +
                            " It is an optional condition.\n" +
                            "Condition: It is the second\n " +
                            " condition which is executed\n " +
                            " each time to test the\n " +
                            " condition of the loop.\n " +
                            " It continues execution\n " +
                            " until the condition is false.\n " +
                            " It must return boolean\n " +
                            " value either true or false.\n " +
                            " It is an optional condition.\n" +
                            "Increment/Decrement:\n " +
                            " It increments or decrements\n " +
                            " the variable value.\n " +
                            " It is an optional condition.\n" +
                            "Statement: The statement of the loop is executed each time until the second condition is false.",
                    ""

                    ),
                mutableListOf(
                    "https://assets1.lottiefiles.com/packages/lf20_bp5lntrf.json",
                    "https://assets7.lottiefiles.com/packages/lf20_eelepfi9.json"
                )


            )
        )

        //Chapter 8 Comments
        contents.add(
            LearningChapters(
                mutableListOf(
                    "WHAT ARE COMMENTS?\n\n" +
                            " Comments in Java are the\n " +
                            " statements that are not\n" +
                            " executed by the compiler\n" +
                            " and interpreter.\n" +
                            " It can be used to provide\n" +
                            " information or explanation\n" +
                            " about the variable, method,\n" +
                            " class or any statement.\n" +
                            " It can also be used to\n" +
                            " hide program code for\n" +
                            " a specific time.\n\n" +
                            " Single-line comments\n" +
                            " start with two forward\n" +
                            " slashes (//). \n" +
                            " Any text between // \n" +
                            " and the end of the line\n" +
                            " is ignored by Java\n" +
                            " (will not be executed).\n\n" +
                            " Multi-line comments start\n" +
                            " with /* and ends with */. \n" +
                            " Any text between /* and */\n" +
                            " will be ignored by Java.\n",

                    ""
                ),
                mutableListOf(
                    "https://assets8.lottiefiles.com/packages/lf20_xRmNN8.json",
                    "https://assets7.lottiefiles.com/private_files/lf30_sisdcihk.json"
                )
            )
        )

        //Get the current chapter
        val chapter: Int = intent.extras?.get("Chapter") as Int

        //Process = 0
        var process = 0


        //Set the tutorial text and the image of the tutorial
        textViewTutorial.text = contents[chapter].text[process]


        //Go to tutorial Button
        learningButtonGoToQuiz.setOnClickListener {
            if(process == 0){
                process++

                textViewTutorial.text = contents[chapter].text[process]
                animationLearning.setAnimationFromUrl(contents[chapter].animation[process])
                learningButtonGoToQuiz.text = "Go To Quiz"

            }else{
                val quizIntent = Intent(this, QuizActivity::class.java)
                quizIntent.putExtra("Chapter", chapter)
                startActivity(quizIntent)
            }

        }

        animationLearning.setAnimationFromUrl(contents[chapter].animation[process])
        backAnimationQuizActivity.setOnClickListener {
            val homeIntent = Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
        }
    }
}