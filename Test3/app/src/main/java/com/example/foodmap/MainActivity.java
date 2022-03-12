package com.example.foodmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity
{

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //찾는 작업은 oncreate에서 하여라
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

}

