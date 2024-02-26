package pe.edu.idat.apprecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class AdapterAndroid(val listAndroid: ArrayList<Android>) :
    RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {
        inner class ViewHolder(val binding: ItemAndroidBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listAndroid.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNomVersion.text = listAndroid[position].nombre
        holder.binding.tvNumVersion.text = listAndroid[position].version
        //holder.binding.ivAndroid =  listImages[position]
    }

}