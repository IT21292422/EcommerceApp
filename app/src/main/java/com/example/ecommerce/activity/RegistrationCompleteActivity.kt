package com.example.ecommerce.activity

import android.content.Intent
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
            val intent = Intent(this, LoginActivity::class.java)
            // switch to login and clear stack
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        })
    }
}