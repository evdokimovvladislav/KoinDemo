package com.example.koindemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.koindemo.details.Processor
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val computer1: Computer = get { parametersOf(Processor()) }

    //Ленивая инициализация
    private val computer2: Computer by inject { parametersOf(Processor()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text1).text = computer1.toString()

        findViewById<TextView>(R.id.text2).text = computer2.toString()
    }
}