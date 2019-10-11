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

class Main25Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main25)
    }
    fun skip(view: View) {
        var cd = view as RadioButton
        if(score==4){
            when (cd.id) {
                bu1.id -> {
                    var intent= Intent(this@Main25Activity,Main40Activity::class.java)
                    startActivity(intent)
                    score++

                }
                bu2.id -> {
                    var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)
                }
                bu3.id -> { var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)
                }
                bu4.id -> {var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)

                }
            }
        }
        else{
            when (cd.id) {
                bu1.id -> {
                    var intent= Intent(this@Main25Activity,Main36Activity::class.java)
                    startActivity(intent)
                    score++

                }
                bu2.id -> {
                    var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)
                }
                bu3.id -> { var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)
                }
                bu4.id -> {var intent= Intent(this@Main25Activity,Main25Activity::class.java)
                    startActivity(intent)
                    score++
                }
            }
        }
    }
}
