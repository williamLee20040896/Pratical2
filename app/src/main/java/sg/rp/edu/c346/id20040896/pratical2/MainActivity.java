package sg.rp.edu.c346.id20040896.pratical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bg,orchard,flyer,zoo,gb,sentosa,mbs,clarkQuay, chinatown,rHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg =findViewById(R.id.imageViewBG);
        orchard = findViewById(R.id.imageViewOrchard);
        flyer = findViewById(R.id.imageViewFlyer);
        zoo = findViewById(R.id.imageViewZoo);
        gb = findViewById(R.id.imageViewGBTB);
        sentosa = findViewById(R.id.imageViewSentose);
        mbs = findViewById(R.id.imageViewMBS);
        clarkQuay = findViewById(R.id.imageViewCQ);
        chinatown = findViewById(R.id.imageViewChinatown);
        rHotel = findViewById(R.id.imageViewRaffles);

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description.class);
                intent.putExtra("Botanic Garden", "BG");
                startActivity(intent);

            }
        });
        mbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description2.class);
                intent.putExtra("Marina Bay Sand", "MBS");
                startActivity(intent);
            }
        });
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Description3.class);
                intent.putExtra("Garden by the Bay", "GB");
                startActivity(intent);
            }
        });
        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description4.class);
                intent.putExtra("Singapore Zoo", "Zoo");
                startActivity(intent);
            }
        });
        orchard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description5.class);
                intent.putExtra("Orchard Road", "Orchard");
                startActivity(intent);
            }
        });
        flyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description6.class);
                intent.putExtra("Singapore Flyer", "Flyer");
                startActivity(intent);
            }
        });
        rHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description7.class);
                intent.putExtra("Raffle Hotel", "RH");
                startActivity(intent);
            }
        });
        chinatown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description8.class);
                intent.putExtra("Chinatown", "CT");
                startActivity(intent);
            }
        });
        sentosa.setOnClickListener(new View.OnClickListener() {
                    @
                            Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, description9.class);
                        intent.putExtra("Sentosa", "CT");
                        startActivity(intent);
                    }
        });
        clarkQuay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, description10.class);
                intent.putExtra("Clark Quay", "CT");
                startActivity(intent);
            }
        });





    }


}