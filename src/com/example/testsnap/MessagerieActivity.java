package com.example.testsnap;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class MessagerieActivity extends ListActivity {
    ArrayList<String> list;
    ArrayAdapter<String> adaptor;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messagerie);
	    Log.d("SNAP","messagerie");
	    list = new ArrayList<String>();
	    addContact("Florian");
	    addContact("Ioana");
	
	     adaptor = new ArrayAdapter<String>(this, R.layout.list_item, list);
	
	    setListAdapter(adaptor);
    }

    public void addContact(String name) {
    list.add(name);
    adaptor.notifyDataSetChanged();
    }
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

