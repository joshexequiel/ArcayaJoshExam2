package com.arcaya.arcayajoshexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("ACTIVITY REGISTRATION");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeData(View v) throws IOException {
        String FILENAME = "data1.txt";
        FileOutputStream writer;
        writer = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        if(((CheckBox)(findViewById(R.id.checkBox))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox2))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox2)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox3))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox3)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox4))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox4)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox5))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox5)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox6))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox6)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox7))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox7)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox8))).isChecked()){
            writer.write((((CheckBox)findViewById(R.id.checkBox8)).getText().toString()).getBytes());
        }
        writer.write(("-" + ((EditText)(findViewById(R.id.editText))).getText().toString()).getBytes());
        Toast.makeText(this, "Data Saved...", Toast.LENGTH_LONG).show();
    }

    public void nextPage(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
