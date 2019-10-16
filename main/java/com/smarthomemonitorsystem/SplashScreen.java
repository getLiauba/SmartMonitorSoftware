package com.smarthomemonitorsystem;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
