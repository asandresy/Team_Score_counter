package com.example.teamscorecounter;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;

public class WinnerActivity extends AppCompatActivity{
    private TextView tv_display;
    private static final String TAG = "SecondActivity";

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.second_activity);
        Log.d(TAG, "inside onCreate");

        tv_display = (TextView)findViewById(R.id.tv_display2);

        Intent intent = getIntent();
        String strScoreCount = intent.getExtras().get(MainActivity.END_RESULT).toString();
        String winningTeam = intent.getExtras().get(MainActivity.WINNING_TEAM).toString();
        tv_display.setText(winningTeam);
        tv_display.append(" " + strScoreCount);


        Log.d(TAG, "end of onCreate");
    }
}
