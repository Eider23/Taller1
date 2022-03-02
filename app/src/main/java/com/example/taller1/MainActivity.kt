package com.example.taller1

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.text.BreakIterator
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Listener addRellenar
        findViewById<Button>(R.id.button_play_again).setOnClickListener {
            addRellenar(it)
        }

    }

    fun main (args : Array<String>){
        // var nombre del objeto = nombre de la clase()

        var random = Random()
        var num = random.nextInt(1000) +1


    if (R.id.textView_numero > num){


    }else if(R.id.textView_numero < num){


    }else{

    }



    }

      fun addRellenar(view: View){
        val editText = findViewById<EditText>(R.id.rellenar)
        val rellenarTextView = findViewById<TextView>(R.id.textView_numero)

        rellenarTextView.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE

        rellenarTextView.visibility= View.VISIBLE

        //hide
        val im = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        im.hideSoftInputFromWindow(view.windowToken,0)




    }

}