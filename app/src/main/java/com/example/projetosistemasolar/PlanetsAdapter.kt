package com.example.projetosistemasolar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosistemasolar.models.Planets
import kotlinx.android.synthetic.main.planets_itens.view.*

class PlanetsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var planets :  List<Planets> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

            return PlanetViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.planets_itens,parent,false)
            )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                    when(holder){
                        is PlanetViewHolder ->{
                            holder.bind(planets[position])
                        }
                    }
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    class PlanetViewHolder constructor (
        planetView : View
            ): RecyclerView.ViewHolder(planetView){
                private val namePlanet = planetView.title
                private val descíptionOfPlanet = planetView.description
                private val picturePlanet = planetView.thumbnail


            fun bind (planet : Planets) {

                    namePlanet.text = planet.namePlanet
                    descíptionOfPlanet.text = planet.textAbout


                }


            }
}