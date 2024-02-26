package pe.edu.idat.apprecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class AdapterAndroid(val listImages: ArrayList<String>) :
    RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {
        inner class ViewHolder(val binding: ItemAndroidBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listImages.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //
    }

}