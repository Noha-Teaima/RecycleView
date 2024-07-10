package RecycleView

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.example.task3.R

class MyAdapter(private val items :List<String>,private val images:List<Int>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView2: View): RecyclerView.ViewHolder(itemView2){
        val textView : TextView=itemView2.findViewById(R.id.textView)
        val image: ImageView=itemView2.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context)
            .inflate(
                R.layout.rv_item,
        parent,
        false

        )
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=items[position]
        holder.image.setImageResource(images[position])
        holder.itemView.setOnClickListener{
            Toast.makeText(
                holder.itemView.context,
                "Position: ${items[position]}",
                Toast.LENGTH_LONG
            ).show()
        }

    }

    override fun getItemCount(): Int {
       return items.size
    }
}