package com.nanang.tugas1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by NAAF (Nanang arsyad alfatich)
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonHitungDanTampil).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                float nilaiUTS = Integer.valueOf(((EditText)findViewById(R.id.editTextNilaiUTS)).getText().toString().trim());
                float nilaiUAS = Integer.valueOf(((EditText)findViewById(R.id.editTextNilaiUAS)).getText().toString().trim());
                float nilaiTugas = Integer.valueOf(((EditText) findViewById(R.id.editTextNilaiTugas)).getText().toString().trim());
                float hasil = nilaiUAS*0.2f + nilaiTugas*0.6f + nilaiUTS*0.2f;
                TextView textViewHasil = (TextView)findViewById(R.id.textViewHasil);
                if (hasil > 85) {
                    textViewHasil.setText(hasil  + " / A");
                    textViewHasil.setTextColor(Color.BLUE);
                } else if (hasil > 70) {
                    textViewHasil.setText(hasil  + " / B");
                    textViewHasil.setTextColor(Color.GREEN);
                } else if (hasil > 60) {
                    textViewHasil.setText(hasil  + " / C");
                    textViewHasil.setTextColor(Color.rgb(165, 42, 42));
                } else if (hasil > 50) {
                    textViewHasil.setText(hasil  + " / D");
                    textViewHasil.setTextColor(Color.rgb(255,165,0));
                } else {
                    textViewHasil.setText(hasil  + " / E");
                    textViewHasil.setTextColor(Color.RED);
                }
                // Other testing
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
