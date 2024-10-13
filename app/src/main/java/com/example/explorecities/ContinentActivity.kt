package com.example.explorecities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContinentActivity: ComponentActivity() {

    private lateinit var cityRecyclerView: RecyclerView
    private lateinit var filteredCitiesArrayList: ArrayList<City>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continent)

        cityRecyclerView = findViewById(R.id.cityRecyclerView)
        cityRecyclerView.layoutManager = LinearLayoutManager(this)
        cityRecyclerView.setHasFixedSize(true)

        val selectedContinent = intent.getStringExtra("selectedContinent")
        filteredCitiesArrayList = filterCityByContinent(selectedContinent, populateCities())
        cityRecyclerView.adapter = CityAdapter(filteredCitiesArrayList)
    }

    private fun filterCityByContinent(continent: String?, allCities: ArrayList<City>): ArrayList<City>{
        return allCities.filter {it.continentName == continent} as ArrayList<City>
    }

    private fun populateCities(): ArrayList<City>{

        val cityList = ArrayList<City>()

        //Cities in Asia
        // Img : https://unsplash.com/photos/white-and-blue-tent-on-gray-sand-during-daytime-33Z4FsBTiAY
        val asiaCity1 = City(
            "Kochi",
            R.drawable.city_kochi,
            "Asia",
            "Malayalam",
            "3,507,053",
            "Kerala Fish Curry"
        )
        cityList.add(asiaCity1)

        // Img : https://unsplash.com/photos/brown-and-red-boat-photograph-3UB_L68ePes
        val asiaCity2 = City(
            "Bangkok",
            R.drawable.city_bankok,
            "Asia",
            "Thai",
            "8,307,053",
            "Pad Thai"
        )
        cityList.add(asiaCity2)

        //Img : https://unsplash.com/photos/brown-and-green-building-near-body-of-water-under-blue-sky-during-daytime-alGTmO0KvJI
        val asiaCity3 = City(
            "Beijing",
            R.drawable.city_beijing,
            "Asia",
            "Mandarin",
            "21,516,000",
            "Peking Duck"
        )
        cityList.add(asiaCity3)

        // Img : https://unsplash.com/photos/aerial-photography-of-gray-and-black-house-p_D5pbQG5TE
        val asiaCity4 = City(
            "Seoul",
            R.drawable.city_seoul,
            "Asia",
            "Korean",
            "9,736,883",
            "Kimchi"
        )
        cityList.add(asiaCity4)


        //Cities in Africa
        // Img : https://unsplash.com/photos/photo-of-beige-temple-pwMbtwA9LRc
        val africaCity1 = City(
            "Cairo",
            R.drawable.city_cairo,
            "Africa",
            "Arabic",
            "9,230,350",
            "Koshari"
        )
        cityList.add(africaCity1)

        // Img : https://unsplash.com/photos/concrete-building-with-tower-xijil3cOsis
        val africaCity2 = City(
            "Casablanca",
            R.drawable.city_casablanca,
            "Africa",
            "Arabic",
            "3,359,818",
            "Couscous"
        )
        cityList.add(africaCity2)

        // Img : https://unsplash.com/photos/ocean-waves-crashing-on-rock-formation-YMOvzRuBH8k
        val africaCity3 = City(
            "Cape Town",
            R.drawable.city_capetown,
            "Africa",
            "Afrikaans",
            "4,472,676",
            "Bobotie"
        )
        cityList.add(africaCity3)

        // Antarctica
        // Img : https://unsplash.com/photos/white-and-black-penguin-on-snow-covered-ground-during-daytime-Ak81Vc-kCf4
        val antarcticaCity1 = City(
            "Frostville",
            R.drawable.city_frostville,
            "Antarctica",
            "Penguinese",
            "500 (research population)",
            "Iceberg Delight"
        )
        cityList.add(antarcticaCity1)

        // Img : https://unsplash.com/photos/body-of-water-JJ0xHzObbmg
        val antarcticaCity2 = City(
            "Glacier Harbor",
            R.drawable.city_glacierharbor,
            "Antarctica",
            "Sealish",
            "300 (research population)",
            "Snowflake Soup"
        )
        cityList.add(antarcticaCity2)

        // Australia
        // Img https://unsplash.com/photos/sydney-opera-house-during-daytime-7Zb7kUyQg1E
        val australiaCity1 = City(
            "Sydney",
            R.drawable.city_sydney,
            "Australia",
            "English",
            "5,367,206",
            "Vegemite Toast"
        )
        cityList.add(australiaCity1)

        // Europe
        // Img : https://unsplash.com/photos/eiffel-tower-paris-france-nnzkZNYWHaU
        val europeCity1 = City(
            "Paris",
            R.drawable.city_paris,
            "Europe",
            "French",
            "2,138,551",
            "Croissant"
        )
        cityList.add(europeCity1)

        // Img : https://unsplash.com/photos/colosseum-arena-photography-VFRTXGw1VjU
        val europeCity2 = City(
            "Rome",
            R.drawable.city_rome,
            "Europe",
            "Italian",
            "2,873,494",
            "Pasta Carbonara"
        )
        cityList.add(europeCity2)

        // Img : https://unsplash.com/photos/berlin-cathedral-berlin-sjUufQqEnHI
        val europeCity3 = City(
            "Berlin",
            R.drawable.city_berlin,
            "Europe",
            "German",
            "3,644,826",
            "Currywurst"
        )
        cityList.add(europeCity3)

        //North America
        // Img : https://unsplash.com/photos/toronto-building-with-lights-Onadzzr1yBU
        val northAmericaCity1 = City(
            "Toronto",
            R.drawable.city_toronto,
            "North America",
            "English",
            "2,731,571",
            "Poutine"
        )
        cityList.add(northAmericaCity1)

        // Img : https://unsplash.com/photos/white-and-red-lighthouse-on-brown-rocky-shore-under-blue-sky-during-daytime-w_bqxBzYvDs
        val northAmericaCity2 = City(
            "Halifax",
            R.drawable.city_halifax,
            "North America",
            "English",
            "403,131",
            "Donair"
        )
        cityList.add(northAmericaCity2)

        //South America
        // Img : https://unsplash.com/photos/woman-crossing-pedestrian-lane-between-tall-buildings-VynkVKneWJA
        val southAmericaCity1 = City(
            "Buenos Aires",
            R.drawable.city_buenos_aires,
            "South America",
            "Spanish",
            "2,890,151",
            "Asado"
        )
        cityList.add(southAmericaCity1)

        return cityList
    }
}