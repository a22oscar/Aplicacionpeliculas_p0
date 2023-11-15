package com.example.griddepelis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeliAdapter(private val pelis: List<Peli>) :
    RecyclerView.Adapter<PeliAdapter.PeliViewHolder>() {

    inner class PeliViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_peli, parent, false)
        return PeliViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PeliViewHolder, position: Int) {
        val peli = pelis[position]
        holder.imageView.setImageResource(peli.imagen)
        holder.textView.text = peli.texto
    }

    override fun getItemCount(): Int {
        return pelis.size
    }
}
