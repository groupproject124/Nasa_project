package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bu1
import kotlinx.android.synthetic.main.activity_main.bu2
import kotlinx.android.synthetic.main.activity_main3.*

class Main37Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main37)
    }
    fun skip(view: View) {
        var cd = view as RadioButton
        if(score==4){
            when (cd.id) {
                bu1.id -> {
                    var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)

                }
                bu2.id -> {
                    var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)
                }
                bu3.id -> { var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)
                }
                bu4.id -> {var intent= Intent(this@Main37Activity,Main47Activity::class.java)
                    startActivity(intent)
                    score++
                }
            }
        }
        else{
            when (cd.id) {
                bu1.id -> {
                    var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)

                }
                bu2.id -> {
                    var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)
                }
                bu3.id -> { var intent= Intent(this@Main37Activity,Main37Activity::class.java)
                    startActivity(intent)
                }
                bu4.id -> {var intent= Intent(this@Main37Activity,Main42Activity::class.java)
                    startActivity(intent)
                    score++
                }
            }
        }
    }
}
