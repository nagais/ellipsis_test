package com.example.shou.ellipetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shou.ellipetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewModel = MainViewModel()
        binding.viewModel = viewModel
    }


}
