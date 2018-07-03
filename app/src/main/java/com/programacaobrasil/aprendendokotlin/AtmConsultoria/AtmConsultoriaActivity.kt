package com.programacaobrasil.aprendendokotlin.AtmConsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.programacaobrasil.aprendendokotlin.R
import kotlinx.android.synthetic.main.activity_atm_consultoria.*

class AtmConsultoriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atm_consultoria)

        btn_clientes.setOnClickListener{
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }

        btn_empresa.setOnClickListener{
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        btn_servicos.setOnClickListener{
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        btn_contato.setOnClickListener{
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }
    }
}
