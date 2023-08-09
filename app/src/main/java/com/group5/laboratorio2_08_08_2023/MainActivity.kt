package com.group5.laboratorio2_08_08_2023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var operator: Int = 0
    private lateinit var txtNum1: TextView
    private lateinit var txtNum2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize references to TextViews
        txtNum1 = findViewById(R.id.textView1)
        txtNum2 = findViewById(R.id.textView2)

        // Initialize buttons
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnEqual: Button = findViewById(R.id.btnEqual)

        // Set click listener for the Equal button
        btnEqual.setOnClickListener{
            val num2: Double = txtNum2.text.toString().toDouble()
            var result = 0.0

            // Perform the operation based on the selected operator
            when(operator) {
                1 -> result = num1 + num2
                2 -> result = num1 - num2
                3 -> result = num1 * num2
                4 -> {
                    result = if (num2 == 0.0) {
                        0.0
                    } else {
                        num1/num2
                    }
                }
            }

            // Display the result and reset the input
            txtNum2.text = result.toString()
            txtNum1.text = ""
        }

        // Set click listener for the Clear button
        btnClear.setOnClickListener{
            txtNum1.text = ""
            txtNum2.text = ""
            num1 = 0.0
            operator = 0
        }
    }

    @SuppressLint("SetTextI18n")
    fun pressDigit(view: View) {
        val num2 = txtNum2.text.toString()

        // Append the selected digit to the current number
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

        // Set the operator based on the button clicked
        when(view.id) {
            R.id.btnAdd -> {
                txtNum1.text = "$num2Text +"
                operator = 1
            }
            R.id.btnMinus -> {
                txtNum1.text = "$num2Text -"
                operator = 2
            }
            R.id.btnMultiply -> {
                txtNum1.text = "$num2Text x"
                operator = 3
            }
            R.id.btnDivide -> {
                txtNum1.text = "$num2Text ÷"
                operator = 4
            }
        }
    }
}
