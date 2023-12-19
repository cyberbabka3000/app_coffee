package com.example.coffee_app

import android.app.Activity
import android.os.Bundle
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView

class MapActivity : Activity() {

    // Приватная переменная для хранения API ключа
    private val apiKey = "fb7a6632-3557-45b2-a596-384b5f203c2b"

    private var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapKitFactory.setApiKey(apiKey)
        MapKitFactory.initialize(this)

        setContentView(R.layout.map)
        mapView = findViewById<MapView>(R.id.mapview)
    }

    override fun onStop() {
        // Activity onStop call must be passed to both MapView and MapKit instance.
        mapView!!.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        // Activity onStart call must be passed to both MapView and MapKit instance.
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView!!.onStart()
    }
}