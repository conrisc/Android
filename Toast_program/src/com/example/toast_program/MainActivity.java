package com.example.toast_program;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

	Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		context = getApplicationContext();
		
		startService(new Intent(getBaseContext(), Serwis.class));
		System.exit(0);
	}

	
}
