package com.example.samriddhi.facts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunMainActivity extends ActionBarActivity {

    private Colors colorwheel=new Colors();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_main);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layoutid);

        final TextView factText= (TextView) findViewById(R.id.factsText);
        final Button factButton= (Button) findViewById(R.id.factsButton);

        View.OnClickListener listener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] fact={
                        "Ants stretch when they wake up in the morning",
                        "Ostriches can run faster than horses ",
                        "Olympics gold meddles are made up of mainly silver "

                };

                Random randomGenerator=new Random();
                int randomNo= randomGenerator.nextInt(3);

                factText.setText(fact[randomNo]);

                int color=colorwheel.getColor();
                layout.setBackgroundColor(color);

                factButton.setTextColor(color);
            }
        };

        factButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_main, menu);
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
}
