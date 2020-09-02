package com.example.restaurantdesigndemo

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerAdapter.OnItemClickListener {

    private val adapter = RecyclerAdapter(DataSource.getItems())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // hide status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        rc.layoutManager = LinearLayoutManager(this)
        rc.adapter = this.adapter
        adapter.setOnItemClickListener(this)
    }

    override fun onItemClick(view: View, item: ListItem, position: Int) {
        Log.d("Hello", item.title)
    }

}