package com.example.griddepelis
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var peliAdapter: PeliAdapter
    private val pelis = listOf(
        Peli(R.drawable.placeholder_image, "Peli 1"),
        Peli(R.drawable.placeholder_image, "Peli 2"),
        Peli(R.drawable.placeholder_image, "Peli 3"),
        Peli(R.drawable.co_a_mala__2_, "test")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        peliAdapter = PeliAdapter(pelis)
        recyclerView.adapter = peliAdapter
    }
}
