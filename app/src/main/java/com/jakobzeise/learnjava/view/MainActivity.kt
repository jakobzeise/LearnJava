package com.jakobzeise.learnjava.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.Chapters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //List for the Chapters in the MainActivity
        val listOfChapters = mutableListOf<Chapters>(

            Chapters(
                1,
                "Introduction",
                "How to start Programming\n" +
                        "3min"
            ),

            Chapters(
                2,
                "Variables",
                "Learn about rules of creating variables\n" +
                        "6min"
            ),

            Chapters(
                3,
                "Operators",
                "Value assignment operator, comparing variables and math operations\n" +
                        "18min"
            ),

            Chapters(
                4,
                "Conditional Statements",
                "Blocks: if -> then and if -> then -> else\n" +
                        "10min"
            ),

            Chapters(
                5,
                "Print Statement",
                "Most popular debugging method to the rescue!\n" +
                        "5min "
            ),

            Chapters(
                6,
                "String",
                "Operating with Strings of characters\n" +
                        "12min"
            ),

            Chapters(
                7,
                "Loops",
                "A 'while' loop usage\n" +
                        "12min"
            ),

            Chapters(
                8,
                "Comments",
                "Document your own code\n" +
                        "4min"
            )
        )

        //kind of initialises the recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(listOfChapters)
    }
}