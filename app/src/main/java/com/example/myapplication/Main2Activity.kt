package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bu1
import kotlinx.android.synthetic.main.activity_main.bu2
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun skip(view: View){
        var cd=view as Button
        if (ch==2){
            when(cd.id){
                bu1.id->{}
                bu2.id->{}
                bu3.id->{}
                bu4.id->{}
                bu5.id->{}
                bu6.id->{}
                bu7.id->{}
                bu8.id->{}
                bu9.id->{}
                bu10.id->{}
            }

        }
        if(ch==1){
            when(cd.id){
                bu1.id->{
                    var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)
                }
                bu2.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu3.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu4.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu5.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu6.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu7.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu8.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu9.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
                bu10.id->{var intent= Intent(this@Main2Activity,Main3Activity::class.java)
                    startActivity(intent)}
            }
        }

    }
}
