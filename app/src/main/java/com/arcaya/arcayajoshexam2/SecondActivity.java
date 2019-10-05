package com.arcaya.arcayajoshexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("CONFIRMATION");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FileInputStream input = null;
        try {
            input = openFileInput("data1.txt");
            int token;
            String temp = "";
            while ((token = input.read()) != -1){
                temp = temp + ((char)token);
            }
            try {
                String[] list = temp.split("-");
                try {
                    ((TextView) (findViewById(R.id.editText2))).setText(list[0]);
                    ((TextView) (findViewById(R.id.editText3))).setText(list[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                input.close();
            } catch (FileNotFoundException e) {
                Log.d("error", "File Not Found Exception");
            } catch (IOException e) {
                Log.d("error", "IO Exception");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendBtn(View v){
        Toast.makeText(this, "registration sent...", Toast.LENGTH_LONG).show();
    }

    public void prevPage(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
