package com.uhn.porland;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends Activity {
	WindowManager wm;
	Display disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wm=(WindowManager)getSystemService(WINDOW_SERVICE);
        disp=wm.getDefaultDisplay();
        if(disp.getHeight()>disp.getWidth())
        {
        	Toast.makeText(getApplicationContext(), "portrait",Toast.LENGTH_LONG).show();
        	
        }
        if(disp.getHeight()<disp.getWidth())
        {
        	Toast.makeText(getApplicationContext(), "landscape",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
