package com.example.explorecities

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.explorecities.databinding.ActivityCityInformationBinding
import androidx.appcompat.app.AppCompatActivity


class CityInfoActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_fragments)

        val cityName = intent.getStringExtra("cityName")
        val cityImage = intent.getIntExtra("cityImage", 0)
        val spokenLanguage = intent.getStringExtra("spokenLanguage")
        val population = intent.getStringExtra("population")
        val famousDish = intent.getStringExtra("famousDish")


        if (cityName != null) {

            val selectedCityInfo = Bundle()

            val cityFragment = CityInfoFragment().apply {
                selectedCityInfo.apply{
                    putString("cityName", cityName)
                    putInt("cityImage", cityImage)
                    putString("spokenLanguage", spokenLanguage)
                    putString("population", population)
                    putString("famousDish", famousDish)
                }
            }

            cityFragment.arguments = selectedCityInfo

            supportFragmentManager.beginTransaction()
                .replace(R.id.cityFragments, cityFragment)
                .commit()
        }
    }

}