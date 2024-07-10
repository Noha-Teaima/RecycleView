package RecycleView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task3.R
import com.example.task3.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var binding=ActivityRecycleViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recycleView.layoutManager=LinearLayoutManager(this)
        binding.recycleView.adapter=MyAdapter(getItems(),GetImages())
    }

fun getItems():List<String>{
    return listOf("Noha", "Reem","Aya","Ola")
}

    fun getImages(): List<String>{
        return listOf(
                "@drawable/img4.jpg" ,
                "@drawable/img1.jpg" ,
                "@drawable/img2.png" ,
                "@drawable/img4.jpg")
    }


    fun GetImages(): List<Int>{
        return listOf(R.drawable.img4,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img4)
    }

}