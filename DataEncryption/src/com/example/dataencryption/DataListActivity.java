package com.example.dataencryption;
import java.io.File;
import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class DataListActivity extends Activity {
	
	Context context;
	private ListView listView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_list);
		context = getApplicationContext();
		
		String path = "/storage/sdcard0/Download/";
			
		String[] elementy = new File(path).list();
		
		//Tworzenie danych do listy
		 RowBean RowBean_data[] = new RowBean[elementy.length];
        	//Wpisywanie danych do tablicy
        	for (int i=0;i<elementy.length;i++) 
        		RowBean_data[i] = new RowBean(path+elementy[i], elementy[i]);
        		
        	//Tworzenie adaptera
        	RowAdapter adapter = new RowAdapter(this, R.layout.row, RowBean_data);
        	//Referencja do listy
        	listView1 = (ListView)findViewById(R.id.Lista);
        	//Ustawianie adaptera
        	listView1.setAdapter(adapter);
	}
	
	public void clickAction(View v) {
	}
}
