package com.example.android.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    int xORo = 1;
    char x = 'X';
    char o = 'O';
    char winner;

    boolean R1C1 = false;
    boolean R1C2 = false;
    boolean R1C3 = false;
    boolean R2C1 = false;
    boolean R2C2 = false;
    boolean R2C3 = false;
    boolean R3C1 = false;
    boolean R3C2 = false;
    boolean R3C3 = false;

    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';

    public void buttonR1C1(View view) {

        if (xORo < 10 && !R1C1) {
            TextView textView = findViewById(R.id.buttonIdR1C1);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            a = string.charAt(0);

            checkWinner();

            R1C1 = true;
            xORo++;
        } else {
            makeToast();
        }
    }

    public void buttonR1C2(View view) {
        if (xORo < 10 && !R1C2) {
            TextView textView = findViewById(R.id.buttonIdR1C2);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            b = string.charAt(0);

            checkWinner();

            xORo++;
            R1C2 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR1C3(View view) {
        if (xORo < 10 && !R1C3) {
            TextView textView = findViewById(R.id.buttonIdR1C3);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            c = string.charAt(0);

            checkWinner();

            xORo++;
            R1C3 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR2C1(View view) {
        if (xORo < 10 && !R2C1) {
            TextView textView = findViewById(R.id.buttonIdR2C1);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            d = string.charAt(0);

            checkWinner();

            xORo++;
            R2C1 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR2C2(View view) {
        if (xORo < 10 && !R2C2) {
            TextView textView = findViewById(R.id.buttonIdR2C2);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            e = string.charAt(0);

            checkWinner();

            xORo++;
            R2C2 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR2C3(View view) {
        if (xORo < 10 && !R2C3) {
            TextView textView = findViewById(R.id.buttonIdR2C3);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            f = string.charAt(0);

            checkWinner();

            xORo++;
            R2C3 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR3C1(View view) {
        if (xORo < 10 && !R3C1) {
            TextView textView = findViewById(R.id.buttonIdR3C1);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            g = string.charAt(0);

            checkWinner();

            xORo++;
            R3C1 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR3C2(View view) {
        if (xORo < 10 && !R3C2) {
            TextView textView = findViewById(R.id.buttonIdR3C2);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            h = string.charAt(0);

            checkWinner();

            xORo++;
            R3C2 = true;
        } else {
            makeToast();
        }
    }

    public void buttonR3C3(View view) {
        if (xORo < 10 && !R3C3) {
            TextView textView = findViewById(R.id.buttonIdR3C3);
            if (xORo % 2 == 0)//even
            {
                textView.setText("" + x);
            } else {
                textView.setText("" + o);
            }
            String string = textView.getText().toString();
            i = string.charAt(0);

            checkWinner();

            xORo++;
            R3C3 = true;
        } else {
            makeToast();
        }
    }

    public void checkWinner() {
        //set xORo to 10 after win
        //last line

        if ((a == 'X' && b == 'X' && c == 'X') || (a == 'O' && b == 'O' && c == 'O')) {
            if (a =='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);
            setAto_Green();
            setBto_Green();
            setCto_Green();
            xORo = 10;
        } else if ((d == 'X' && e == 'X' && f == 'X') || (d == 'O' && e == 'O' && f == 'O')) {
            if (d=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);

            setDto_Green();
            setEto_Green();
            setFto_Green();
            xORo = 10;
        } else if ((g == 'X' && h == 'X' && i == 'X') || (g == 'O' && h == 'O' && i == 'O')) {
            if (g=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);

            setGto_Green();
            setHto_Green();
            setIto_Green();
            xORo = 10;
        } else if ((a == 'X' && d == 'X' && g == 'X') || (a == 'O' && d == 'O' && g == 'O')) {
            if (a=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);

            setAto_Green();
            setDto_Green();
            setGto_Green();
            xORo = 10;
        } else if ((b == 'X' && e == 'X' && h == 'X') || (b == 'O' && e == 'O' && h == 'O')) {
            if (b=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);
            setBto_Green();
            setEto_Green();
            setHto_Green();
            xORo = 10;
        } else if ((c == 'X' && f == 'X' && i == 'X') || (c == 'O' && f == 'O' && i == 'O')) {
            if (c=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);
            setCto_Green();
            setFto_Green();
            setIto_Green();
            xORo = 10;
        } else if ((a == 'X' && e == 'X' && i == 'X') || (a == 'O' && e == 'O' && i == 'O')) {
            if (a=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);
            setAto_Green();
            setEto_Green();
            setIto_Green();
            xORo = 10;
        } else if ((c == 'X' && e == 'X' && g == 'X') || (c == 'O' && e == 'O' && g == 'O')) {
            if (c=='X'){
                winner = 'X';
            }
            else{
                winner ='O';
            }
            displaySnackbar(findViewById(R.id.rootViewCL),winner);
            setCto_Green();
            setEto_Green();
            setGto_Green();
            xORo = 10;
        } else {
            int asdfkja = 5;
        }
    }


    public void displaySnackbar( View view, char winner){
        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.rootViewCL),"WINNER IS: "+winner, BaseTransientBottomBar.LENGTH_LONG);
        mySnackbar.show();
    }


    public void makeToast() {
        if (xORo >= 10) {
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
            goToMainActivity();
        }
    }

    public void goToMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void setAto_Green() {
        TextView textViewA = findViewById(R.id.buttonIdR1C1);
        textViewA.setBackgroundColor(Color.GREEN);
    }

    public void setBto_Green() {
        TextView textViewB = findViewById(R.id.buttonIdR1C2);
        textViewB.setBackgroundColor(Color.GREEN);
    }

    public void setCto_Green() {
        TextView textViewC = findViewById(R.id.buttonIdR1C3);
        textViewC.setBackgroundColor(Color.GREEN);
    }

    public void setDto_Green() {
        TextView textViewD = findViewById(R.id.buttonIdR2C1);
        textViewD.setBackgroundColor(Color.GREEN);
    }

    public void setEto_Green() {
        TextView textViewE = findViewById(R.id.buttonIdR2C2);
        textViewE.setBackgroundColor(Color.GREEN);
    }

    public void setFto_Green() {
        TextView textViewF = findViewById(R.id.buttonIdR2C3);
        textViewF.setBackgroundColor(Color.GREEN);
    }

    public void setGto_Green() {
        TextView textViewG = findViewById(R.id.buttonIdR3C1);
        textViewG.setBackgroundColor(Color.GREEN);
    }

    public void setHto_Green() {
        TextView textViewH = findViewById(R.id.buttonIdR3C2);
        textViewH.setBackgroundColor(Color.GREEN);
    }

    public void setIto_Green() {
        TextView textViewI = findViewById(R.id.buttonIdR3C3);
        textViewI.setBackgroundColor(Color.GREEN);
    }
}