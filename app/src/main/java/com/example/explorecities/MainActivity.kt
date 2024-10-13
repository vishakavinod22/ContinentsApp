package com.example.explorecities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.explorecities.ui.theme.ExploreCitiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // using array adapter and define an array
        // 1. https://www.geeksforgeeks.org/android-listview-in-kotlin/
        val arrayAdapter: ArrayAdapter<String>
        val continents = arrayOf("Asia", "Africa", "Antarctica", "Australia", "Europe", "North America", "South America")

        // access the listView
        var continentListView = findViewById<ListView>(R.id.continentList)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, continents)
        continentListView.adapter = arrayAdapter

        // Go to ContinentActivity for the selected Continent
        // 2. https://stackoverflow.com/questions/55128123/kotlin-setonclicklistener-for-a-listview
        continentListView.setOnItemClickListener { parent, view, position, id ->
            val selectedContinent = arrayAdapter.getItem(position)
            Toast.makeText(this, "Selected continent: $selectedContinent", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ContinentActivity::class.java)
            intent.putExtra("selectedContinent", selectedContinent) // You can add extra data if needed
            startActivity(intent)
        }
    }
}
