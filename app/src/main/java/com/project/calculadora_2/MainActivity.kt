package com.project.calculadora_2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var operacao = 0
    private var First = false
    private var valor1: Double? = null
    private var resultadoOperacao = 0.0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultado = findViewById<TextView>(R.id.resultado)
        val btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("7")
        }
        val btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("8")
        }
        val btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("9")
        }
        val btndiv = findViewById<Button>(R.id.btndiv)
        btndiv.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            operacao = 4
        }
        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("4")
        }
        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("5")
        }
        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("6")
        }
        val btnmulti = findViewById<Button>(R.id.btnmulti)
        btnmulti.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            operacao = 3
        }
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("1")
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("2")
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("3")
        }
        val btnmenos = findViewById<Button>(R.id.btnmenos)
        btnmenos.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            operacao = 2
        }
        val btn0 = findViewById<Button>(R.id.btn0)
        btn0.setOnClickListener { v: View? ->
            Click(resultado)
            resultado.append("0")
        }
        val btnponto = findViewById<Button>(R.id.btnponto)
        btnponto.setOnClickListener { v: View? ->
            resultado.append(".")
            First = true
        }
        val btnmais = findViewById<Button>(R.id.btnsoma)
        btnmais.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            operacao = 1
        }
        val btnPot = findViewById<Button>(R.id.btnPot)
        btnPot.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            operacao = 5
        }
        val btnRaiz = findViewById<Button>(R.id.btnRaiz)
        btnRaiz.setOnClickListener { v: View? ->
            valor1 = java.lang.Double.valueOf(resultado.text.toString())
            resultado.text = ""
            resultadoOperacao = Math.sqrt(valor1!!)
            resultado.text = resultadoOperacao.toString()
            operacao = 6
        }
        val btnigual = findViewById<Button>(R.id.btnigual)
        btnigual.setOnClickListener { v: View? ->
            val valor2 = java.lang.Double.valueOf(resultado.text.toString())
            resultadoOperacao = when (operacao) {
                1 -> valor1!! + valor2
                2 -> valor1!! - valor2
                3 -> valor1!! * valor2
                4 -> valor1!! / valor2
                5 -> Math.pow(valor1!!, valor2)
                else -> 0.0
            }
            resultado.text = resultadoOperacao.toString()
        }
        val btnlimpar = findViewById<Button>(R.id.btnlimpar)
        btnlimpar.setOnClickListener { v: View? ->
            valor1 = 0.0
            operacao = 0
            First = false
            resultado.text = "0"
        }
    }

    /**method to "clear" filled fields */
    private fun Click(text: TextView) {
        if (!First) {
            First = true
            text.text = ""
        }
    }
}