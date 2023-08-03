package com.group5.laboratorio2_08_08_2023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number: Double = 0.0
    var num1: Double = 0.0
    var operator: Int = 0
    lateinit var txtNum1: TextView
    lateinit var txtNum2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNum1 = findViewById(R.id.textView1)
        txtNum2 = findViewById(R.id.textView2)
    }

    @SuppressLint("SetTextI18n")
    fun pressDigit(view: View) {
        val num2 = txtNum2.text.toString()

        when(view.id) {
            R.id.btn0 -> txtNum2.text = num2 + "0"
            R.id.btn1 -> txtNum2.text = num2 + "1"
            R.id.btn2 -> txtNum2.text = num2 + "2"
            R.id.btn3 -> txtNum2.text = num2 + "3"
            R.id.btn4 -> txtNum2.text = num2 + "4"
            R.id.btn5 -> txtNum2.text = num2 + "5"
            R.id.btn6 -> txtNum2.text = num2 + "6"
            R.id.btn7 -> txtNum2.text = num2 + "7"
            R.id.btn8 -> txtNum2.text = num2 + "8"
            R.id.btn9 -> txtNum2.text = num2 + "9"
            R.id.btnPoint -> {
                if (txtNum2.text.contains(".")) return
                txtNum2.text = "$num2."
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun pressOperator(view: View) {
         num1 = txtNum2.text.toString().toDouble()
        val num2Text: String = txtNum2.text.toString()
        txtNum2.text = ""

        when(view.id) {
            R.id.btnAdd -> {
                txtNum1.text = "$num2Text+"
                operator = 1
            }
            R.id.btnMinus -> {
                txtNum1.text = "$num2Text-"
                operator = 2
            }
            R.id.btnMultiply -> {
                txtNum1.text = num2Text + "x"
                operator = 3
            }
            R.id.btnDivide -> {
                txtNum1.text = "$num2Text/"
                operator = 4
            }
        }
    }
}