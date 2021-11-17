package com.example.postmidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("seeme", "onCreate: AC-2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx=findViewById(R.id.textView);
        Intent in=getIntent();
        Bundle bund=in.getExtras();
        int score=bund.getInt("score");
        tx.setText(Integer.toString(score));

        //int n=in.getIntExtra("score",2);

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("seeme", "onPause -AC2 ");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("seeme", "onStart - AC2 ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("seeme", "onResume - AC2 ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("seeme", "onStop - AC2 ");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("seeme", "onDestroy - AC2 ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("seeme", "onRestart - AC2 ");
    }


}