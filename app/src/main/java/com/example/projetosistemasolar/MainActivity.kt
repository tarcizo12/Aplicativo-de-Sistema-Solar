package com.example.projetosistemasolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosistemasolar.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  lateinit var planetsAdapter: PlanetsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRyclerView()
        addDataSourcePlanets()

    }

    private fun addDataSourcePlanets() {
        val dataSource  = DataSourcePlanets.createDataSet()
        this.planetsAdapter.setDataSet(dataSource)
    }

    private fun initRyclerView() {
        this.planetsAdapter  = PlanetsAdapter()


        listOfPlanets.layoutManager = LinearLayoutManager(this)
        listOfPlanets.adapter  = this.planetsAdapter
    }

}




