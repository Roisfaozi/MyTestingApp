package com.kotlin.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private  var names = ArrayList<String>()

    private lateinit var imagePriview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue= findViewById(R.id.btn_set_value)

        tvText= findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)

        names.add("Rois Faozi")
        names.add("kamu Jahat")
        names.add("Kurang Bagus")

        imagePriview = findViewById(R.id.img_preview)
        img_preview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text="19"
        }
    }
}