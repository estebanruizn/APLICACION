package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class ItaliaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italia)

        val volver = findViewById<Button>(R.id.btnvolver7)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val titulositalia = findViewById<ListView>(R.id.titulositalia)

        val arrayAdapter: ArrayAdapter<*>

        val objetos = mutableListOf("1934","1938","1982","2006")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,objetos)

        titulositalia.adapter = arrayAdapter

        titulositalia.setOnItemClickListener { parent, view, position, id ->

            val seleccion = parent.getItemAtPosition(position).toString()

            val resultado = when (seleccion) {
                "1934" -> {
                    Toast.makeText(this, "Italia 2-1 Checoslovaquia", Toast.LENGTH_SHORT).show()

                }
                "1938" -> {
                    Toast.makeText(this, " Italia 4-2 Hungría", Toast.LENGTH_SHORT).show()

                }
                "1982" -> {
                    Toast.makeText(this, "Italia 3-1 Alemania Occidental", Toast.LENGTH_SHORT).show()

                }
                "2006" -> {
                    Toast.makeText(this, "Italia 1-1 (5-3 penales) Francia", Toast.LENGTH_SHORT).show()

                }
                else -> "Seleccion invalida"
            }
        }
    }
}