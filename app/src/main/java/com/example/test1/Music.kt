package com.example.test1
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_music.*
import kotlinx.android.synthetic.main.music1.*
import java.util.*

class Music : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        val buttonClick1 = findViewById<Button>(R.id.button1)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, Music01::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<Button>(R.id.button2)
        buttonClick2.setOnClickListener{
            val intent = Intent(this, Music02::class.java)
            startActivity(intent)
        }
        val buttonClick3 = findViewById<Button>(R.id.button3)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, Music03::class.java)
            startActivity(intent)
        }
        val buttonClick4 = findViewById<Button>(R.id.button4)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, Music04::class.java)
            startActivity(intent)
        }
        val buttonClick5 = findViewById<Button>(R.id.button5)
        buttonClick5.setOnClickListener {
            val intent = Intent(this, Music05::class.java)
            startActivity(intent)
        }
        val buttonClick6 = findViewById<Button>(R.id.button6)
        buttonClick6.setOnClickListener {
            val intent = Intent(this, Music06::class.java)
            startActivity(intent)
        }
        val buttonClick7 = findViewById<Button>(R.id.button7)
        buttonClick7.setOnClickListener {
            val intent = Intent(this, Music07::class.java)
            startActivity(intent)
        }
        val buttonClick8 = findViewById<Button>(R.id.button8)
        buttonClick8.setOnClickListener {
            val intent = Intent(this, Music08::class.java)
            startActivity(intent)
        }
        val buttonClick9 = findViewById<Button>(R.id.button9)
        buttonClick9.setOnClickListener {
            val intent = Intent(this, Music09::class.java)
            startActivity(intent)
        }
        val buttonClick10 = findViewById<Button>(R.id.button10)
        buttonClick10.setOnClickListener {
            val intent = Intent(this, Music10::class.java)
            startActivity(intent)
        }
    }
}