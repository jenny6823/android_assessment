package com.jennifer.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jennifer.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myappAdapter: MyappAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myappData: List<myappData> = listOf(
            myappData(
                R.drawable.item_1, "John", "emma"
            ),
            myappData(
                R.drawable.item_2, "Ruth", "rita"
            ),
            myappData(
                R.drawable.item_3, "hope", "cyril"
            ),
            myappData(
                R.drawable.item_4, "faith", "wisdom"
            ),
            myappData(
                R.drawable.item_5, "ezekiel", "david"
            ),
            myappData(
                R.drawable.item_6, "oliver", "ella"
            ),
            myappData(
                R.drawable.item_7, "charles", "nelly"
            ),
            myappData(
                R.drawable.item_8, "fred", "mary"
            ),
            myappData(
                R.drawable.item_9, "gift", "kelly"
            ),
            myappData(
                R.drawable.item_10, "happy", "jennifer"
            )
        )

        myappAdapter = MyappAdapter(myappData)
        binding.myRecycler.adapter = myappAdapter

    }
}