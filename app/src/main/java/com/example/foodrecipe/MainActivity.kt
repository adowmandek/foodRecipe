package com.example.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvFoods: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DisplayFoods()

    }
    fun  DisplayFoods(){
        var foodlist= listOf(
            Foods("Bizaa","https://cdn.pixabay.com/photo/2018/07/09/09/34/pizza-3525673_960_720.jpg"),
            Foods("Chapati"," https://img-global.cpcdn.com/recipes/e7c23f26fc663826/400x400cq70/photo.jpg"),
            Foods("Spaghetti"," https://www.hintofhealthy.com/wp-content/uploads/2020/06/West-African-Jollof-spaghetti.jpg"),
            Foods("Mturaa"," https://cdn.tasteatlas.com/Images/Dishes/514401520e9b4c438841c5bf8a9f439b.jpg?w=600&h=450"),
            Foods("witabix"," https://cyfsa.blob.core.windows.net/live/Ingredients/Weetabix-unfortified-nutritional-information-calories.jpg"),
            Foods("Rice"," https://static.toiimg.com/thumb/53111677.cms?width=1200&height=900"),
            Foods("Ugali"," https://img-global.cpcdn.com/recipes/9d47c948e25c7ab0/751x532cq70/liver-served-with-ugali-and-greens-recipe-main-photo.jpg"),

            )
        rvFoods=findViewById(R.id.rvFoods)
        var FoodsAdapter=FoodsAdapter(foodlist,baseContext)
        rvFoods.adapter=FoodsAdapter
        rvFoods.layoutManager= LinearLayoutManager(baseContext)

    }
}

