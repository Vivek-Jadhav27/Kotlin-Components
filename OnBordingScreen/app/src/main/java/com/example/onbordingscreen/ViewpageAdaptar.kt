package com.example.onbordingscreen


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(var context: Context) : RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {
    var images = intArrayOf(
    R.drawable.vivekavtar,
    R.drawable.vivekavtar,
    R.drawable.vivekavtar
    )
    var headings = arrayOf(
    "Instant Notifications",
        "Cashless Payment",
        "Pay Anywhere"
    )
    var description = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.screen_layout,parent,false)
        return PagerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        val currentItem = images[position]
        holder.screenImage.setImageResource(images[position])
        holder.screenTitle.text = headings[position]
        holder.screenDescrpition.text = description[position]

    }

    override fun getItemCount(): Int {
        return images.size
    }

    class PagerViewHolder(ItemView : View): RecyclerView.ViewHolder(ItemView) {
        val  screenImage : ImageView = itemView.findViewById(R.id.screen_img)
        val  screenTitle : TextView = itemView.findViewById(R.id.screen_title)
        val  screenDescrpition : TextView = itemView.findViewById(R.id.screen_description)

    }

}