package com.ajs.backstackdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityOne extends AppCompatActivity{

    static String TAG = ActivityOne.class.getSimpleName();

    @BindView(R.id.btnOne)
    Button btnOne;

    @BindView(R.id.btnBackToMain)
    Button btnBackToMain;

    @BindView(R.id.btnGoThree)
    Button btnGoThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.d(TAG, "onCreate " + TAG);
        ButterKnife.bind(this);

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nextScreen();
            }
        });

        btnBackToMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                backMain();
            }
        });


        btnGoThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nextThree();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart " + TAG);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume " + TAG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause " + TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop " + TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy " + TAG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart " + TAG);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent " + TAG);
    }

    private void nextScreen(){
        Intent i = new Intent(this, ActivityTwo.class);
        i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(i);
    }

    private void backMain(){
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    private void nextThree(){
        Intent i = new Intent(this, ActivityThree.class);
        startActivity(i);
    }
}
