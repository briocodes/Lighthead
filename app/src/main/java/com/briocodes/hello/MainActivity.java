package com.briocodes.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.activity_main);
        myLayout.setBackgroundColor(Color.TRANSPARENT);
        myButtonListener();
    }
    public void myButtonListener(){
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) myLayout.getBackground()).getColor();
                if (color== Color.TRANSPARENT){
                    myLayout.setBackgroundColor(Color.RED);
                }else if (color==Color.RED){
                    myLayout.setBackgroundColor(Color.BLUE);
                }else if (color==Color.BLUE){
                    myLayout.setBackgroundColor(Color.YELLOW);
                }else if (color==Color.YELLOW){
                    myLayout.setBackgroundColor(Color.GREEN);
                }else if (color==Color.GREEN){
                    myLayout.setBackgroundColor(Color.LTGRAY);
                }else if (color==Color.LTGRAY){
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }else if (color==Color.DKGRAY){
                    myLayout.setBackgroundColor(Color.CYAN);
                }else if (color==Color.CYAN){
                    myLayout.setBackgroundColor(Color.MAGENTA);
                }else if (color==Color.MAGENTA){
                    myLayout.setBackgroundColor(Color.WHITE);
                }else if (color==Color.WHITE){
                    myLayout.setBackgroundColor(Color.BLACK);
                }else {
                    myLayout.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });
    }
}