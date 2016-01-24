package com.example.doaharian;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

public class Awal extends Activity {
	//Set waktu lama splashscreen
	   private static int splashInterval = 2000;
	   
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_NO_TITLE);
	      
	      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	      WindowManager.LayoutParams.FLAG_FULLSCREEN);
	      setContentView(R.layout.activity_awal);

	      new Handler().postDelayed(new Runnable() {
	         @Override
	         public void run() {
	         // TODO Auto-generated method stub
	            Intent i = new Intent(Awal.this, Menuawal.class);
	            startActivity(i);
	            
	            //jeda selesai Splashscreen
	            this.finish();
	          }

	      private void finish() {
	      // TODO Auto-generated method stub
	      }
	   }, splashInterval);
	};
	}
