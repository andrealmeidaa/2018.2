package br.edu.ifrn.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view:View){
        val context=applicationContext
        val toast:Toast=Toast.makeText(context,"Hello Toast",Toast.LENGTH_LONG)
        toast.show()
    }

    fun countUp(view:View){
        val contador=textView_count.text.toString().toInt()+1
        textView_count.text=contador.toString()
    }
}
