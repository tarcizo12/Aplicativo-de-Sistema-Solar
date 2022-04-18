package com.example.projetosistemasolar

import UserListener.UserItemListenner
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
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
        val intention = Intent(this,DetailActivity::class.java)

        intention.putExtra("position", position)

        startActivity(intention)
    }

}







