package com.example.timmi.mobileappexamen;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RivierahalActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng oceanium;
    private LatLng ijsberen;
    private LatLng vogels;
    private LatLng leeuwen;
    private LatLng giraffen;
    private LatLng rivierahal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceanium);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Marker voor ijsberen
        ijsberen = new LatLng(51.927408, 4.445015);
        mMap.addMarker(new MarkerOptions().position(ijsberen).title("Ijsberen").snippet("Voertijd: 16:00 - 16:20"));

        // Marker voor vogels
        vogels = new LatLng(51.927224, 4.446883);
        mMap.addMarker(new MarkerOptions().position(vogels).title("Vogels").snippet("Voertijd: 14:30 - 14:45"));

        // Marker voor leeuwen
        leeuwen = new LatLng(51.928381,  4.449852);
        mMap.addMarker(new MarkerOptions().position(leeuwen).title("Leeuwen").snippet("Voertijd: 15:10 - 15:30"));

        // Marker voor Giraffen
        giraffen = new LatLng(51.926262,  4.449822);
        mMap.addMarker(new MarkerOptions().position(giraffen).title("Leeuwen").snippet("Voertijd: 16:35 - 16:55"));

        // Marker voor ingang Rivierahal
        rivierahal = new LatLng(51.925595,  4.454028);
        mMap.addMarker(new MarkerOptions().position(rivierahal).title("Ingang Rivierahal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rivierahal, 15f));
    }
}
