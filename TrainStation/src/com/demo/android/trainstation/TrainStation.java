package com.demo.android.trainstation;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

import android.R;
import android.os.Bundle;


public class TrainStation extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    MapView Map = new MapView(this,"AIzaSyAXZb_XgNoS3G87EjKEPvw22jse7F-T6B8");
		setContentView(Map);
		//setContentView(com.demo.android.trainstation.R.layout.activity_main);
				
	}


	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
