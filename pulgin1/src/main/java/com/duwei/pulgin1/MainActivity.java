package com.duwei.pulgin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static View parentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(parentView == null){
            setContentView(R.layout.activity_main);
        }else{
            setContentView(parentView);
        }

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "I came from 插件~~", Toast.LENGTH_LONG).show();
            }});

    }

    public static void setLayoutView(View view){
        parentView = view;
    }
}
