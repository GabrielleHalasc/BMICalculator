package com.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

       //botao voltar aparecendo
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val tvResult =findViewById<TextView>(R.id.tv_Results)
        val tvRating = findViewById<TextView>(R.id.tv_Rating)
        val result = intent.getFloatExtra("Extra_result", 0.1f)

        tvResult.text = result.toString()

        val Rating = if ( result< 18.5){
             "Under the weight"
        }else if (result in 18.5..24.9){
          "Normal"
        }else if (result in 25.0..29.9){
            "Overweight"
        }else if (result in 30.0..39.9){
         "Obesity 1"
        }else{
          "Obesity 2"
               }
        tvRating.text = getString(R.string.message_Rating, Rating)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

    }
