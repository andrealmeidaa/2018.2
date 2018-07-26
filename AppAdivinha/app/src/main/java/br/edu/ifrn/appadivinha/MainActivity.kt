package br.edu.ifrn.appadivinha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val rnd=Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotaoAdivinhar(view:View){
        val s=txtNumero.text.toString().toInt()
        val numero=rnd.nextInt(11)
        if (s==numero){
            txtResultado.text="Acertou o número"
        }else{
            txtResultado.text="Errou - ${numero}"
        }

    }
}
