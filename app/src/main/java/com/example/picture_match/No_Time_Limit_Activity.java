package com.example.picture_match;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class No_Time_Limit_Activity extends AppCompatActivity {
    ListView listView;
    ListAdapter adapter;
    int[] levelno = {1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_time_limit);

        listView = findViewById(R.id.listview);
        adapter = new List_Adapter(No_Time_Limit_Activity.this,levelno);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(No_Time_Limit_Activity.this);

                builder.setMessage("YOU HAVE 5 SECONDS TO MEMORIZE ALL" +"\n" +"IMAGES");
                builder.setTitle("TIME : NO TIME LIMIT");

                builder.setCancelable(false);

                builder.setPositiveButton("GO", (DialogInterface.OnClickListener) (dialog, which) -> {
                    Intent intent = new Intent(No_Time_Limit_Activity.this,Grid_View.class);
                    startActivity(intent);
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
