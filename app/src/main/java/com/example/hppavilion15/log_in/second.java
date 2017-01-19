package com.example.hppavilion15.log_in;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b=getIntent().getExtras();
        //get the string from main activity through bundle
        String usermane=b.getString("message");
        tv=(TextView) findViewById(R.id.tv);
        tv.setText("Welcome..."+usermane);
    }
}
