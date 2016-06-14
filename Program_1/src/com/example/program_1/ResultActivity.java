package com.example.program_1;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class ResultActivity extends Activity {
	 
	Context context;
    TextView text;
    TextView yn;
    TextView rate;
    ImageView picture;
    Random generator = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		context = getApplicationContext();
		
		text = (TextView) findViewById(R.id.textView_text_a);
        yn = (TextView) findViewById(R.id.textView_yn_a);
        rate = (TextView) findViewById(R.id.textView_rating_a);
        picture = (ImageView) findViewById(R.id.imageView1);
        
        //Przechwytywanie danych z MainActivity
        Bundle bundle = getIntent().getExtras();
        
        String text_a = bundle.getString("text_a");
        String yn_a = bundle.getString("yn_a");
        String rate_a = bundle.getFloat("rate_a")+"";
        
        //Ustawianie przechwyconych wartosci
        text.setText(text_a);
        yn.setText(yn_a);
        rate.setText(rate_a);
    
        String name_con = "test";
        Float rate_con = (float) 4.5;
        
        //Podmiana obrazka
        if (text_a.equals(name_con) && bundle.getFloat("rate_a")==rate_con) {
        	//Toast
        	Toast.makeText(context,"Whoops!",Toast.LENGTH_SHORT).show();
        	//Zdjecie
        	int nrPic = generator.nextInt(2)+1;
        	switch (nrPic) {
        		case 1: picture.setImageResource(R.drawable.picture1); break;
        		case 2: picture.setImageResource(R.drawable.picture1); break;
        	}
        	//Muzyka
        	MediaPlayer mp = MediaPlayer.create(context, R.raw.sound);
        	mp.start(); 
        	//Wideo
        	VideoView vv = (VideoView)findViewById(R.id.videoView1);
        	Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        	vv.setVideoURI(uri);
        	vv.setMediaController(new MediaController(this));
        	vv.requestFocus();
        	vv.start();
        }
        else {
        	Toast.makeText(context,"Done!",Toast.LENGTH_SHORT).show();
        }

	}
	
	public void clickListener(View v) {

		Toast.makeText(context,"Whoops!",Toast.LENGTH_SHORT).show();
	}
}
