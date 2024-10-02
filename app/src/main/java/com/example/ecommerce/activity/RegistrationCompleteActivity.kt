package com.example.ecommerce.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce.databinding.ActivityRegistrationCompleteBinding

class RegistrationCompleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationCompleteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switchToLoginButton.setOnClickListener(View.OnClickListener {
            // TODO: implement switch to login screen logic
        })
    }
}