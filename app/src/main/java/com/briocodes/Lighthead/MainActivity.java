package com.briocodes.Lighthead;

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
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) myLayout.getBackground()).getColor();
                Button text = findViewById(R.id.button);
                if (color== Color.TRANSPARENT){
                    text.setText("Change to Blue");
                    myLayout.setBackgroundColor(Color.RED);
                }else if (color==Color.RED){
                    text.setText("Change to Yellow");
                    myLayout.setBackgroundColor(Color.BLUE);
                }else if (color==Color.BLUE){
                    text.setText("Change to Green");
                    myLayout.setBackgroundColor(Color.YELLOW);
                }else if (color==Color.YELLOW){
                    text.setText("Change to LT-Grey");
                    myLayout.setBackgroundColor(Color.GREEN);
                }else if (color==Color.GREEN){
                    text.setText("Change to DK-Grey");
                    myLayout.setBackgroundColor(Color.LTGRAY);
                }else if (color==Color.LTGRAY){
                    text.setText("Change to Cyan");
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }else if (color==Color.DKGRAY){
                    text.setText("Change to Magenta");
                    myLayout.setBackgroundColor(Color.CYAN);
                }else if (color==Color.CYAN){
                    text.setText("Change to White");
                    myLayout.setBackgroundColor(Color.MAGENTA);
                }else if (color==Color.MAGENTA){
                    text.setText("Change to Black");
                    myLayout.setBackgroundColor(Color.WHITE);
                }else if (color==Color.WHITE){
                    text.setText("Change to Transparent");
                    myLayout.setBackgroundColor(Color.BLACK);
                }else {
                    text.setText("Change to Red");
                    myLayout.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });
    }
}