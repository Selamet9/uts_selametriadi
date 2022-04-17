package com.selamet.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.selamet.recyclerviewkotlin.R
import com.selamet.recyclerviewkotlin.Pemainterkaya

class PemainterkayaAdapter (private val context: Context, private val pemainterkaya: List<Pemainterkaya>, val listener: (Pemainterkaya) -> Unit)
    : RecyclerView.Adapter<PemainterkayaAdapter. PemainterkayaViewHolder>(){

    class PemainterkayaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgPemainterkaya = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePemainterkaya = view.findViewById<TextView>(R.id.tv_item_name)
        val descPemainterkaya = view.findViewById<TextView>(R.id.tv_item_description)



        fun bindView(Pemainterkaya: Pemainterkaya, listener: (Pemainterkaya) -> Unit){
            imgPemainterkaya.setImageResource(Pemainterkaya.imgPemainterkaya)
            namePemainterkaya.text = Pemainterkaya.namePemainterkaya
            descPemainterkaya.text = Pemainterkaya.descPemainterkaya
            itemView.setOnClickListener {
                listener(Pemainterkaya)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):PemainterkayaViewHolder {
        return PemainterkayaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pemainterkaya, parent, false))
    }

    override fun onBindViewHolder(holder: PemainterkayaViewHolder, position: Int) {
        holder.bindView(pemainterkaya[position], listener)
    }

    override fun getItemCount(): Int = pemainterkaya.size
}