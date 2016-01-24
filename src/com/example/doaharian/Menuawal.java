package com.example.doaharian;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Menuawal extends Activity implements OnClickListener {

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_menuawal);
	        
	        View gambar=
	    findViewById(R.id.gambar);
	        gambar.setOnClickListener(this);
	        
	       
	    }
	    public void onClick(View v){
	    	switch (v.getId()){
	    	case R.id.gambar:
	    		Intent menu= new Intent (this, Menusc.class);
	    		startActivity(menu);
	    		break;
	    	
	    		
	    		
	    	}
	    	}
	    }
