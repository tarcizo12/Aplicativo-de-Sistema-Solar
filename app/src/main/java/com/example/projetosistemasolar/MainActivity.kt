package com.example.projetosistemasolar

import UserListener.UserItemListenner
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosistemasolar.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserItemListenner {
    private  lateinit var planetsAdapter: PlanetsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRyclerView()
        addDataSourcePlanets()

    }

    private fun initRyclerView() {
        this.planetsAdapter  = PlanetsAdapter()
        planetsAdapter.setOnUserItemListenner(this)

        listOfPlanets.layoutManager = LinearLayoutManager(this)
        listOfPlanets.adapter  = this.planetsAdapter
    }

    private fun addDataSourcePlanets() {
        val dataSource  = DataSourcePlanets.createDataSet()
        this.planetsAdapter.setDataSet(dataSource)
    }

    override fun onListItemClick(view: View, position: Int) {
        Toast.makeText(this, "Item na posição $position", Toast.LENGTH_LONG).show()
    }

}







