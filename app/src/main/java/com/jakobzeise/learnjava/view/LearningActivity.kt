package com.jakobzeise.learnjava.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.LearningChapters
import kotlinx.android.synthetic.main.activity_learning.*

class LearningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning)


        //List for the different tutorials in every chapter
        val contents = mutableListOf<LearningChapters>()

        //Chapter 1 Introduction
        contents.add(
            LearningChapters(
                "WHAT IS PROGRAMMING?\n\n" +
                        "Put simply, programming is giving a set of instructions to a computer to execute. If you’ve ever cooked using a recipe before, you can think of yourself as the computer and the recipe’s author as a programmer. The recipe author provides you with a set of instructions which you read and then follow. The more complex the instructions, the more complex the result!",
                "https://assets8.lottiefiles.com/packages/lf20_mplxocmr.json"
            )
        )

        //Chapter 2 Variables
        contents.add(
            LearningChapters(
                "VARIABLES IN JAVA\n\n" +
                        "A Java variable is a piece of memory that can contain a data value. A variable thus has a data type. Data types are covered in more detail in the text on Java data types. Variables are typically used to store information which your Java program needs to do its job.\n\n" +
                        "HOW TO CREATE A VARIABLE?\n\n" +
                        "To declare (create) a variable, you will specify the type, leave at least one space, then the name for the variable and end the line with a semicolon ( ; ). Java uses the keyword int for integer, double for a floating point number (a double precision number), and boolean for a Boolean value (true or false).",
                "https://assets4.lottiefiles.com/packages/lf20_ko8ud57v.json"
            )
        )

        //Chapter 3 Operators
        contents.add(
            LearningChapters(
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

                "https://assets6.lottiefiles.com/packages/lf20_wzgyyian.json"

            )
        )

        //Chapter 4 Conditional Statements
        contents.add(
            LearningChapters(
                "WHAT IS AN IF STATEMENT?\n\n" +
                        "If statements Java\n" +
                        "Java has the following conditional statements: Use if to specify a block of code to be executed, if a specified condition is true. Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.",
                "https://assets7.lottiefiles.com/private_files/lf30_vAtD7F.json"
            )
        )

        //Chapter 5 Print
        contents.add(
            LearningChapters(
                "WHAT IS A PRINT STATEMENT?\n\n" +
                        "A print \"statement\" is actually a call to the print or println method of the System. ... The print method takes exactly one argument; the println method takes one argument or no arguments. However, the one argument may be a String which you create using the string concatenation operator + .",
                "https://assets5.lottiefiles.com/packages/lf20_i7dxj8qw.json"
            )
        )

        //Chapter 6 String
        contents.add(
            LearningChapters(
                "WHAT ARE STRINGS?\n\n" +
                        "Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects. The Java platform provides the String class to create and manipulate strings.\n\n" +
                        "HOW TO CREATE A STRING?\n\n" +
                        "There are two ways to create a String object:\n" +
                        "\n" +
                        "By string literal : Java String literal is created by using double quotes.\n" +
                        "For Example: String s=“Welcome”;  \n" +
                        "By new keyword : Java String is created by using a keyword “new”.\n" +
                        "For example: String s=new String(“Welcome”);  \n" +
                        "It creates two objects (in String pool and in heap) and one reference variable where the variable ‘s’ will refer to the object in the heap.",
                "https://assets5.lottiefiles.com/packages/lf20_hr9whrgf.json"

            )
        )

        //Chapter 7 Loops
        contents.add(
            LearningChapters(
                "WHAT ARE LOOPS?\n\n" +
                        "The Java for loop is a control flow statement that iterates a part of the programs multiple times. The Java while loop is a control flow statement that executes a part of the programs repeatedly on the basis of given boolean condition. ... If the number of iteration is fixed, it is recommended to use for loop.\n\n" +
                        "HOW TO CREATE A LOOP?\n" +
                        "\n" +
                        "Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.\n" +
                        "Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.\n" +
                        "Increment/Decrement: It increments or decrements the variable value. It is an optional condition.\n" +
                        "Statement: The statement of the loop is executed each time until the second condition is false.",
                "https://assets1.lottiefiles.com/packages/lf20_bp5lntrf.json"

            )
        )

        //Chapter 8 Comments
        contents.add(
            LearningChapters(
                "WHAT ARE COMMENTS?\n\n" +
                        "Comments in Java are the statements that are not executed by the compiler and interpreter. It can be used to provide information or explanation about the variable, method, class or any statement. It can also be used to hide program code for a specific time.\n\n" +
                        "Single-line comments start with two forward slashes (//). " +
                        "Any text between // and the end of the line is ignored by Java (will not be executed).\n\n" +
                        "Multi-line comments start with /* and ends with */. " +
                        "Any text between /* and */ will be ignored by Java.\n",
                "https://assets8.lottiefiles.com/packages/lf20_xRmNN8.json"

            )
        )

        //Get the current chapter
        val chapter: Int = intent.extras?.get("Chapter") as Int

        //Set the tutorial text and the image of the tutorial
        textViewTutorial.text = contents[chapter].content


        //Go to tutorial Button
        quizButtonGoToTutorial.setOnClickListener {
            val quizIntent = Intent(this, QuizActivity::class.java)
            quizIntent.putExtra("Chapter", chapter)
            startActivity(quizIntent)
        }

        animationLearning.setAnimationFromUrl(contents[chapter].animation)
        backAnimation.setOnClickListener {
            val homeIntent = Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
        }
    }
}