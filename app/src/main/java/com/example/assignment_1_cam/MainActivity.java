package com.example.assignment_1_cam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                check(email.getText().toString(),pass.getText().toString());
            }
        });
    }
    private void check(String userName,String userPassword){
        if ((userName.equals("admin"))&&(userPassword.equals("admin"))){
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }else{
            Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}
