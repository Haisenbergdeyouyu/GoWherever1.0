package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.complex_activity_main);

    }

    /**点击跳到home************************************************/
    public void jump_to_home(View view){
        Intent intent = new Intent();
        intent.setClass(this,Home.class);
        startActivity(intent);
    }
    /***************************************************************/



}
