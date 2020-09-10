package com.example.practiceproject.viewmodel

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso as Picasso1

class BadgeViewModel {
    companion object {
        @JvmStatic
        @BindingAdapter("bind:badgeUrl")
        fun loadBadge(view: ImageView, badgeUrl: String?) {
            Picasso1.get()
                .load(badgeUrl)
                .into(view)
        }
    }
}