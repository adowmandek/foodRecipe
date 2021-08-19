package com.example.foodrecipe

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.security.AccessControlContext
import java.time.Instant

class FoodsAdapter (var foodList: List<Foods>, var context: Context):RecyclerView.Adapter<foodsViewholder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): foodsViewholder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_foods, parent, false)
        return foodsViewholder(itemView)
    }

    override fun onBindViewHolder(holder: foodsViewholder, position: Int) {
        var currentFoods = foodList.get(position)
        holder.tvName.text = currentFoods.name

        var intent = Intent(context, foodDetail::class.java)
        intent.putExtra("Name", currentFoods.name)
        intent.putExtra("imageUrl", currentFoods.imageUrl)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        context.startActivity(intent)


        Picasso.get()
            .load(currentFoods.imageUrl)
            .resize(80, 80)
            .centerCrop()

    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}

    class foodsViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var ivFood = itemView.findViewById<TextView>(R.id.ivFood)



    }



