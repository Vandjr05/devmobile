package com.example.alarmwhater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edit_peso: EditText
    private lateinit var edit_idade: EditText
    private lateinit var bt_calcular: Button
    private lateinit var txt_resultado_ml: TextView
    private lateinit var ic_redefinir_dados: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IniciarComponentes()


    }
    private fun IniciarComponentes (){
        edit_peso = findViewById(R.id.edit_peso)
        edit_idade = findViewById(R.id.edit_idade)
        bt_calcular = findViewById(R.id.bt_calcular)
        txt_resultado_ml = findViewById(R.id.txt_resultado_ml)
        ic_redefinir_dados = findViewById(R.id.ic_redefinir)
    }
}