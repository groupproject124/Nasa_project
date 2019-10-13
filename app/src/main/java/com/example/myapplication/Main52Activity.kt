package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main52.*

class Main52Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main52)
        if(score==38)
        {tt1.setProgress(100)
        tt2.setText("You are going right keep going with the knowledge")}
        else if(38>score&&score>=35){
            tt1.setProgress(90)
            tt2.setText("You are going right keep going with the knowledge")
        }
        else if(38>score&&score>=35){
            tt1.setProgress(80)
            tt2.setText("You are going right keep going with the knowledge")
        }
        else if(35>score&&score>=26){
            tt1.setProgress(70)
            tt2.setText("you are good but can do a lot better")
        }
        else if(26>score&&score>=18){
            tt1.setProgress(60)
            tt2.setText("you are good but can do a lot better")
        }
        else if(18>score&&score>=10){
            tt1.setProgress(50)
            tt2.setText("you need a very huge improvement go and study")
        }
        else if(10>score&&score>=0){
            tt1.setProgress(40)
            tt2.setText("you need a very huge improvement go and study")
        }
    }
}
