package com.example.login

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.login.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]

        binding.loginViewModel = loginViewModel

        binding.lifecycleOwner = this

        loginViewModel.user.observe(this
        ) { loginUser ->
            Toast.makeText(
                this@MainActivity,
                "onCreate: ${loginUser?.getName()} password ${loginUser?.getPassword()}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}