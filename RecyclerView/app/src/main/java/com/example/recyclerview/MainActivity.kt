package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageList: ArrayList<Int>
    private lateinit var titleList: ArrayList<String>
    private lateinit var dataList: ArrayList<ItemClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        titleList = arrayListOf(
            "Vivek Jadhav",
            "Arpit Mehta",
            "Harit Verma",
            "Love Maheshwary",
        )

        dataList = arrayListOf<ItemClass>()

        getData()

    }

    private fun getData(){
        for (i in titleList.indices){
            val data = ItemClass(R.drawable.avtar,
                titleList[i])
            dataList.add(data)
        }
        recyclerView.adapter = RecyclerAdaptar(this,dataList)
    }
}