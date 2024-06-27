package com.jeezzzz.mvvmtut.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.jeezzzz.mvvmtut.R
import com.jeezzzz.mvvmtut.databinding.ActivityMainBinding
import com.jeezzzz.mvvmtut.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel=ViewModelProvider(this).get(MyViewModel::class.java)

        binding.calculateButon.setOnClickListener {
            val num1=binding.num1.text.toString().toInt()
            val num2=binding.num2.text.toString().toInt()

            val result=calculatorViewModel.calculateSum(num1,num2)
            binding.result.text=result.sum.toString()
        }

    }
}

