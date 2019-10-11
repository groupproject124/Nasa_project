package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main52.*

class Main52Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main52)
        if (score>20)
        {tt1.setText("your final score is "+ score.toString()+"you are going good")}
        else{
            tt1.setText("your final score is "+ score.toString()+"you should learn more")
        }
    }
}
