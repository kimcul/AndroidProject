package com.example.culpritk.testgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickedTextView02(View view){
        Intent intent = new Intent(getApplicationContext(), TestActivity.class);
        startActivity(intent);
    }
}
