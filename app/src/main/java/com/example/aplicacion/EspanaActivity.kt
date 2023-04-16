package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class EspanaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espana)

        val volver = findViewById<Button>(R.id.btnvolver4)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosespaña = findViewById<ListView>(R.id.titulosespaña)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("2010")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosespaña.adapter = arrayAdapter

        titulosespaña.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1958" -> {
                    Toast.makeText(this, "España 1-0 Países Bajos", Toast.LENGTH_SHORT).show()

                }
                else -> "Seleccion invalida"
            }
        }
    }
}