package br.com.lidiane.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        carregar()
    }

    private fun carregar() {
          //  Handler().postDelayed()
    }

    private  fun chamarProximaTela(){
        var proximaTelaIntent = Intent(this, FormularioActivity::class.java)
        startActivity(intent)
        finish()
    }

}
