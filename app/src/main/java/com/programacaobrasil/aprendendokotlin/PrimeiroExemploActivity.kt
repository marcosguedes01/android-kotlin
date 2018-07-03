package com.programacaobrasil.aprendendokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_primeiro_exemplo.*
import java.util.*

class PrimeiroExemploActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeiro_exemplo)
    }

    fun sortearNumero(view: View)
    {
        var numeroSorteado = Random().nextInt(11);
        text_result.setText("Número sorteado é $numeroSorteado")
    }
}
