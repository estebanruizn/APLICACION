package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class InglaterraActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inglaterra)

        val volver = findViewById<Button>(R.id.btnvolver6)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosinglaterra = findViewById<ListView>(R.id.titulosinglaterra)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1966")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosinglaterra.adapter = arrayAdapter

        titulosinglaterra.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1966" -> {
                    Toast.makeText(this, "Inglaterra 4-2 Alemania Occidental", Toast.LENGTH_SHORT).show()

                }
                else -> "Seleccion invalida"
            }
        }

    }
}