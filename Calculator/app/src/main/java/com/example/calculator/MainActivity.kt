package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.time.chrono.JapaneseEra.values

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.one.setOnClickListener {
            emptyText()
            binding.input.append("1")
        }
        binding.two.setOnClickListener {
            emptyText()
            binding.input.append("2")
        }
        binding.three.setOnClickListener {
            emptyText()
            binding.input.append("3")
        }
        binding.four.setOnClickListener {
            emptyText()
            binding.input.append("4")
        }
        binding.five.setOnClickListener {
            emptyText()
            binding.input.append("5")
        }
        binding.six.setOnClickListener {
            emptyText()
            binding.input.append("6")
        }
        binding.seven.setOnClickListener {
            emptyText()
            binding.input.append("7")
        }
        binding.eight.setOnClickListener {
            emptyText()
            binding.input.append("8")
        }
        binding.nine.setOnClickListener {
            emptyText()
            binding.input.append("9")
        }
        binding.comma.setOnClickListener {
            emptyText()
            binding.input.append(".")
        }
        binding.clear.setOnClickListener {
            binding.input.text=""
        }
        binding.remove.setOnClickListener {
            val text=binding.input.text.substring(0,binding.input.text.length-1)
            binding.input.text=text
        }
        binding.percent.setOnClickListener {
            emptyText()
            binding.input.append("/100")
        }
        binding.zero.setOnClickListener {
            emptyText()
            binding.input.append("0")
        }
        binding.tobe.setOnClickListener {
            emptyText()
            binding.input.append("/")
        }
        binding.increase.setOnClickListener {
            emptyText()
            binding.input.append("*")
        }
        binding.plus.setOnClickListener {
            emptyText()
            binding.input.append("+")
        }
        binding.subtraction.setOnClickListener {
            emptyText()
            binding.input.append("-")
        }
        binding.equality.setOnClickListener {
            val result=ExpressionBuilder(binding.input.text.toString()).build()
            try {
                binding.input.text=result.evaluate().toString()
            }catch (e:Exception){
                binding.input.text="Xatolik yuz berdi !"
            }
        }
    }

    private fun emptyText() {
        if (binding.input.text == "0") {
            binding.input.text = ""
        }
    }
}