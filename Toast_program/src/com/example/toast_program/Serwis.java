package com.example.toast_program;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class Serwis extends IntentService {
	
	Handler handler = new Handler();
	
	public Serwis() {
		super("Serwis");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		
        handler.post(new Runnable() {
        	public void run() {
        		Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
        		Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
            }
        }); 
	}

}
