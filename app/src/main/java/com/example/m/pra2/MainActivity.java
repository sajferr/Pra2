package com.example.m.pra2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Uwaga","1");


    }
public  void click(View w){
    DataDialog dialog = new DataDialog();
    Log.d("Uwaga","2");
    dialog.show(getSupportFragmentManager(),"data");



}

}
