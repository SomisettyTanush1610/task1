package com.example.task1

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    private  var mediaPlayer:MediaPlayer?=null
    private  lateinit var dialog : Dialog
    private lateinit var sf: SharedPreferences
    private lateinit var editor : SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var word = intent.getStringExtra("WORD")
        val clue = intent.getStringExtra("CLUE")
        val help = findViewById<ImageButton>(R.id.btnHelp)
        val toBeGuessed = word
        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sf.edit()
        var l1 = findViewById<TextView>(R.id.tvL1)
        var l2 = findViewById<TextView>(R.id.tvL2)
        var l3 = findViewById<TextView>(R.id.tvL3)
        var l4 = findViewById<TextView>(R.id.tvL4)
        var l5 = findViewById<TextView>(R.id.tvL5)
        var l6 = findViewById<TextView>(R.id.tvL6)
        var l7 = findViewById<TextView>(R.id.tvL7)
        var l8 = findViewById<TextView>(R.id.tvL8)
        var l9 = findViewById<TextView>(R.id.tvL9)
        var l10 = findViewById<TextView>(R.id.tvL10)
        var l11 = findViewById<TextView>(R.id.tvL11)
        var l12 = findViewById<TextView>(R.id.tvL12)
        var l13 = findViewById<TextView>(R.id.tvL13)
        var l14 = findViewById<TextView>(R.id.tvL14)
        var l15 = findViewById<TextView>(R.id.tvL15)
        var l16 = findViewById<TextView>(R.id.tvL16)
        val display = findViewById<TextView>(R.id.tvDisplay)
        val reset = findViewById<ImageButton>(R.id.btnReset)
        val cvv = findViewById<CardView>(R.id.cvVictroy)
        val check = findViewById<ImageButton>(R.id.btnCheck)
        val home = findViewById<Button>(R.id.btnHome)
        val h1 = findViewById<ImageView>(R.id.ivH1)
        val h2 = findViewById<ImageView>(R.id.ivH2)
        val h3 = findViewById<ImageView>(R.id.ivH3)
        val cvd = findViewById<CardView>(R.id.cvDefeat)
        val exit = findViewById<Button>(R.id.btnExit)
        var successScore = findViewById<TextView>(R.id.ss)
        val defeatScore = findViewById<TextView>(R.id.DS)
        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        val hs = sf.getInt("sf_hs", 0)
        var countOfHeart: Int = 3
        var name = ""
        var wordLength = word?.length
        val wl = wordLength
        val hint = "$clue and number of letters is $wl"
        if (wordLength != null) {
            while (wordLength < 16) {
                var rand = ('a'..'z').random()
                if (word != null) {
                    word += rand
                    ++wordLength

                }
            }
            val tt = jumb(word.toString())
            word = tt
            l1.text = word.get(0).toString()
            l2.text = word.get(1).toString()
            l3.text = word.get(2).toString()
            l4.text = word.get(3).toString()
            l6.text = word.get(4).toString()
            l5.text = word.get(5).toString()
            l7.text = word.get(6).toString()
            l8.text = word.get(7).toString()
            l9.text = word.get(8).toString()
            l10.text = word.get(9).toString()
            l11.text = word.get(10).toString()
            l12.text = word.get(11).toString()
            l13.text = word.get(12).toString()
            l14.text = word.get(13).toString()
            l15.text = word.get(14).toString()
            l16.text = word.get(15).toString()
            help.setOnClickListener{
               dialog = Dialog(this)
               dialog.setContentView(R.layout.clue)
               dialog.show()
                val btn = dialog.findViewById<Button>(R.id.button)
                val textClue = dialog.findViewById<TextView>(R.id.tvClue)
                textClue.text = clue
                btn.setOnClickListener(View.OnClickListener() {
                    dialog.dismiss()
                })
            }
            l1.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l1.text
                name+=a
                display.text=name
                l1.visibility = View.INVISIBLE

            }
            l2.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l2.text
                name+=a
                display.text=name
                l2.visibility = View.INVISIBLE

            }
            l3.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l3.text
                name+=a
                display.text=name
                l3.visibility = View.INVISIBLE

            }
            l4.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l4.text
                name+=a
                display.text=name
                l4.visibility = View.INVISIBLE

            }
            l5.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l5.text
                name+=a
                display.text=name
                l5.visibility = View.INVISIBLE

            }
            l6.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l6.text
                name+=a
                display.text=name
                l6.visibility = View.INVISIBLE

            }
            l7.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l7.text
                name+=a
                display.text=name
                l7.visibility = View.INVISIBLE

            }
            l8.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l8.text
                name+=a
                display.text=name
                l8.visibility = View.INVISIBLE

            }
            l9.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l9.text
                name+=a
                display.text=name
                l9.visibility = View.INVISIBLE

            }
            l10.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l10.text
                name+=a
                display.text=name
                l10.visibility = View.INVISIBLE

            }
            l11.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l11.text
                name+=a
                display.text=name
                l11.visibility = View.INVISIBLE

            }
            l12.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l12.text
                name+=a
                display.text=name
                l12.visibility = View.INVISIBLE

            }
            l13.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l13.text
                name+=a
                display.text=name
                l13.visibility = View.INVISIBLE

            }
            l14.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l14.text
                name+=a
                display.text=name
                l14.visibility = View.INVISIBLE

            }
            l15.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l15.text
                name+=a
                display.text=name
                l15.visibility = View.INVISIBLE

            }
            l16.setOnClickListener {
                if (mediaPlayer==null){
                    mediaPlayer = MediaPlayer.create(this,R.raw.s)
                }
                mediaPlayer?.start()
                var a = l16.text
                name+=a
                display.text=name
                l16.visibility = View.INVISIBLE

            }
            reset.setOnClickListener {
                l1.visibility = View.VISIBLE
                l2.visibility = View.VISIBLE
                l3.visibility = View.VISIBLE
                l4.visibility = View.VISIBLE
                l5.visibility = View.VISIBLE
                l6.visibility = View.VISIBLE
                l7.visibility = View.VISIBLE
                l8.visibility = View.VISIBLE
                l9.visibility = View.VISIBLE
                l10.visibility = View.VISIBLE
                l11.visibility = View.VISIBLE
                l12.visibility = View.VISIBLE
                l13.visibility = View.VISIBLE
                l14.visibility = View.VISIBLE
                l15.visibility = View.VISIBLE
                l16.visibility = View.VISIBLE
                display.text=""
                name = ""
                Toast.makeText(
                    this@MainActivity2,
                    "CONTINUE THE GAME",
                    Toast.LENGTH_SHORT
                ).show()
            }

            check.setOnClickListener {
               if (display.text.length == wl) {
                   if (toBeGuessed == display.text) {
                       cvv.visibility = View.VISIBLE
                       l1.setClickable(false)
                       l3.setClickable(false)
                       l2.setClickable(false)
                       l4.setClickable(false)
                       l5.setClickable(false)
                       l6.setClickable(false)
                       l7.setClickable(false)
                       l8.setClickable(false)
                       l9.setClickable(false)
                       l10.setClickable(false)
                       l11.setClickable(false)
                       l12.setClickable(false)
                       l13.setClickable(false)
                       l14.setClickable(false)
                       l15.setClickable(false)
                       l16.setClickable(false)
                       help.setClickable(false)
                       reset.setClickable(false)
                       mediaPlayer = null
                       if (mediaPlayer == null) {
                           mediaPlayer = MediaPlayer.create(this, R.raw.vic)
                       }
                       mediaPlayer?.start()
                       home.setOnClickListener {
                           val intent = Intent(this, MainActivity::class.java)
                           startActivity(intent)
                       }
                       val temp = calScore(countOfHeart,wl)
                       successScore.text = "SCORE : $temp"
                       if (temp > hs){
                           editor.apply{
                               putInt("sf_hs",temp)
                               commit()
                           }

                       }
                   }

                   if (toBeGuessed != display.text) {
                       l1.visibility = View.VISIBLE
                       l2.visibility = View.VISIBLE
                       l3.visibility = View.VISIBLE
                       l4.visibility = View.VISIBLE
                       l5.visibility = View.VISIBLE
                       l6.visibility = View.VISIBLE
                       l7.visibility = View.VISIBLE
                       l8.visibility = View.VISIBLE
                       l9.visibility = View.VISIBLE
                       l10.visibility = View.VISIBLE
                       l11.visibility = View.VISIBLE
                       l12.visibility = View.VISIBLE
                       l13.visibility = View.VISIBLE
                       l14.visibility = View.VISIBLE
                       l15.visibility = View.VISIBLE
                       l16.visibility = View.VISIBLE
                       name = ""
                       display.text = ""
                       --countOfHeart
                       val temp =jumb(word.toString())
                       word = temp
                       l1.text = word!!.get(0).toString()
                       l2.text = word!!.get(1).toString()
                       l3.text = word!!.get(2).toString()
                       l4.text = word!!.get(3).toString()
                       l6.text = word!!.get(4).toString()
                       l5.text = word!!.get(5).toString()
                       l7.text = word!!.get(6).toString()
                       l8.text = word!!.get(7).toString()
                       l9.text = word!!.get(8).toString()
                       l10.text = word!!.get(9).toString()
                       l11.text = word!!.get(10).toString()
                       l12.text = word!!.get(11).toString()
                       l13.text = word!!.get(12).toString()
                       l14.text = word!!.get(13).toString()
                       l15.text = word!!.get(14).toString()
                       l16.text = word!!.get(15).toString()
                       name  = ""
                       if (countOfHeart < 3) {
                           h2.visibility = View.INVISIBLE
                           mediaPlayer = null
                           if (mediaPlayer == null) {
                               mediaPlayer = MediaPlayer.create(this, R.raw.go)
                           }
                           mediaPlayer?.start()
                       }
                       if (countOfHeart < 2) {
                           h3.visibility = View.INVISIBLE
                           mediaPlayer = null
                           if (mediaPlayer == null) {
                               mediaPlayer = MediaPlayer.create(this, R.raw.go)
                           }
                           mediaPlayer?.start()
                       }
                       if (countOfHeart < 1) {
                           h1.visibility = View.INVISIBLE
                           mediaPlayer = null
                           if (mediaPlayer == null) {
                               mediaPlayer = MediaPlayer.create(this, R.raw.go)
                           }
                           mediaPlayer?.start()
                       }
                       Toast.makeText(
                           this@MainActivity2,
                           "WRONG GUESS",
                           Toast.LENGTH_SHORT
                       ).show()
                   }

                   if (countOfHeart == 0) {
                       cvd.visibility = View.VISIBLE
                       l1.setClickable(false)
                       l3.setClickable(false)
                       l2.setClickable(false)
                       l4.setClickable(false)
                       l5.setClickable(false)
                       l6.setClickable(false)
                       l7.setClickable(false)
                       l8.setClickable(false)
                       l9.setClickable(false)
                       l10.setClickable(false)
                       l11.setClickable(false)
                       l12.setClickable(false)
                       l13.setClickable(false)
                       l14.setClickable(false)
                       l15.setClickable(false)
                       l16.setClickable(false)
                       help.setClickable(false)
                       reset.setClickable(false)
                       mediaPlayer = null
                       if (mediaPlayer == null) {
                           mediaPlayer = MediaPlayer.create(this, R.raw.gg)
                       }
                       mediaPlayer?.start()
                       exit.setOnClickListener {
                           val intent = Intent(this, MainActivity::class.java)
                           startActivity(intent)
                       }
                       val temp = calScore(countOfHeart,wl)
                       defeatScore.text = "SCORE : $temp"
                   }
               }
                else{
                   Toast.makeText(
                       this@MainActivity2,
                       "NUMBER OF LETTERS NOT MATCHING",
                       Toast.LENGTH_SHORT
                   ).show()
               }
            }




        }
    }
        fun jumb(g: String):String{
            var w =g
            val jumble:MutableList<Char> = (w)!!.toMutableList()
            var jum = jumble.shuffled()
            var jj = jum.joinToString(separator = "")
            return jj
            }
        fun calScore(hc:Int,l:Int):Int{
            return hc*l*100
        }

}

