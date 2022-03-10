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
        //findViewById(); ()안에 xml문서에서 찾아오고 싶은 view이름을 주면 자바코드에서 찾아옴
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
    //event 처리 메소드
    public void loginProcess(View v) {
        //v: event가 발생한 대상
        int id = v.getId();
        if (id == R.id.login) {
            String uid = username.getText().toString();
            String upass = password.getText().toString();
            if (uid.equals("admin") && upass.equals("manager")) {
                Toast.makeText(this, " " + uid, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "로그인 정보가 틀렸습니다", Toast.LENGTH_SHORT).show();
                username.setText(""); //지워주는 효과
                password.setText("");
            }
        } else {
            username.setText(""); //지워주는 효과
            password.setText("");
        }
    }
}

