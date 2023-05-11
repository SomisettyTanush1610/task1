package com.example.task1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var sf: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvWord = findViewById<TextView>(R.id.tvWord)
        val tvJumble = findViewById<TextView>(R.id.tvJumble)
        val btnStart = findViewById<Button>(R.id.btn)
        val word = findViewById<EditText>(R.id.etWord)
        val clue = findViewById<EditText>(R.id.etClue)
        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        var hs = sf.getInt("sf_hs",0)
        var enteredWord = ""
        var enteredClue = ""
        var score = findViewById<TextView>(R.id.tvHS)
        score.text = "TopScore : $hs"
        btnStart.setOnClickListener {
            enteredWord = word.text.toString()
            enteredClue = clue.text.toString()
            if (enteredWord == "" || enteredClue == "") {
                Toast.makeText(
                    this@MainActivity,
                    "please enter the details",
                    Toast.LENGTH_LONG
                ).show()}

            else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("WORD", enteredWord)
                intent.putExtra("CLUE", enteredClue)
                startActivity(intent)
            }

        }
    }
}