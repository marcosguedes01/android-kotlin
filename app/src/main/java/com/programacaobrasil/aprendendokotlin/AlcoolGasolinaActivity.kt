package com.programacaobrasil.aprendendokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_alcool_gasolina.*

class AlcoolGasolinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcool_gasolina)
    }

    fun btnCalcular(view : View)
    {
        val precoAlcool = edt_alcool.text.toString()
        val precoGasolina = edt_gasolina.text.toString()

        if (validarCampos(precoAlcool, precoGasolina))
        {
            calcularMelhorPreco(precoAlcool.toDouble(), precoGasolina.toDouble())
        }
        else
        {
            txt_resultado.setText("Preencha os preços primeiro!")
        }
    }

    fun validarCampos(precoAlcool : String, precoGasolina : String) : Boolean
    {
        return !(precoAlcool.isNullOrEmpty() || precoGasolina.isNullOrEmpty())
    }

    fun calcularMelhorPreco(precoAlcool : Double, precoGasolina : Double)
    {
        val resultadoPreco = precoAlcool / precoGasolina
        if ( resultadoPreco >= 0.7 ){
            txt_resultado.setText("Melhor utilizar Gasolina!")
        }
        else
        {
            txt_resultado.setText("Melhor utilizar Álcool!")
        }
    }
}
