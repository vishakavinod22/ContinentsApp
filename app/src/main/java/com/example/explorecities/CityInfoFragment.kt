package com.example.explorecities

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class CityInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val cityInformationView = inflater.inflate(R.layout.activity_city_information, container, false)

        super.onViewCreated(cityInformationView, savedInstanceState)

        val cityName = arguments?.getString("cityName")
        val cityImage = arguments?.getInt("cityImage")
        val spokenLanguage = arguments?.getString("spokenLanguage")
        val population = arguments?.getString("population")
        val famousDish = arguments?.getString("famousDish")

        Log.d("cityImageArg", cityImage.toString())

        val cityImgaeView = cityInformationView.findViewById<ImageView>(R.id.cityImageView)
        if (cityImage != null) {
            cityImgaeView.setImageResource(cityImage)
        }
        cityName.let {
            cityInformationView.findViewById<TextView>(R.id.cityNameValue).text = it
        }
        spokenLanguage.let {
            cityInformationView.findViewById<TextView>(R.id.spokenLanguageValue).text = it
        }
        population.let {
            cityInformationView.findViewById<TextView>(R.id.populationValue).text = it
        }
        famousDish.let {
            cityInformationView.findViewById<TextView>(R.id.dishValue).text = it
        }

        return cityInformationView
    }

}