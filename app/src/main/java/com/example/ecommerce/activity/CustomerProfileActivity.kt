package com.example.ecommerce.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce.databinding.ActivityCustomerProfileBinding
import com.example.ecommerce.databinding.ActivityLoginBinding

class CustomerProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomerProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}