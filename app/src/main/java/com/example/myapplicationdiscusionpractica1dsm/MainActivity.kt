package com.example.myapplicationdiscusionpractica1dsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var numero1 : EditText
lateinit var numero2 : EditText
lateinit var sumar : Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.TxtNumero1)
        numero2 = findViewById(R.id.TxtNumero2)
        sumar = findViewById(R.id.BtnSumar)
        resultado = findViewById(R.id.LlbResultado)

        sumar.setOnClickListener{
            //Usamos If para evitar que la App tenga error por si no hay ningún número
            if(numero1.text.isNotEmpty() and numero2.text.isNotEmpty()){
                var n1:Float = numero1.text.toString().toFloat()
                var n2:Float = numero2.text.toString().toFloat()
                var sumados = n1 + n2
                resultado.setText("La suma de "+ numero1.text.toString() + " y "
                        + numero2.text.toString() + " es: \n" + String.format("%.3f",sumados))
            }else{
                resultado.setText("")
            }
        }
    }
}