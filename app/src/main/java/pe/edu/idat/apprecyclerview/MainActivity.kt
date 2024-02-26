package pe.edu.idat.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvAndroid.layoutManager = LinearLayoutManager(this)
        binding.rvAndroid.adapter = AdapterAndroid(listAndroid(),this)
    }

    private fun listAndroid(): List<Android> {
        return listOf(
            Android("Apple Cake", "Android 1.0", R.drawable.image1),
            Android("Petit Four", "Android 1.1", R.drawable.image2),
            Android("Cupcake", "Android 1.5", R.drawable.image3),
            Android("Donut", "Android 1.6 ", R.drawable.image4),
            Android("Eclair", "Android 2.0 - 2.1", R.drawable.image5),
            Android("Froyo", "Android 2.2 - 2.2.3", R.drawable.image6),
            Android("Gingerbread", "Android 2.3 - 2.3.7", R.drawable.image7),
            Android("Honeycomb", "Android 3.0 - 3.2.6", R.drawable.image8),
            Android("Jelly Bean", "Android 4.1 - 4.3.1", R.drawable.image9),
            Android("Marshmallow", "Android 6.0 - 6.1", R.drawable.image10)
            )
    }
}