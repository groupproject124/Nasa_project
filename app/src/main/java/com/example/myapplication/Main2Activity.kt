package com.example.myapplication

import android.content.Intent
import android.net.Uri
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
        if (ch==1){
            when(cd.id){
                bu1.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/articles/gamma-ray-bursts"))
                    startActivity(intent)}
                bu2.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/news-releases/2013/news-2013-30.html"))
                    startActivity(intent)}
                bu3.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/news-releases/1990/news-1990-11.html"))
                    startActivity(intent)}
                bu4.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/science/stars-and-nebulas\n"))
                    startActivity(intent)}
                bu5.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/quick-facts/all-quick-facts"))
                    startActivity(intent)}
                bu6.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/news-releases/1997/news-1997-36.html"))
                    startActivity(intent)}
                bu7.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/news-releases/2013/news-2013-30.html"))
                    startActivity(intent)}
                bu8.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/mission-and-telescope "))
                    startActivity(intent)}
                bu9.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://hubblesite.org/contents/news-releases/1997/news-1997-36.html"))
                    startActivity(intent)}
                bu10.id->{var intent= Intent(Intent.ACTION_VIEW, Uri.parse(" https://hubblesite.org/science/exoplanets"))
                    startActivity(intent)}
            }

        }
        if(ch==2){
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
