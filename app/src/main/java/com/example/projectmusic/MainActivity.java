package com.example.projectmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.borutsky.neumorphism.NeumorphicFrameLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnpress = findViewById(R.id.button_press2);
        NeumorphicFrameLayout btn = findViewById(R.id.flat);


        btnpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn.setState( NeumorphicFrameLayout.State.PRESSED);
                Toast.makeText(MainActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();


                final long changeTime = 100L;
                btn.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn.setState( NeumorphicFrameLayout.State.FLAT);
                    }
                }, changeTime);

            }
        });


    }
}