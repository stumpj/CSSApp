package com.example.jim.cssapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;


public class AddInstructor extends ActionBarActivity {

    private Instructor myIns;

    private TextView[] myBtns;

    @Override
    protected void onCreate(Bundle sI) {
        super.onCreate(sI);
        setContentView(R.layout.activity_add_instructor);

        if (sI != null) {
            myIns = (Instructor) sI.getSerializable("instructor");
        }

        myBtns = new TextView[7];

        myBtns[0] = (TextView) findViewById(R.id.txt1);
        myBtns[1] = (TextView) findViewById(R.id.txt2);
        myBtns[2] = (TextView) findViewById(R.id.txt3);
        myBtns[3] = (TextView) findViewById(R.id.txt4);
        myBtns[4] = (TextView) findViewById(R.id.txt5);
        myBtns[5] = (TextView) findViewById(R.id.txt6);
        myBtns[6] = (TextView) findViewById(R.id.txt7);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (myIns != null) {
            Log.i("Ins", myIns.toString());
        } else {
            Log.i("Ins", "No instructor created");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        if (myIns != null) {
            savedInstanceState.putSerializable("instructor", myIns);

            // Always call the superclass so it can save the view hierarchy state
        }
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_instructor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createInstructor(View v) {
        myIns = new Instructor(myBtns[0].getText().toString(),
                myBtns[1].getText().toString(),
                myBtns[2].getText().toString(),
                myBtns[3].getText().toString(),
                myBtns[4].getText().toString(),
                myBtns[5].getText().toString(),
                myBtns[6].getText().toString());

        Log.i("Ins", myIns.toString());
    }
}
