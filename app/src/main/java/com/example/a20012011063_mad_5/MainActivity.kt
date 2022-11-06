package com.example.mad5_20012011063

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a20012011063_mad_5.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun play(view: View) {
        Intent(applicationContext, MyService::class.java)
            .putExtra(MyService.DATA_KEY, MyService.DATA_VALUE)
            .apply {
                startService(this)
            }
        Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
    }

    fun stop(view: View) {
        Intent(applicationContext, MyService::class.java)
            .apply {
                stopService(this)
            }
        Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
    }

}