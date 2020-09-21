package com.example.restaurantdesigndemo

import android.os.Bundle
import android.transition.Fade
import android.transition.Transition
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        // hide status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val fade: Transition = Fade()
        fade.excludeTarget(android.R.id.statusBarBackground, true)
        fade.excludeTarget(android.R.id.navigationBarBackground, true)
        window.exitTransition = fade
        window.enterTransition = fade

        val item: ListItem = intent.getParcelableExtra<ListItem>("obj")
        textView.text = item.title
        Glide.with(this).load(item.image).placeholder(R.drawable.details_placeholder)
            .into(imageView)

    }
}