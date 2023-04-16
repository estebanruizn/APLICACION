package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class BrasilActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasil)

        val volver = findViewById<Button>(R.id.btnvolver)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulosbrasil = findViewById<ListView>(R.id.titulosbrasil)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1958","1962","1970","1994","2002")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulosbrasil.adapter = arrayAdapter

        titulosbrasil.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1958" -> {
                    Toast.makeText(this, " Brasil 5-2 Suecia", Toast.LENGTH_SHORT).show()

                }
                "1962" -> {
                    Toast.makeText(this, "Brasil 3-1 Checoslovaquia", Toast.LENGTH_SHORT).show()
                }
                "1970" -> {
                    Toast.makeText(this, "Brasil 4-1 Italia", Toast.LENGTH_SHORT).show()
                }
                "1994" -> {
                    Toast.makeText(this, "Brasil 0-0 (3-2 penales) Italia", Toast.LENGTH_SHORT).show()
                }
                "2002" -> {
                    Toast.makeText(this, "Brasil 2-0 Alemania", Toast.LENGTH_SHORT).show()
                }
                else -> "Seleccion invalida"
            }
        }
    }
}