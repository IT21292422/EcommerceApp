package com.example.ecommerce.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce.Model.Customer
import com.example.ecommerce.R
import okhttp3.*

class CustomerProfileActivity : AppCompatActivity() {
    private lateinit var tvEmail: TextView
    private lateinit var tvFirstName: TextView
    private lateinit var tvLastName: TextView
    private lateinit var tvCreationDate: TextView
    private lateinit var btnEdit: Button
    private lateinit var btnDeactivate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_profile)

        tvEmail = findViewById(R.id.tvEmail)
        tvFirstName = findViewById(R.id.tvFirstName)
        tvLastName = findViewById(R.id.tvLastName)
        tvCreationDate = findViewById(R.id.tvCreationDate)
        btnEdit = findViewById(R.id.btnEdit)
        btnDeactivate = findViewById(R.id.btnDeactivate)

        fetchCustomerProfile()
    }

    private fun fetchCustomerProfile() {
        // TODO
    }

    private fun updateUI(customer: Customer) {
        tvEmail.text = "Email: ${customer.email}"
        tvFirstName.text = "First Name: ${customer.firstName}"
        tvLastName.text = "Last Name: ${customer.lastName}"
        tvCreationDate.text = "Created on: ${customer.creationDate}"
    }
}