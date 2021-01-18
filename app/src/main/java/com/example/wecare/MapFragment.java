package com.example.wecare;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends FragmentActivity implements OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_maps);
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

            // Add a marker in VIT and move the camera
            LatLng india = new LatLng(12.9717, 79.1594);
            mMap.addMarker(new MarkerOptions().position(india).title("Patient Location"));
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(india));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(india,14));
        }

    @Override
    public void onBackPressed() {
        this.finish();
    }
    }