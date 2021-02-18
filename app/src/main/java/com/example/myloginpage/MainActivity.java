package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private EditText Name;
        private EditText Password;
        private Button Login;
        private int counter=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.personName);
        Password = (EditText)findViewById(R.id.personCode);
        Login = (Button)findViewById(R.id.logOn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(Name.getText().toString().toLowerCase(), Password.getText().toString().toLowerCase());
            }
        });

    }

    private void check(String pName, String pCode) {

            if(pName.equals("anmol") && pCode.equals("1234")) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

                else if(pName.equals("pratyush") && pCode.equals("1234")) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent2);

                 }

            else if(pName.equals("arjit") && pCode.equals("1234")) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent3);

            }
            else
            {
                counter--;
                Toast.makeText(this, "Incorrect password.\nNo. of attempts remaining: "+String.valueOf(counter), Toast.LENGTH_SHORT).show();

                if(counter==0) {
                    Toast.makeText(this, "User Blocked!! Try again later.", Toast.LENGTH_SHORT).show();
                    Login.setEnabled(false);
                }
            }

    }
}