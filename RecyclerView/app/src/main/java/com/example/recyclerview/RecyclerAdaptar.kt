package com.example.recyclerview

import android.content.Intent
import android.util.StringBuilderPrinter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class RecyclerAdaptar(private val context: android.content.Context ,private val dataList : ArrayList<ItemClass>) :
    RecyclerView.Adapter<RecyclerAdaptar.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = dataList[position]
        holder.rvImageView.setImageResource(currentItem.itemImage)
        holder.rvTextView.text = currentItem.itemTitle

        holder.rvCardView.setOnClickListener {
            val intent = Intent(context , ItemActivity::class.java)
            intent.putExtra("Title",currentItem.itemTitle)
            context.startActivity(intent)
        }

    }
    class ViewHolder(ItemView : View): RecyclerView.ViewHolder(ItemView) {
        val  rvImageView : ImageView = itemView.findViewById(R.id.rvImageView)
        val  rvTextView : TextView = itemView.findViewById(R.id.rvTextView)
        val rvCardView : CardView = itemView.findViewById(R.id.rvCardView)
    }

}