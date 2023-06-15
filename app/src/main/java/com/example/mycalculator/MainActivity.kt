package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var txtInput: TextInputEditText
    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var buttonThree: Button
    lateinit var buttonFour: Button
    lateinit var buttonFive: Button
    lateinit var buttonSix: Button
    lateinit var buttonSeven: Button
    lateinit var buttonEight: Button
    lateinit var buttonNine: Button
    lateinit var buttonZero: Button
    lateinit var buttonPoint: Button
    lateinit var buttonPlus: Button
    lateinit var buttonMinus: Button
    lateinit var buttonMult: Button
    lateinit var buttonSplit: Button
    lateinit var buttonEqual: Button
    lateinit var buttonClear: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtInput = findViewById(R.id.txt_input)
        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        buttonFour = findViewById(R.id.buttonFour)
        buttonFive = findViewById(R.id.buttonFive)
        buttonSix = findViewById(R.id.buttonSix)
        buttonSeven = findViewById(R.id.buttonSeven)
        buttonEight = findViewById(R.id.buttonEight)
        buttonNine = findViewById(R.id.buttonNine)
        buttonZero = findViewById(R.id.buttonZero)
        buttonPoint = findViewById(R.id.buttonPoint)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMinus = findViewById(R.id.buttonMinus)
        buttonMult = findViewById(R.id.buttonMult)
        buttonSplit = findViewById(R.id.buttonSplit)
        buttonEqual = findViewById(R.id.buttonEqual)
        buttonClear = findViewById(R.id.button_clear)


        buttonOne.setOnClickListener {
            var txt = "${txtInput.text}1"
            txtInput.setText(txt)
        }

        buttonTwo.setOnClickListener {
            var txt = "${txtInput.text}2"
            txtInput.setText(txt)
        }

        buttonThree.setOnClickListener {
            var txt = "${txtInput.text}3"
            txtInput.setText(txt)
        }

        buttonFour.setOnClickListener {
            var txt = "${txtInput.text}4"
            txtInput.setText(txt)
        }

        buttonFive.setOnClickListener {
            var txt = "${txtInput.text}5"
            txtInput.setText(txt)
        }

        buttonSix.setOnClickListener {
            var txt = "${txtInput.text}6"
            txtInput.setText(txt)
        }

        buttonSeven.setOnClickListener {
            var txt = "${txtInput.text}7"
            txtInput.setText(txt)
        }

        buttonEight.setOnClickListener {
            var txt = "${txtInput.text}8"
            txtInput.setText(txt)
        }

        buttonNine.setOnClickListener {
            var txt = "${txtInput.text}9"
            txtInput.setText(txt)
        }

        buttonZero.setOnClickListener {
            var txt = "${txtInput.text}0"
            txtInput.setText(txt)
        }

        buttonPoint.setOnClickListener {
            var txt = "${txtInput.text}."
            txtInput.setText(txt)
        }

        buttonPlus.setOnClickListener {
            var txt = "${txtInput.text} + "
            txtInput.setText(txt)
        }

        buttonMinus.setOnClickListener {
            var txt = "${txtInput.text} - "
            txtInput.setText(txt)
        }

        buttonMult.setOnClickListener {
            var txt = "${txtInput.text} x "
            txtInput.setText(txt)
        }

        buttonSplit.setOnClickListener {
            var txt = "${txtInput.text} / "
            txtInput.setText(txt)
        }

        buttonEqual.setOnClickListener {
            var txt = "${txtInput.text}"
            var myArr = txt.split(" ")
            var result: Double = 0.0

            when (myArr[1]) {
                "+" -> result = myArr[0].toDouble() + myArr[2].toFloat()
                "-" -> result = myArr[0].toDouble() - myArr[2].toFloat()
                "x" -> result = myArr[0].toDouble() * myArr[2].toFloat()
                "/" -> result = myArr[0].toDouble() / myArr[2].toFloat()
            }

            txtInput.setText("$result")
        }

        buttonClear.setOnClickListener {
            txtInput.setText("")
        }


    }
}