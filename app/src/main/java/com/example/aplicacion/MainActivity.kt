package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

//ESTEBAN ANDRES RUIZ NOVOA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerpaises = findViewById<Spinner>(R.id.spinnerpaises)

        val opciones = arrayOf(
            "Seleccione un pais",
            "URUGUAY",
            "BRASIL",
            "ARGENTINA",
            "ITALIA",
            "ALEMANIA",
            "INGLATERRA",
            "FRANCIA",
            "ESPAÑA"
        )

        val adap = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones)

        spinnerpaises.adapter = adap

        spinnerpaises.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (spinnerpaises.selectedItem.toString()) {
                    "ARGENTINA" -> {
                        Toast.makeText(this@MainActivity, "Seleccionó Argentina 3 veces campeon del mundo", Toast.LENGTH_LONG).show()
                        val intent = Intent(this@MainActivity, ArgentinaActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "BRASIL" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Brasil 5 veces campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, BrasilActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "URUGUAY" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Uruguay 2 veces campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, UruguayActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "ALEMANIA" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Alemania 4 veces campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, AlemaniaActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "INGLATERRA" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Inglaterra 1 vez campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, InglaterraActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "ITALIA" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Italia 4 veces campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, ItaliaActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "ESPAÑA" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó España 1 vez campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, EspanaActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                    "FRANCIA" -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Seleccionó Francia 2 veces campeon del mundo",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this@MainActivity, FranciaActivity::class.java)
                        startActivity(intent)
                        this@MainActivity.finish()
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
    }
}