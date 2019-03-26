package com.doorsellman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView moonSellGo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        moonSellGo = (TextView) findViewById(R.id.textView);
        moonSellGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "가나다라마바사", Toast.LENGTH_LONG);

                Intent intent=new Intent(MainActivity.this, MoonSellManMap.class);
                startActivity(intent);
            }
        });

    }
}
