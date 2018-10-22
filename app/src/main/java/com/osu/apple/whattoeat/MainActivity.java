package com.osu.apple.whattoeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.osu.apple.whattoeat.Map.MapsActivity;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=(Button)findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMap=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(toMap);
            }
        });




    }
}
