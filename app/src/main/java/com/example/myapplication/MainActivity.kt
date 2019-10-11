package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
var ch=0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun skip(view:View){
        var cd=view as Button
        when(cd.id){
            bu1.id->{
                ch=2
                var intent= Intent(this,Main2Activity::class.java)
                startActivity(intent)}
            bu2.id->{
                ch=1
                var intent=Intent(this,Main2Activity::class.java)
                startActivity(intent)}
        }
    }
}
