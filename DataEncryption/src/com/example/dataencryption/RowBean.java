package com.example.dataencryption;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class RowBean {
	 
    	public Bitmap icon;
    	public String title;
 
	public RowBean(){}
 
	public RowBean(String iconPath, String title) {
    		//String path = Environment.getExternalStorageDirectory().toString() + iconPath;
    		Bitmap bmp = BitmapFactory.decodeFile(iconPath);
    		Bitmap resizedBmp = Bitmap.createScaledBitmap(bmp, 150, 200, false);
    	
		this.icon = resizedBmp;
        	this.title = title;
	}
}
