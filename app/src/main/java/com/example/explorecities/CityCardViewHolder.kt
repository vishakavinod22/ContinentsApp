package com.example.explorecities

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CityCardViewHolder(cityView: View) : RecyclerView.ViewHolder(cityView){

    val card : CardView = cityView.findViewById(R.id.cardItem)
    val cityImage: ImageView = cityView.findViewById(R.id.cityCardImage)
    val cityName: TextView = cityView.findViewById(R.id.cityName)
    val continentName: TextView = cityView.findViewById(R.id.continentName)
}