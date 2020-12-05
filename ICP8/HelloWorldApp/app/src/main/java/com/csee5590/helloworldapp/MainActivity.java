package com.csee5590.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void validateCredentials(View v) {
        //gather user input
        EditText usernameInput = (EditText) findViewById(R.id.email);
        EditText passwordInput = (EditText) findViewById(R.id.pwd);
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        boolean validationFlag = false;

        //if text boxes are populated, check if they are admin/admin
        if (!username.isEmpty() && !password.isEmpty()) {
            if (username.equals("admin") && password.equals("admin")) {
                validationFlag = true;
            }
        }

        //display error or navigate to HomeActivity
        if (!validationFlag) {
            // handle when validationflag is false
            TextView errorText = findViewById(R.id.errorText);
            errorText.setVisibility(View.VISIBLE);
        } else {
            // handle when validationflag is true
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }
    }

}
