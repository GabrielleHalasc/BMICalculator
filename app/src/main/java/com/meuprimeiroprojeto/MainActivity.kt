package com.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso : EditText = findViewById(R.id.edittext_peso)
        val edtAltura : EditText = findViewById(R.id.edittext_altura)


        btnCalcular.setOnClickListener{

           val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {


                val peso: Float = edtPeso.text.toString().toFloat()
                val altura: Float = edtAltura.text.toString().toFloat()

                val alturaFinal: Float = altura * altura
                val resultado: Float = peso / alturaFinal


                val intent = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("Extra_result", resultado)
                    }

                startActivity(intent)
            } else {
                Toast.makeText(this,"Fill all the fields",Toast.LENGTH_LONG).show()
            }


        }

    }
        // Recuperar UI component no arquivo Kotlin
        // recupera o botao usando findviewbyid
        // Id do components
        // Colocar açao em um Botao
        //colcoa açao usando a variavel, em seguida vem um "." e chamando a funçao
        // usando setonclicklistoner
        // val intent serve para dizer ao java que eu quero sari de uma tela e ir a outra)
}
