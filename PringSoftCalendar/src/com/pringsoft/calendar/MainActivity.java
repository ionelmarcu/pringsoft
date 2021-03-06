package com.pringsoft.calendar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent mServiceIntent = new Intent(this, BackgroundService.class);
		startService(mServiceIntent);
		return super.onContextItemSelected(item);
	}
	
	public void newEvent(View view) {
		//new PostRequest(this).execute();
		Intent intent = new Intent(this, NewEvent.class);
		startActivity(intent);
	}
	
	public void listEvent(View view) {
		//new PostRequest(this).execute();
		Intent intent = new Intent(this, ListEvents.class);
		startActivity(intent);
	}
	


}
