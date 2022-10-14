package com.example.radiobox

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var layout : LinearLayout

    lateinit var btn : Button
    lateinit var green : RadioButton
    lateinit var red : RadioButton
    lateinit var yellow: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.layout)
        btn = findViewById(R.id.button)
        green = findViewById(R.id.green)
        red = findViewById(R.id.red)
        yellow = findViewById(R.id.yellow)

        btn.setOnClickListener{

            if (green.isChecked){
                layout.setBackgroundColor(Color.GREEN)
            }
            if (red.isChecked){
                layout.setBackgroundColor(Color.RED)
            }
            if (yellow.isChecked){
                layout.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}