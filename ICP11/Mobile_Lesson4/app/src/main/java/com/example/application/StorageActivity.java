package com.example.application;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StorageActivity extends AppCompatActivity {
    EditText txt_content;
    EditText contenttoDisplay;
    String FILENAME = "MyAppStorage";
    String iFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        txt_content = (EditText) findViewById(R.id.id_txt_mycontent);
        contenttoDisplay = (EditText) findViewById(R.id.id_txt_display);
    }

    public void saveTofile(View v) throws IOException {

        // ICP Task4: Write the code to save the text

        // store user input in string
        String uInput = txt_content.getText().toString();

        // create ofStream object and write to file
        FileOutputStream ofStream = null;
        getApplicationContext();
        ofStream = openFileOutput(FILENAME, MODE_APPEND);
        ofStream.write(uInput.getBytes());

        //display what has been written to file
        Toast.makeText(this, "Content Saved to File.", Toast.LENGTH_SHORT).show();
        ofStream.close();
    }

    public void retrieveFromFile(View v) throws IOException {

        // ICP Task4: Write the code to display the above saved text

        // string to store file input
        String fInput = "";

        // create ifStream, read from file
        FileInputStream ifStream = null;
        ifStream = openFileInput(FILENAME);
        InputStreamReader iStreamReader = new InputStreamReader(ifStream);
        BufferedReader bReader = new BufferedReader(iStreamReader);
        StringBuilder strBuilder = new StringBuilder();
        while ((fInput = bReader.readLine()) != null){
            strBuilder.append(fInput);
        }
        ifStream.close();

        //store in iFile
        iFile = strBuilder.toString();
        contenttoDisplay.setText(iFile);
        contenttoDisplay.setVisibility(View.VISIBLE);
        contenttoDisplay.setText(txt_content.getText());
    }
}
