package com.doorsellman;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.LocationTrackingMode;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.overlay.Marker;
import com.naver.maps.map.util.FusedLocationSource;


public class MoonSellManMap extends BaseActivity {

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 100;
    private final String CLIENT_ID = "3v5jdwu0zw";
    private FusedLocationSource locationSource;

    private NaverMap mMap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moonsellman_map_activity);

//        MapFragment mapFragment = (MapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
//        if (mapFragment == null) {
//            mapFragment = MapFragment.newInstance();
//            getSupportFragmentManager().beginTransaction().add(R.id.map, mapFragment).commit();
//        }
//        mapFragment.getMapAsync(this);
//
//        locationSource = new FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE);


    }


//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
//                                           @NonNull int[] grantResults) {
//        if (locationSource.onRequestPermissionsResult(requestCode, permissions, grantResults)) {
//            return;
//        }
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//    }


//    @Override
//    public void onMapReady(@NonNull NaverMap naverMap) {
//
//        naverMap.setLocationSource(locationSource);
//        UiSettings uiSettings = naverMap.getUiSettings();
//        uiSettings.setLocationButtonEnabled(true);
//        naverMap.setLocationTrackingMode(LocationTrackingMode.Follow);
//
//        Button bt = (Button)findViewById(R.id.location);
//        bt.setOnClickListener(v -> naverMap.setLocationTrackingMode(LocationTrackingMode.Follow));
//
//        Marker marker = new Marker();
//        marker.setPosition(new LatLng(37.5543263, 126.97477900000001));
//        marker.setCaptionText("세직이네");
//        marker.setMap(naverMap);
//        marker.setOnClickListener(overlay -> {
//            Toast.makeText(this, "마커 1 클릭됨", Toast.LENGTH_SHORT).show();
//            // 이벤트 전파
//            Intent intent=new Intent(MoonSellManMap.this, MoonSellAffiliate.class);
//            startActivity(intent);
//            return false;
//        });
//    }

}
