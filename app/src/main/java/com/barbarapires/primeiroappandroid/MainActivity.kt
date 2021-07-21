package com.barbarapires.primeiroappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textoGlobal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoGlobal= findViewById(R.id.texto)

        var nome: String = "Adriana"
        nome=" Drica"

        textoGlobal.text= construirUmaMensagem(nome)
    }
    fun construirUmaMensagem(nomeParametro:String):String= "Boas vindas,$nomeParametro"
}