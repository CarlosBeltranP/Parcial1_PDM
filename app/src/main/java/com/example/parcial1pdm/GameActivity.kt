package com.example.parcial1pdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    var scorePlayerA = 0
    var scorePlayerB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val winner = findViewById<TextView>(R.id.end_tv)
        val endgame = findViewById<Button>(R.id.endgame_btn)

        val intent = intent

        val pa = intent.extras.getString("PlayerA")
        val pb = intent.extras.getString("PlayerB")

        val resultTvA = findViewById<TextView>(R.id.playerA_tv)
        resultTvA.text = pa

        val resultTvB = findViewById<TextView>(R.id.playerB_tv)
        resultTvB.text = pb

        endgame.setOnClickListener {
            if(scorePlayerA > scorePlayerB){
                winner.setText(" "+ pa+" es el ganador")
            }

            if(scorePlayerB > scorePlayerA){
                winner.setText(" "+ pb+" es el ganador")
            }

            if(scorePlayerA == scorePlayerB){
                winner.setText("Es un Empate")
            }

        }
    }



    private fun showPlayerA(score: Int){
        val scoreView = findViewById<View>(R.id.score_pa) as TextView
        scoreView.text = "" + score
    }

    private fun showPlayerB(score: Int){
        val scoreView = findViewById<View>(R.id.score_pb) as TextView
        scoreView.text = "" + score
    }

    fun onePoint_a(view: View){
        scorePlayerA = scorePlayerA + 1
        showPlayerA(scorePlayerA)

    }

    fun twoPoints_a(view: View){
        scorePlayerA = scorePlayerA + 2
        showPlayerA(scorePlayerA)

    }

    fun threePoints_a(view: View){
        scorePlayerA = scorePlayerA + 3
        showPlayerA(scorePlayerA)

    }

    fun onePoint_b(view: View){
        scorePlayerB = scorePlayerB + 1
        showPlayerB(scorePlayerB)

    }

    fun twoPoints_b(view: View){
        scorePlayerB = scorePlayerB + 2
        showPlayerB(scorePlayerB)

    }

    fun threePoints_b(view: View){
        scorePlayerB = scorePlayerB + 3
        showPlayerB(scorePlayerB)

    }


}
