package com.chollan.kalkulacholl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnTambah : Button
    private lateinit var btnKurang : Button
    private lateinit var btnKali : Button
    private lateinit var btnBagi : Button
    private lateinit var btnClear : Button
    private lateinit var angka1 : EditText
    private lateinit var angka2 : EditText
    private lateinit var textHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        btnBagi = findViewById(R.id.btnBagi)
        btnClear = findViewById(R.id.btnClear)
        angka1 = findViewById(R.id.angka1)
        angka2 = findViewById(R.id.angka2)
        textHasil = findViewById(R.id.textHasil)

        btnTambah.setOnClickListener(this)
        btnKurang.setOnClickListener(this)
        btnKali.setOnClickListener(this)
        btnBagi.setOnClickListener(this)
        btnClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            val inputAngka1 = angka1.text.toString().trim()
            val inputAngka2 = angka2.text.toString().trim()

            when (v.id) {
                R.id.btnTambah -> {
                    val jumlah = inputAngka1.toDouble() + inputAngka2.toDouble()
                    textHasil.text = jumlah.toString()
                }
                R.id.btnKurang -> {
                    val jumlah = inputAngka1.toDouble() - inputAngka2.toDouble()
                    textHasil.text = jumlah.toString()
                }
                R.id.btnKali -> {
                    val jumlah = inputAngka1.toDouble() * inputAngka2.toDouble()
                    textHasil.text = jumlah.toString()
                }
                R.id.btnBagi -> {
                    val jumlah = inputAngka1.toDouble() / inputAngka2.toDouble()
                    textHasil.text = jumlah.toString()
                }
                R.id.btnClear -> {
                    angka1.text.clear()
                    angka2.text.clear()
                    textHasil.text = "0"
                    Toast.makeText(this, "angka1 : $inputAngka1, angka 2: $inputAngka2, jml: ", Toast.LENGTH_LONG)
                }
            }
        }
    }
}