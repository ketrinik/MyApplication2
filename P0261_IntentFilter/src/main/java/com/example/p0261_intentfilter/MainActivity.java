package com.example.p0261_intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDate;
    Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;


        switch(v.getId()){
            case R.id.btnDate:
                intent = new Intent("com.example.intent.action.showdate");
                startActivity(intent);
            break;
            case R.id.btnTime:
                intent = new Intent("com.example.intent.action.showtime");
                startActivity(intent);
                break;
        }
    }
}
