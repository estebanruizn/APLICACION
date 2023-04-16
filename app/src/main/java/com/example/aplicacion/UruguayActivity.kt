package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class UruguayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uruguay)

        val volver = findViewById<Button>(R.id.btnvolver8)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosuruguay = findViewById<ListView>(R.id.titulosuruguay)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1930","1950")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosuruguay.adapter = arrayAdapter

        titulosuruguay.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1930" -> {
                    Toast.makeText(this, "Uruguay 4-2 Argentina", Toast.LENGTH_SHORT).show()

                }
                "1950" -> {
                    Toast.makeText(this, "Uruguay 2-1 Brasil", Toast.LENGTH_SHORT).show()

                }
                else -> "Seleccion invalida"
            }
        }
    }
}