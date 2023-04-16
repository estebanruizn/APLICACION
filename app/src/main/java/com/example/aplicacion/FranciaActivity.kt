package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class FranciaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_francia)

        val volver = findViewById<Button>(R.id.btnvolver5)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosfrancia = findViewById<ListView>(R.id.titulosfrancia)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1998","2018")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosfrancia.adapter = arrayAdapter

        titulosfrancia.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1998" -> {
                    Toast.makeText(this, "Francia 3-0 Brasil", Toast.LENGTH_SHORT).show()

                }
                "2018" -> {
                    Toast.makeText(this, "Francia 4-2 Croacia", Toast.LENGTH_SHORT).show()

                }
                else -> "Seleccion invalida"
            }
        }
    }
}