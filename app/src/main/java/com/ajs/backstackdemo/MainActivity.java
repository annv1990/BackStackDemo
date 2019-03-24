package com.ajs.backstackdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{

    static String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.btnMain)
    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate " + TAG);
        ButterKnife.bind(this);
        btnMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nextScreen();
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
        Intent i = new Intent(this, ActivityOne.class);
        startActivity(i);
    }
}
