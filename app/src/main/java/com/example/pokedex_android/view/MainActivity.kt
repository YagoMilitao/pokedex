package com.example.pokedex_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_android.R
import com.example.pokedex_android.api.domain.Pokemon
import com.example.pokedex_android.api.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val bulbasaur = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
            4,
            "Bulbasaur",
            listOf(
                PokemonType("Grass")
            )
        )
        val pokemons = listOf(bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}