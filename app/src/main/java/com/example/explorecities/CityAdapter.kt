package com.example.explorecities

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cityList: ArrayList<City>) : RecyclerView.Adapter<CityCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityCardViewHolder {
        val cityView = LayoutInflater.from(parent.context).inflate(R.layout.activity_city_cards, parent,false)
        return CityCardViewHolder(cityView)
    }

    // Returns size of arraylist
    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: CityCardViewHolder, position: Int) {
        val currentCity = cityList[position]
        holder.cityImage.setImageResource(currentCity.cityImage)
        holder.cityName.text = currentCity.cityName
        holder.continentName.text = currentCity.continentName

        holder.card.setOnClickListener {
            val intent = Intent(holder.itemView.context, CityInfoActivity::class.java)
            intent.putExtra("cityName", currentCity.cityName)
            intent.putExtra("cityImage", currentCity.cityImage)
            intent.putExtra("spokenLanguage", currentCity.spokenLanguage)
            intent.putExtra("population", currentCity.population)
            intent.putExtra("famousDish", currentCity.famousDish)
            (holder.itemView.context as Activity).startActivity(intent)
            Toast.makeText(holder.itemView.context, "CityInfoActivity: selected city: ${currentCity.cityName}", Toast.LENGTH_SHORT).show()
        }
    }

}