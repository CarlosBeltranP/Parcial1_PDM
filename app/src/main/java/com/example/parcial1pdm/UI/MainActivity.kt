package com.example.parcial1pdm.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.parcial1pdm.R

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerA = findViewById<EditText>(R.id.playerA_et)
        val playerB = findViewById<EditText>(R.id.playerB_et)
        val startBtn = findViewById<Button>(R.id.start_btn)
        val listBtn = findViewById<Button>(R.id.list_btn)

        startBtn.setOnClickListener {

            val player_a = playerA.text.toString()
            val player_b = playerB.text.toString()

            val intent = Intent(this@MainActivity, GameActivity::class.java)
            intent.putExtra("PlayerA" , player_a)
            intent.putExtra("PlayerB" , player_b)
            startActivity(intent)

        }

        listBtn.setOnClickListener {
            val intent2 = Intent(this@MainActivity, ListActivity::class.java)
            startActivity(intent2)
        }
    }
}
