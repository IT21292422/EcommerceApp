package com.example.ecommerce.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecommerce.R
import com.example.ecommerce.databinding.ActivityLoginBinding
import com.example.ecommerce.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var rePassword: EditText
    lateinit var registerButton: Button
    lateinit var switchToLoginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener(View.OnClickListener {
            // TODO: implement register logic
        })

        binding.switchToLoginButton.setOnClickListener(View.OnClickListener {
            // TODO: implement switch to login screen logic
        })
    }
}