package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildLayout();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle Item Selection
        switch (item.getItemId()){
            case R.id.action_settings:
                showSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void showSettings(){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    private void buildLayout(){
        //Loop to build a collection of ListObjects to use to populate the list layout
        ListObject[] aryListObject = new ListObject[5];

        for (int i = 0; i < 5; i++)
        {
            aryListObject[i] = new ListObject();
            aryListObject[i].id = i;
            aryListObject[i].Title = "Title " + Integer.toString(i);
            aryListObject[i].Description = "Description for " + aryListObject[i].Title;
        }

        ListView listView1 = (ListView) findViewById(R.id.listView1);
        ArrayAdapter aryAdapter = new ArrayAdapter<ListObject>(this, android.R.layout.simple_list_item_1, aryListObject);

        listView1.setAdapter(aryAdapter);
    }
}
