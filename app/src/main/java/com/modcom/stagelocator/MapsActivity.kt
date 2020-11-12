package com.modcom.stagelocator

import android.Manifest
import android.content.pm.PackageManager
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
// implementation 'com.google.android.gms:play-services-location:17.1.0' -add this to app gradle file

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
//google global variable
    private lateinit var mMap: GoogleMap
    //fused location variable. This will help in accessing phones gps
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    //initialize last location
    private lateinit var lastlocation:Location


    private fun setUpMap(){
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ){
                ActivityCompat.requestPermissions(this,
                kotlin.arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
                return
            }
            //make location enabled
        mMap.isMyLocationEnabled = true

        fusedLocationClient.lastLocation.addOnSuccessListener(this) {location ->
            if (location != null){
                lastlocation = location
                val currentlatLng = LatLng(location.latitude, location.longitude)
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentlatLng, 12f))
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        //this will access the gps
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val westlandsstagecbd = LatLng(-1.2855855,36.8148359)
        mMap.addMarker(MarkerOptions().position(westlandsstagecbd).title("Marker in Nairobi, Tom Mboya street")
            .snippet("From cbd, to Westlands, kangemi, and limuru")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus)))//marker


        val westlandschiromo = LatLng(-1.2711157,36.8050682)
        mMap.addMarker(MarkerOptions().position(westlandschiromo).title("Marker in Chiromo, Westlands")
            .snippet("From cbd, to Westlands, kangemi, and limuru")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus)))//marker

        val westlandskangemi = LatLng(-1.2708986,36.7247167)
        mMap.addMarker(MarkerOptions().position(westlandskangemi).title("Marker in Kangemi")
            .snippet("From cbd, to Westlands, kangemi, and limuru")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus)))//marker

        setUpMap()

//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(westlandsstagecbd, 10f))//camera location
    }
}