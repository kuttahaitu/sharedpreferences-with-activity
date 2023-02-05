package com.cri.spex;
import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Intent;

public class Model {
	//i'm using Activity but you also can use Context
    public static void RestartActivity(Activity activity){
		SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(activity);
		String str=sp.getString("restart_changed","main");
		if(str.equals("second_activity")){
			Intent intent=new Intent(activity,SecondActivity.class);
			activity.startActivity(intent);
		}else if(str.equals("third_activity")){
			Intent intent=new Intent(activity,ThirdActivity.class);
			activity.startActivity(intent);
		}else if(str.equals("fourth_activity")){
			Intent intent=new Intent(activity,FourthActivity.class);
			activity.startActivity(intent);
		}
	}
    
    
}
