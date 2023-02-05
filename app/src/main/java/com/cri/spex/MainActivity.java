package com.cri.spex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
 SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		sp=PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		Model.RestartActivity(this);
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		setOnCickListener(R.id.sec_btn,new Intent(MainActivity.this,SecondActivity.class));
		setOnCickListener(R.id.trird_btn,new Intent(MainActivity.this,ThirdActivity.class));
		setOnCickListener(R.id.fourth_btn,new Intent(MainActivity.this,FourthActivity.class));
        
    }
	
    private void setOnCickListener(int id,final Intent intent){
		findViewById(id).setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1) {
					startActivity(intent);
				}
				
			
		});
	}
}

