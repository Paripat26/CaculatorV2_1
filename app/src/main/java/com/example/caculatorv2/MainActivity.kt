package com.example.caculatorv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clear_btn.setOnClickListener {
            num_text.setText("0")
        }
        b7.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "7")
            } else {
                num_text.setText(num_text.text.toString() + "7")
            }
        }
        b8.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "8")
            } else {
                num_text.setText(num_text.text.toString() + "8")
            }
        }
        b9.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "9")
            } else {
                num_text.setText(num_text.text.toString() + "9")
            }
        }
        b4.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "4")
            } else {
                num_text.setText(num_text.text.toString() + "4")
            }
        }
        b5.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "5")
            } else {
                num_text.setText(num_text.text.toString() + "5")
            }
        }
        b6.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "6")
            } else {
                num_text.setText(num_text.text.toString() + "6")
            }
        }
        b1.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "1")
            } else {
                num_text.setText(num_text.text.toString() + "1")
            }
        }
        b2.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "2")
            } else {
                num_text.setText(num_text.text.toString() + "2")
            }
        }
        b3.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("")
                num_text.setText(num_text.text.toString() + "3")
            } else {
                num_text.setText(num_text.text.toString() + "3")
            }
        }
        b0.setOnClickListener {
            if (num_text.text == "0") {
                num_text.setText("0")
            } else {
                num_text.setText(num_text.text.toString() + "0")
            }
        }
        del_btn.setOnClickListener {
            if (num_text.text == "0" || num_text.text.length.toString() == "1") {
                num_text.setText("0")
            } else {
                num_text.setText(num_text.text.toString().dropLast(1))
            }
        }
    }
}
