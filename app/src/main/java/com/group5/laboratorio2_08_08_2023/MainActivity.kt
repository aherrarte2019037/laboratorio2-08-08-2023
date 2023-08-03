package com.group5.laboratorio2_08_08_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressDigit(view: View) {
        val txtNum2: TextView = findViewById(R.id.textView2);
        var num2 = txtNum2.text.toString();

        when(view.id) {
            R.id.btn0 -> txtNum2.text = num2.toString() + "0"
            R.id.btn1 -> txtNum2.text = num2.toString() + "1"
            R.id.btn2 -> txtNum2.text = num2.toString() + "2"
            R.id.btn3 -> txtNum2.text = num2.toString() + "3"
            R.id.btn4 -> txtNum2.text = num2.toString() + "4"
            R.id.btn5 -> txtNum2.text = num2.toString() + "5"
            R.id.btn6 -> txtNum2.text = num2.toString() + "6"
            R.id.btn7 -> txtNum2.text = num2.toString() + "7"
            R.id.btn8 -> txtNum2.text = num2.toString() + "8"
            R.id.btn9 -> txtNum2.text = num2.toString() + "9"
            R.id.btnPoint -> {
                if (txtNum2.text.contains(".")) return;
                txtNum2.text = "$num2."
            }
        }
    }
}