package com.example.responsi_093

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListIphoneAdapter {
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import android.widget.Toast
    import androidx.recyclerview.widget.RecyclerView
    import com.bumptech.glide.Glide

    class ListIphoneAdapter (private val listFood: ArrayList<iphone>) : RecyclerView.Adapter<com.example.responsi_093.ListIphoneAdapter.iphoneViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): iphoneViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_item, parent, false)
            return iphoneViewHolder(view)
        }

        override fun getItemCount(): Int {
            return com.example.responsi_093.ListIphoneAdapter
        }

        override fun onBindViewHolder(holder: iphoneViewHolder, position: Int) {
            val iphone = com.example.responsi_093.ListIphoneAdapter[position]
            holder.tvName.text = iphone.name
            holder.tvDetail.text = iphone.detail
            Glide.with(holder.itemView.context)
                .load(iphone.poster)
                .into(holder.imgPoster)

            holder.itemView.setOnClickListener(){
                Toast.makeText(
                    holder.itemView.context,"Kamu pilih"+com.example.responsi_093.ListIphoneAdapter[holder.adapterPosition].name, Toast.LENGTH_LONG
                ).show()
            }
        }

        inner class iphoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.italic)
            var tvDetail: TextView = itemView.findViewById(R.id.normal)
            var imgPoster: ImageView = itemView.findViewById(R.id.normal)
        }
    }
}