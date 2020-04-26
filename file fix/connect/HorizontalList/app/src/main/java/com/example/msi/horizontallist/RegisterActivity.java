package com.example.msi.horizontallist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        btn = findViewById(R.id.joinus);
    }

    public void goback(View view){
        Intent ic = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(ic);
    }

}
