package com.apk.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageView img_gomart;
    public ImageView img_goride;
    public ImageView img_gojek;
    public ImageView img_gofood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_gomart = findViewById(R.id.gomart);
        img_gomart.setOnClickListener(this);
        img_goride = findViewById(R.id.goride);
        img_goride.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.gomart:
                Intent i =new Intent(MainActivity.this,gomart.class);
                startActivity(i);
                break;
            case R.id.goride:
                Intent j = new Intent(MainActivity.this,gomart.class);
                startActivity(j);
                break;
        }

    }
}
