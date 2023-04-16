package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class AlemaniaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alemania)

        val volver = findViewById<Button>(R.id.btnvolver2)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosalemania = findViewById<ListView>(R.id.titulosalemania)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1954","1974","1990","2014")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosalemania.adapter = arrayAdapter

        titulosalemania.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1954" -> {
                    Toast.makeText(this, "Alemania Occidental 3 Hungria 2", Toast.LENGTH_SHORT).show()

                }
                "1974" -> {
                    Toast.makeText(this, "Alemania Occidental 2 Paises Bajos 1", Toast.LENGTH_SHORT).show()
                }
                "1990" -> {
                    Toast.makeText(this, "Alemania Occidental 1 Argentina 0", Toast.LENGTH_SHORT).show()
                }
                "2014" -> {
                    Toast.makeText(this, "Aleminia 1 Argentina 0", Toast.LENGTH_SHORT).show()
                }
                else -> "Seleccion invalida"
            }
        }
    }
    }