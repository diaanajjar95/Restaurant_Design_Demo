package com.example.restaurantdesigndemo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item.view.*

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title = itemView.list_item1_title_textView
    private val itemCount = itemView.list_item1_itemsCount_textView
    private val imageView = itemView.list_item1_imageView

    fun bind(item: ListItem, onItemClickListener: RecyclerAdapter.OnItemClickListener) {
        title.text = item.title
        itemCount.text = "${item.itemCount} items"
        Glide.with(itemView).load(item.image).placeholder(R.drawable.placeholder).circleCrop()
            .into(imageView)
        itemView.setOnClickListener {
            onItemClickListener.onItemClick(itemView, item, adapterPosition)
        }
    }
}