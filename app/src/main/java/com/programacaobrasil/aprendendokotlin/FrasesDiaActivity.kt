package com.programacaobrasil.aprendendokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_frases_dia.*
import java.util.*

class FrasesDiaActivity : AppCompatActivity() {

    var frases = arrayOf(
            "O importante não é vencer todos os dias, mas lutar sempre.",
            "Maior que a tristeza de não haver cencido é a vergonha de não ter tentado.",
            "É melhor conquistar a si mesmo do que vencer mil batalhas.",
            "Enquanto houver vontade de lutar havera esperança de vencer.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases_dia)
    }

    fun gerarFrase(view: View)
    {
        txt_frase.setText(frases.get(Random().nextInt(frases.size)))
    }
}
