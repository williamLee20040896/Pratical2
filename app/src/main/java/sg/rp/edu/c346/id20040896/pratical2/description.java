package sg.rp.edu.c346.id20040896.pratical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class description extends AppCompatActivity {
    TextView desc, url,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        desc = findViewById(R.id.textViewDescription);
        url = findViewById(R.id.textViewURL);
        name = findViewById(R.id.textViewName);
        Intent intentReceived = getIntent();
        String received = intentReceived.getStringExtra("Botanic Garden");


            desc.setText(R.string.Botanic_Garden);
            url.setText(R.string.BG_URL);
            name.setText("Botanic Garden");

            url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nparks.gov.sg/sbg"));
                    startActivity(browserIntent);

                }
            });



    }
    public boolean onCreateOptionsMenu(Menu menu) {// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.IncreaseSelection) {
            name.setTextSize(28);
            desc.setTextSize(28);
            url.setTextSize(28);

            return true;
        } else if (id == R.id.DecreaseSelection) {
            name.setTextSize(8);
            desc.setTextSize(8);
            url.setTextSize(8);

            return true;
        } else {

        }
        return super.onOptionsItemSelected(item);
    }


}