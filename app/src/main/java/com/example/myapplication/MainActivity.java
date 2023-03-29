package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Scanner;
import android.widget.Toast;
import java.lang.String;
import java.util.Scanner;
import a


public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText epassword;
    int pas = 1234;
    String par = "asdsa";
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.mail);
        epassword = (EditText) findViewById(R.id.password);
        epassword = (EditText) findViewById(R.id.password);
        num = (EditText) findViewById(R.id.editTextNumberPassword); - вход */

    }


    /public void vhod (View view){
        if(epassword == pas){
            Intent intent;
            intent = new Intent(this, MainActivity2.class);
            startActivity(intent);  -  вход
        }
    }*/
}
