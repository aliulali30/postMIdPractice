package com.example.postmidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("seeme", "AC 1 - creat ");

        setContentView(R.layout.activity_main);
        String[] s={"ali","wisam"};
        int score =5;

        Bundle bun = new Bundle();
        bun.putStringArray("friend",s);
        bun.putInt("score",score);

        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtras(bun);
                        startActivity(intent);

            }
        });
    }
    @Override
    protected void onPause(){
         super.onPause();
        Log.d("seeme", "onPause -AC1 ");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("seeme", "onStart - AC1 ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("seeme", "onResume - AC1 ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("seeme", "onStop - AC1 ");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("seeme", "onDestroy - AC1 ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("seeme", "onRestart - AC1 ");
    }
}