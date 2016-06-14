package com.example.dataencryption;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	
	Context context;
	EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = getApplicationContext();
	}
	
	public void clickAction(View v) {
		password = (EditText) findViewById(R.id.editText_password);
		String pass = password.getText().toString();
		String reqPass = "lol";
		
		if (pass.equals(reqPass)) {
			Intent intent = new Intent(context, DataListActivity.class);
		    	startActivity(intent);
		}
		else 
			Toast.makeText(context,"Incorrect password!",Toast.LENGTH_SHORT).show();
	}
}
