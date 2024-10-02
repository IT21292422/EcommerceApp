package com.example.ecommerce.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce.databinding.ActivityRegistrationCompleteBinding

class RegistrationCompleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationCompleteBinding

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // hide to status bar [android 11 API 30 and up]
        window.setDecorFitsSystemWindows(false)
        window.insetsController?.let { controller ->
            controller.hide(android.view.WindowInsets.Type.statusBars() or android.view.WindowInsets.Type.navigationBars())
            controller.systemBarsBehavior = android.view.WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        // switch to login and clear stack
        binding.switchToLoginButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        })
    }
}