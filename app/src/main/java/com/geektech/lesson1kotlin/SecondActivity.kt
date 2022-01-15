package com.geektech.lesson1kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.lesson1kotlin.databinding.ActivityMainBinding
import com.geektech.lesson1kotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    var number =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            binding.tvNumber.text = "${++number}"
        }
    }
}