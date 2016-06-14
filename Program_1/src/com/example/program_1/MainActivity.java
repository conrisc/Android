package com.example.program_1;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
	
	Context context;
    TextView title;
    EditText text;
    RadioGroup yn;
    RatingBar rate;
    Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = getApplicationContext();
		
		title = (TextView) findViewById(R.id.textView_title);
        text = (EditText) findViewById(R.id.editText_text);
        yn = (RadioGroup) findViewById(R.id.radioGroup_yn);
        rate = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.button_confirm);
        
        
	}
	
	public void clickListener(View v) {
		Intent intent = new Intent(context, ResultActivity.class);

		RadioButton yn_a = (RadioButton)yn.findViewById(yn.getCheckedRadioButtonId());
	    intent.putExtra("text_a", text.getText().toString());
	    intent.putExtra("yn_a", yn_a.getText());
	    intent.putExtra("rate_a", rate.getRating());
		

	    startActivity(intent);
	}
}
