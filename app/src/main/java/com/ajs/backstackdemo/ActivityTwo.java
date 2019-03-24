package com.ajs.backstackdemo;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityTwo extends AppCompatActivity {

    @BindView(R.id.wvContent)
    WebView wvContent;

    @BindView(R.id.btnGoThree)
    Button btnGoThree;

    static String TAG = ActivityTwo.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ButterKnife.bind(this);
        Log.d(TAG, "onCreate " + TAG);
        wvContent.getSettings().setLoadsImagesAutomatically(true);
        wvContent.getSettings().setJavaScriptEnabled(true);
        wvContent.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvContent.getSettings().setJavaScriptEnabled(true);
        /*wvContent.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });*/
        wvContent.loadUrl("https://vnexpress.net");

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

    private void nextThree(){
        Intent i = new Intent(this, ActivityThree.class);
        startActivity(i);
    }
}
