package com.example.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//This Widget toast is used cause it display msg in the middle of the app
        Toast toast= Toast.makeText(this,"secondCreate",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected   void onStart(){
        super.onStart();
        Toast toast= Toast.makeText(this,"secondStart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();

    }

    @Override
    protected   void onResume(){
        super.onResume();
        Toast toast= Toast.makeText(this,"secondResume",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected   void onPause(){
        super.onPause();
        Toast toast= Toast.makeText(this,"secondPause",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected   void onStop(){
        super.onStop();
        Toast toast= Toast.makeText(this,"secondStop",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected   void onRestart(){
        super.onRestart();
        Toast toast= Toast.makeText(this,"secondRestart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected   void onDestroy(){
        super.onDestroy();
        Toast toast= Toast.makeText(this,"secondDestroy",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
}