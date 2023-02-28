package com.example.test1
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Code for Clicklisten activity concerning cardview
        /*
        val 1 - indicates Profile Page
        val 2 - indicates Music
        val 3 - indicates Sports
        val 4 - MAST
        val 5 - Chat
        */
        val card1 = findViewById<CardView>(R.id.card1)
        card1.setOnClickListener {
            startActivity(Intent(this, Profilepage::class.java))
        }
        val card2 = findViewById<CardView>(R.id.card2)
        card2.setOnClickListener {
            startActivity(Intent(this, Music::class.java))
        }
        val card3 = findViewById<CardView>(R.id.card3)
        card3.setOnClickListener {
            startActivity(Intent(this, Sports::class.java))
        }
        val card4 = findViewById<CardView>(R.id.card4)
        card4.setOnClickListener {
            startActivity(Intent(this, Mast::class.java))
        }
        val card5 = findViewById<CardView>(R.id.card5)
        card5.setOnClickListener {
            startActivity(Intent(this, chat::class.java))
        }
    }
}
