package com.example.yemekkitabisb.adapter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.yemekkitabisb.databinding.RecyclerRowBinding
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.yemekkitabisb.model.Tarif
import com.example.yemekkitabisb.view.ListeFragmentDirections

class TarifAdapter (val  tarifListesi : List<Tarif>):RecyclerView.Adapter<TarifAdapter.TarifHolder>(){
    class TarifHolder (val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarifHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TarifHolder(recyclerRowBinding)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TarifHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = tarifListesi[position].isim
        holder.itemView.setOnClickListener {
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment(bilgi="eski",id = tarifListesi[position].id)
            Navigation.findNavController(it).navigate(action)
        }
    }
}
