package com.example.coffee_app

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectTapListener
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

class MapActivity : Activity() {

    // Приватная переменная для хранения API ключа
    private val apiKey = "fb7a6632-3557-45b2-a596-384b5f203c2b"

    private var mapView: MapView? = null

    private val placemarkTapListener = MapObjectTapListener { _, point ->
        Toast.makeText(
            this@MapActivity,
            "Tapped the point (${point.longitude}, ${point.latitude})",
            Toast.LENGTH_SHORT
        ).show()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapKitFactory.setApiKey(apiKey)
        MapKitFactory.initialize(this)

        setContentView(R.layout.map)
        mapView = findViewById<MapView>(R.id.mapview)

        mapView?.map?.move(
            CameraPosition(
                Point(59.935493, 30.327392),
                /* zoom = */ 17.0f,
                /* azimuth = */ 150.0f,
                /* tilt = */ 30.0f
            )
        )

        val mapObjects = mapView?.map?.mapObjects
        val imageProvider = ImageProvider.fromResource(this, R.drawable.placemark_icon)
        val placemark = mapObjects?.addPlacemark(Point(59.935493, 30.327392))
        placemark?.setIcon(imageProvider)

        placemark?.addTapListener(placemarkTapListener)
    }

    override fun onStop() {
        // Activity onStop call must be passed to both MapView and MapKit instance.
        mapView?.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        // Activity onStart call must be passed to both MapView and MapKit instance.
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView?.onStart()
    }
}