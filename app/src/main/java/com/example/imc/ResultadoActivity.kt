package com.example.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    private lateinit var titleDensidadeCorporal: TextView
    private lateinit var textViewHeaderDensidadeCorporal: TextView
    private lateinit var textViewResultadoDensidadeCorporal: TextView
    private lateinit var textViewAltr: TextView
    private lateinit var textViewPeso: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        // Inicializando os componentes com findViewById
        titleDensidadeCorporal = findViewById(R.id.titleDensidadeCorporal)
        textViewHeaderDensidadeCorporal = findViewById(R.id.textViewHeaderDensidadeCorporal)
        textViewResultadoDensidadeCorporal = findViewById(R.id.textViewResultadoDensidadeCorporal)
        textViewAltr = findViewById(R.id.textViewAltr)
        textViewPeso = findViewById(R.id.textViewPeso)

        // Obtendo o objeto IMC passado pela Intent
        val imc = intent.getParcelableExtra<IMC>("value")

        // Configurando os textos dos componentes da UI
        titleDensidadeCorporal.text = imc?.nome.toString()
        textViewHeaderDensidadeCorporal.text = imc?.calcular()
        textViewResultadoDensidadeCorporal.text = "IMC: ${imc?.imc.toString()}"
        textViewAltr.text = "Altura: ${imc?.altura.toString()}"
        textViewPeso.text = "Peso: ${imc?.peso.toString()}"
    }
}
