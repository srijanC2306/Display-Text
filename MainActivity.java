package com.srijanmukhopadhyay.displaytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view){


        Toast.makeText(MainActivity.this , "Hi There!" , Toast.LENGTH_LONG).show();
        EditText MyTextField = (EditText) findViewById(R.id.MyTextField);
        Log.i("Info" , MyTextField.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}