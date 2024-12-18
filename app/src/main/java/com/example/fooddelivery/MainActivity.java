package com.example.fooddelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1,et2;
    String getUname,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.loginbtn);
        et1=(EditText)findViewById(R.id.uname);
        et2=(EditText)findViewById(R.id.password);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getUname=et1.getText().toString();
                getPassword=et2.getText().toString();

                String correctUsername="delivery";
                String correctPassword="1234";

                if(getUname.equals(correctUsername) && getPassword.equals(correctPassword))
                {
                    Intent enter=new Intent(getApplicationContext(), foodmenuActivity.class);
                    startActivity(enter);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}