package com.example.projetosistemasolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.projetosistemasolar.models.Planets
import kotlinx.android.synthetic.main.activity_detail_acativity.*
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var mPlanetName: Text
    private  lateinit var mPlanetDescription: Text

    private  lateinit var planets: List<Planets>
    private var position =  -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_acativity)

        position = intent.getIntExtra("position", -1)

        buttonClose.setOnClickListener(this)

    }

    override fun onStart() {
        super.onStart()

        planets = DataSourcePlanets.createDataSet()
    }

    override fun onResume() {
        super.onResume()

        textNamePlanet.text = planets[position].namePlanet
        textDescription.text = planets[position].textAbout

    }

    override fun onClick(button: View?) {
        finish()
    }

}