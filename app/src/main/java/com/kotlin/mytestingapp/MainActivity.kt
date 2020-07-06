package com.kotlin.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private  var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText= findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)

        names.add("Rois Faozi")
        names.add("kamu Jahat")
        names.add("Kurang Bagus")
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            val name = StringBuilder()
            for (i in 0..3) {
                name.append(names[i]).append("\n")
            }
            tvText.text="19"
        }
    }
}