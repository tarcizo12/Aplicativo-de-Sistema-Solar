package com.example.projetosistemasolar

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosistemasolar.models.Planets

class PlanetsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var planets :  List<Planets> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return planets.size
    }
}