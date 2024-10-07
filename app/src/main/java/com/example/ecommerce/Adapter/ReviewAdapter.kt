package com.example.ecommerce.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.Modelodel.Review
import com.example.ecommerce.R

class ReviewAdapter(private val reviews: List<Review>) : RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUserEmail: TextView = itemView.findViewById(R.id.tvUserEmail)
        val tvComment: TextView = itemView.findViewById(R.id.tvComment)
        val tvReviewDate: TextView = itemView.findViewById(R.id.tvReviewDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.review_list_item, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val review = reviews[position]
        holder.tvUserEmail.text = review.userEmail
        holder.tvComment.text = review.comment
        holder.tvReviewDate.text = review.reviewDate
    }

    override fun getItemCount(): Int {
        return reviews.size
    }
}
