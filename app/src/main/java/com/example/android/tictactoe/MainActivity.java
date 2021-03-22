package com.example.android.tictactoe;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonStartGame);
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Toast.makeText(MainActivity.this,"All The Best!",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);

//                        Snackbar mySnackbar = Snackbar.make(view,"Hello Snackbar", BaseTransientBottomBar.LENGTH_LONG);
//                        mySnackbar.show();
                    }
                }
        );

    }


}