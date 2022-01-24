package com.example.intro_slider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroSliderAdapter(private val introSlides: List<IntroSlide>): RecyclerView.Adapter<IntroSliderAdapter.IntroSlideViewHolder>() {
    inner class IntroSlideViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val textTitle: TextView = view.findViewById(R.id.textTitle)
        private val textDescription: TextView = view.findViewById(R.id.textDescription)
        private val imageIcon: ImageView = view.findViewById(R.id.imageSlideIcon)

        fun bind(introSlide: IntroSlide) {
            textTitle.text = introSlide.title
            textDescription.text = introSlide.description
            imageIcon.setImageResource(introSlide.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewHolder {
        val adapter = LayoutInflater.from(parent.context).inflate(R.layout.slide_item_container, parent, false)
        return IntroSlideViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    override fun getItemCount(): Int = introSlides.size
}