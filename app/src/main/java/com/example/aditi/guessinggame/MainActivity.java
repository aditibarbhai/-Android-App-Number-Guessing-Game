package com.example.aditi.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random randomGenerator = new Random();
    private Integer points = 0;
//    private Button leftButton = (Button) findViewById(R.id.leftButton);
//    private Button rightButton = (Button) findViewById(R.id.rightButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Click on a button to play!", Toast.LENGTH_SHORT).show();
    }

    public void leftButtonClick(View view) {
        // runs when the left button is clicked
        Button leftButton = (Button) findViewById(R.id.leftButton);
        Button rightButton = (Button) findViewById(R.id.rightButton);
        TextView pointsTxt = (TextView) findViewById(R.id.points);
        int leftVal = Integer.parseInt(leftButton.getText().toString());
        int rightVal = Integer.parseInt(rightButton.getText().toString());

        if (leftVal > rightVal) {
            points = points + 1;
            pointsTxt.setText(points.toString());

            Integer leftNum = randomGenerator.nextInt(100);
            Integer rightNum = randomGenerator.nextInt(100);
            leftButton.setText(leftNum.toString());
            rightButton.setText(rightNum.toString());
        } else {
            points = points - 1;
            pointsTxt.setText(points.toString());
        }
    }

    public void rightButtonClick(View view) {
        // runs when the right button is clicked
        Button leftButton = (Button) findViewById(R.id.leftButton);
        Button rightButton = (Button) findViewById(R.id.rightButton);
        TextView pointsTxt = (TextView) findViewById(R.id.points);
        int leftVal = Integer.parseInt(leftButton.getText().toString());
        int rightVal = Integer.parseInt(rightButton.getText().toString());

        if (rightVal > leftVal) {
            points = points + 1;
            pointsTxt.setText(points.toString());

            Integer rightNum = randomGenerator.nextInt(100);
            Integer leftNum = randomGenerator.nextInt(100);
            leftButton.setText(leftNum.toString());
            rightButton.setText(rightNum.toString());
        } else {
            points = points - 1;
            pointsTxt.setText(points.toString());
        }
    }
}
