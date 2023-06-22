package com.example.picture_match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView notimelimit;

    public static SharedPreferences preferences;
    public static SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notimelimit = findViewById(R.id.notimelimit);

        preferences=getSharedPreferences("myperf",MODE_PRIVATE);
        editor=preferences.edit();

        notimelimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, No_Time_Limit_Activity.class);
                startActivity(intent);
            }
        });
    }
}