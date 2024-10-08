package com.example.ecommerce.Adapter

//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import com.example.ecommerce.R
//
//
//class OrderListItemAdapter {
//
//    fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val order = getItem(position)
//
//        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.order_list_item, parent, false)
//
//        val tvItemName = view.findViewById<TextView>(R.id.tvItemName)
//        val tvStatus = view.findViewById<TextView>(R.id.tvStatus)
//        val tvDate = view.findViewById<TextView>(R.id.tvDate)
//
//        tvItemName.text = order?.itemName
//        tvStatus.text = order?.status
//        tvDate.text = order?.date
//
//        return view
//    }
//}