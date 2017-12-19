package com.artiom.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        //set var's to final so it wont change in the other parts of code, make it constant
        final int[] diceArray = { R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6
                          };

        //Button click setup
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Ze button has been pressed!");//log for button press

                //Creating a random number generator
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);//0-5

                Log.d("Dicee", "The random number is: "+ number); //log for random generated number

                //left dice
                leftDice.setImageResource(diceArray[number]);
                //right dice
                number = randomNumberGenerator.nextInt(6);//0-5
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
