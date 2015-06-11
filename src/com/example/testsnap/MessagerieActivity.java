package com.example.testsnap;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MessagerieActivity extends ListActivity {
    ArrayList<String> list;
    ArrayAdapter<String> adaptor;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_messagerie);
	    list = new ArrayList<String>();
	    list.add("Florian");
	    list.add("Ioana");
	
	    adaptor = new ArrayAdapter<String>(this, R.layout.list_item, list);
	    
	    setListAdapter(adaptor);
	    //ListView listVu = R.id.list;
	    //final ListView listview = (ListView) findViewById(R.id.list);
	    /*listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getBaseContext(), AffichageActivity.class);
		    	Log.d("Snap", "Je commence l'activit� photo");
		    	startActivity(intent);
			}
	    });*/
    }

    
    public void affichage(View v){
    	Intent intent = new Intent(this, AffichageActivity.class);
    	Log.d("Snap", "Je commence l'activit� photo");
    	startActivity(intent);
    }
    
    /*public void addContact(String name) {
	    list.add(name);
	    adaptor.notifyDataSetChanged();
    }*/
}
	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messagerie);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.messagerie, menu);
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
}*/

