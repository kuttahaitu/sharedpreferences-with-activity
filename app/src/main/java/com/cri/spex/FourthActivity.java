package com.cri.spex;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activites);
		tv=findViewById(R.id.other_activitesTextView);
		tv.setText("I'm Fourth Activity");

	}

	@Override
	protected void onStart() {
		super.onStart();
		SharedPreferences sp=PreferenceManager.
			getDefaultSharedPreferences(getApplicationContext());
		sp.edit().putString("restart_changed","fourth_activity").apply();

	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		SharedPreferences sp=PreferenceManager.
			getDefaultSharedPreferences(getApplicationContext());
		sp.edit().putString("restart_changed","main").apply();

	}

}
