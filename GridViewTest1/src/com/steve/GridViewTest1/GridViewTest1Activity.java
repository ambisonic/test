package com.steve.GridViewTest1;

import android.app.Activity;

import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewTest1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GridView gridview = (GridView) findViewById(R.id.gridview); //Finds a view that was identified by the id attribute from the XML that was processed in onCreate(Bundle).
        gridview.setAdapter(new ImageAdapter(this)); //he setAdapter() method then sets a custom adapter (ImageAdapter) as the source for all items to be displayed in the grid.
        
        gridview.setOnItemClickListener(new OnItemClickListener() { //do something when an item is selected
        	int i;
        	//HelloSelect x = new HelloSelect();
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	i++;
            	Toast.makeText(GridViewTest1Activity.this, "Current Selection is" + position + "th Picture" + i, Toast.LENGTH_LONG).show();           
                //Toast.makeText(GridViewTest1Activity.this, "This is the "+x.SelectionTimes(i)+"selection", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

/*
HelloSelect x = new HelloSelect();
Toast.makeText(GridViewTest1Activity.this, "This is the "+x.SelectionTimes(i)+"selection", Toast.LENGTH_SHORT).show();
*/