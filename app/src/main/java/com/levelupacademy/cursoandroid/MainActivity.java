package com.levelupacademy.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mText;
    private WebView mWebView;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.mButton);
        mText = (TextView) findViewById(R.id.mText);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                counter++;
                mText.setText(String.valueOf(counter));
            }
        });

        //mWebView = (WebView)findViewById((R.id.mWebView));
        //mWebView.loadUrl("http://www.levelupacademy.com.br");

    }
}
