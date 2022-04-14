package com.example.projetosistemasolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetosistemasolar.R
import com.example.projetosistemasolar.models.Planets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var planetAdapter: PlanetsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSourcePlanets.createDataSet()
        this.planetAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {


        this.planetAdapter = PlanetsAdapter()

        listPlanetsRecyclerView.layoutManager = LinearLayoutManager(this)
        listPlanetsRecyclerView.adapter = this.planetAdapter


    }
}