package com.example.shoppinglist.presentation.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.R

class ShopItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val productName = view.findViewById<TextView>(R.id.productNameTextView)
    val countTextView = view.findViewById<TextView>(R.id.countTextView)
}