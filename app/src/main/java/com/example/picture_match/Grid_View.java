package com.example.picture_match;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Grid_View extends AppCompatActivity
{
    GridView gridView;
    Grid_Adapter adapter;
    private ArrayList<String> imgArr=new ArrayList<>();
    private List<String> arrayList=new ArrayList<>();
    TextView countdown;
    int levelno = 0;
    ProgressBar progressBar;
    int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        countdown=findViewById(R.id.countdown);
        gridView = findViewById(R.id.gridview);
        progressBar=findViewById(R.id.progress);


        String[] images = new String[0];
        try {
            images = getAssets().list("images/");
            imgArr = new ArrayList<String>(Arrays.asList(images));
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
        Collections.sort(imgArr);
        imgArr.remove("android-logo-shine.png");
        imgArr.remove("android-logo-mask.png");
        imgArr.remove("progress_font.png");
        Log.d("TTT", "getImage: All Images= "+imgArr);

        levelno++;
        if(levelno == 1) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 6 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(3);
        }

        if(levelno == 2) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 8 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(4);
        }

        if(levelno == 3) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 10 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(4);
        }

       if(levelno>=4 || levelno<=5) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 12 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(4);
        }

        if(levelno>=6 || levelno<=7) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 15 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(5);
        }

        if(levelno>=8 || levelno<=9) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 21 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(5);
        }

        if(levelno == 10) {

            int min = 0;
            int max = 50;

            r = new Random().nextInt(max - min) + min;
            arrayList = imgArr.subList(r, 24 + r);
            arrayList.addAll(arrayList);
            Collections.shuffle(arrayList);
            Log.d("TTT", "getImage: Selected Images= " + arrayList);

            adapter = new Grid_Adapter(Grid_View.this, arrayList, countdown, progressBar);
            gridView.setAdapter(adapter);
            gridView.setNumColumns(6);
        }
    }
}