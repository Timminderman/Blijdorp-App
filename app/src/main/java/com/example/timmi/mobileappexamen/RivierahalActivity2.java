package com.example.timmi.mobileappexamen;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RivierahalActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng oceanium;
    private LatLng apen;
    private LatLng gorilas;
    private LatLng pinguins;
    private LatLng flamingos;
    private LatLng rivierahal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonBackRivierahalTimes = findViewById(R.id.buttonBackRivierahalTimes);
        setContentView(R.layout.activity_rivierahal);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // Terug Knop Rivierahal
    public void startRivierahalTimeActivity(View view) {
        Intent intent = new Intent(this, RivierahalTimeActivity.class);
        startActivity(intent);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near blijdorp, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // MArker voor ingang Oceanium
        oceanium = new LatLng(51.928142, 4.443886);
        mMap.addMarker(new MarkerOptions().position(oceanium).title("Ingang Oceanium"));

        // Marker voor Apen
        apen = new LatLng(51.927320, 4.452312);
        mMap.addMarker(new MarkerOptions().position(apen).title("Apen").snippet("Voertijd: 16:00 - 16:20"));

        // Marker voor Gorilas
        gorilas = new LatLng(51.925163, 4.451635);
        mMap.addMarker(new MarkerOptions().position(gorilas).title("Gorilas").snippet("Voertijd: 14:30 - 14:45"));

        // Marker voor pinguins
        pinguins = new LatLng(51.928331,  4.446031);
        mMap.addMarker(new MarkerOptions().position(pinguins).title("Pinguins").snippet("Voertijd: 15:10 - 15:30"));

        // Marker voor Flamingos
        flamingos = new LatLng(51.928602,  4.447262);
        mMap.addMarker(new MarkerOptions().position(flamingos).title("Flamingos").snippet("Voertijd: 16:35 - 16:55"));

        // Marker voor ingang Rivierahal
        rivierahal = new LatLng(51.925595,  4.454028);
        mMap.addMarker(new MarkerOptions().position(rivierahal).title("Ingang Rivierahal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rivierahal, 15f));
    }
}
