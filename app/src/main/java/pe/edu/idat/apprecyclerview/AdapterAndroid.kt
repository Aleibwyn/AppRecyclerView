package pe.edu.idat.apprecyclerview

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class AdapterAndroid(val listAndroid: List<Android>, val context: Context) :
    RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {
    inner class ViewHolder(val binding: ItemAndroidBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listAndroid.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding) {
            with(listAndroid[position]) {
                tvNomVersion.text = nombre
                tvNumVersion.text = version
                ivAndroid.setImageResource(img)
                cvAndroid.setOnClickListener(View.OnClickListener {
                    Toast.makeText(root.context, "Click Item $nombre", Toast.LENGTH_SHORT).show()
                })
            }
        }

    }

}