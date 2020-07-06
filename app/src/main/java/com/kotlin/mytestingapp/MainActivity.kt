package com.kotlin.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button
    private lateinit var tvTeext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTeext= findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (view.id == R.id.btn_set_value) {
            tvTeext.text="19"
        }
    }
}