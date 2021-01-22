package com.example.n6assignment

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

class UfoAdapter(private val Ufo: List<UFO>)
    : RecyclerView.Adapter<UfoAdapter.ufoViewHolder>() {
        class ufoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
            val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UfoAdapter.ufoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ufo_photos, parent, false)
        return UfoAdapter.ufoViewHolder(view)
}

    override fun onBindViewHolder(holder: UfoAdapter.ufoViewHolder, position: Int){
        val a = Ufo[position]
        val currentUrl: String = a.url

        Glide.with(holder.imageView.context).load(currentUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)
    }

    override fun getItemCount(): Int = Ufo.size
}