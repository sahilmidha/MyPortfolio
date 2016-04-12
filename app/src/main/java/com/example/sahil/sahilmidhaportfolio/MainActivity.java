
package com.example.sahil.sahilmidhaportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void displayToastMessageOnClick(View view){
        int id = view.getId();

        String text;
        switch (id){
            case R.id.spotify_streamer_button:
                text = "Spotify Streamer will open from here.";
                break;
            case R.id.scores_app_button:
                text = "Scores App will open from here.";
                break;
            case R.id.library_app_button:
                text = "Library App will open from here.";
                break;
            case R.id.build_it_bigger_button:
                text = "Dude! Get Ready for something bigger.";
                break;
            case R.id.xyz_reader_button:
                text = "Get Ready to be Appworm!";
                break;
            case R.id.capstone_button:
                text = "My Shining Idea!";
                break;
            default:
                text = "This is never going to run";
        }
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
