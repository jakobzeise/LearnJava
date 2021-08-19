package com.jakobzeise.learnjava.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakobzeise.learnjava.R
import com.jakobzeise.learnjava.modell.Congratulation
import kotlinx.android.synthetic.main.activity_congratulations.*

class CongratulationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations)

        val congratulationList = mutableListOf(

            //Chapter 1
            Congratulation(
                "https://assets7.lottiefiles.com/packages/lf20_l4xxtfd3.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 2
            Congratulation(
                "https://assets7.lottiefiles.com/packages/lf20_fnjH1K.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 3
            Congratulation(
                "https://assets7.lottiefiles.com/private_files/lf30_9142zhsb.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 4
            Congratulation(
                "https://assets7.lottiefiles.com/packages/lf20_2xdplced.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 5
            Congratulation(
                "https://assets7.lottiefiles.com/private_files/lf30_P2wyYh.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 6
            Congratulation(
                "https://assets7.lottiefiles.com/packages/lf20_kfl4ksd9.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 7
            Congratulation(
                "https://assets7.lottiefiles.com/packages/lf20_AsP7Bf.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

            //Chapter 8
            Congratulation(
                "https://assets8.lottiefiles.com/datafiles/3RKIaYNZqu6RrV0/data.json",
                "Great job! You've just completed\n" +
                        "first lesson. This is how our app\n" +
                        "is supposed to work, let us take\n" +
                        "you further..."
            ),

        )

        val chapter = intent.getIntExtra("Chapter", 1)

        congratulationAnimation.setAnimationFromUrl(congratulationList[chapter].animation)
        textViewCongratulationText.text = congratulationList[chapter].text

        buttonGoHomeCongratulation.setOnClickListener {
            var goHomeIntent = Intent(this, MainActivity::class.java).apply {
                startActivity(this)
            }
        }




    }
}