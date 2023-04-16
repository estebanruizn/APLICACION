package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class ArgentinaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argentina)

        val volver = findViewById<Button>(R.id.btnvolver3)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosargentina = findViewById<ListView>(R.id.titulosargentina)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1978","1986","2023")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosargentina.adapter = arrayAdapter

        titulosargentina.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1978" -> {
                    Toast.makeText(this, "Argentina 1 Inglaterra 1", Toast.LENGTH_SHORT).show()

                }
                "1986" -> {
                    Toast.makeText(this, "Argentina 3 Paises Bajos 1", Toast.LENGTH_SHORT).show()
                }
                "2023" -> {
                    Toast.makeText(this, "Argentina 3 Francia 3", Toast.LENGTH_SHORT).show()
                }
                else -> "Seleccion invalida"
            }
        }

    }
}