package com.example.restaurantdesigndemo

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.transition.Fade
import android.transition.Transition
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*


class MainActivity : AppCompatActivity(), RecyclerAdapter.OnItemClickListener {

    private val adapter = RecyclerAdapter(DataSource.getItems())

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // hide status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setUpRecyclerView()

        val fade: Transition = Fade()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fade.excludeTarget(android.R.id.statusBarBackground, true)
            fade.excludeTarget(android.R.id.navigationBarBackground, true)
            window.exitTransition = fade
            window.enterTransition = fade
        }
    }

    private fun setUpRecyclerView() {
        rc.layoutManager = LinearLayoutManager(this)
        rc.adapter = this.adapter
        adapter.setOnItemClickListener(this)
    }

    override fun onItemClick(view: View, item: ListItem, position: Int) {
        Log.d("Hello", item.title)
        val intent = Intent(this, DetailsActivity::class.java)
        val activityOptions: ActivityOptionsCompat =
            ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                view.list_item1_imageView,
                ViewCompat.getTransitionName(view.list_item1_imageView)!!
            )
        intent.putExtra("obj", item)
        startActivity(intent, activityOptions.toBundle())
    }

}