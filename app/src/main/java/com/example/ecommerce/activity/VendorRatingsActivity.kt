package com.example.ecommerce.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.Adapter.ReviewAdapter
import com.example.ecommerce.Modelodel.Review
import com.example.ecommerce.R

class VendorRatingsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var reviewAdapter: ReviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_ratings)

        // hardcode for now
        val reviews = listOf(
            Review("user1@gamil.com", "Great service", "2024-02-21"),
            Review("user2@gamil.com", "Amazing experience.", "2024-02-20"),
            Review("user3@gamil.com", "Package was on time.", "2024-02-19")
        )

        // initialize Recycler
        recyclerView = findViewById(R.id.recyclerViewReviews)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // use adapter and set it to RecyclerView
        reviewAdapter = ReviewAdapter(reviews)
        recyclerView.adapter = reviewAdapter
    }
}