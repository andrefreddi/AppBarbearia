package com.example.appbarber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btentrar = (Button) findViewById(R.id.btentrar);
        btentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telalogin = new Intent(MainActivity.this, telalogin.class);
                startActivity(telalogin);
            }
        });


    }
}