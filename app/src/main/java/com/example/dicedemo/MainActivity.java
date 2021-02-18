package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // we have two images left dice and right dice
        // link the code to those two image view inside your layout.....(activity main)
        final ImageView leftDie = findViewById(R.id.Left_dice);
        final ImageView rightDie = findViewById(R.id.right_dice);
        Button rollButton = findViewById(R.id.roll_button);
        Button rollButton2 = findViewById(R.id.roll_button2);
        final TextView gameResult = findViewById(R.id.gameResult);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
       rollButton.setOnClickListener(new View.OnClickListener() {


           @Override
           public void onClick(View v) {

               Random rand = new Random();
               int computerDie = rand.nextInt(6);
               int userDie = rand.nextInt(6);
               Log.d("left die",String.valueOf(computerDie));
               Log.d("right die",String.valueOf(userDie));

               leftDie.setImageResource(diceArray[computerDie]);
               rightDie.setImageResource(diceArray[userDie]);
               if(computerDie < userDie)
               {
                    gameResult.setText("User Win!");

               }
               else if(computerDie > userDie)
               {
                   gameResult.setText("Computer Win!");
               }
               else
               {
                   gameResult.setText("It’s a tie");
               }

               // we need to create a random integer for picking the dices randomly!

           }
       });

        rollButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int userDie = rand.nextInt(6);
                int computerDie = rand.nextInt(6);
                Log.d("left die",String.valueOf(computerDie));
                Log.d("right die",String.valueOf(userDie));

                leftDie.setImageResource(diceArray[computerDie]);
                rightDie.setImageResource(diceArray[userDie]);
                // we need to create a random integer for picking the dices randomly!
                if(computerDie < userDie)
                {
                    gameResult.setText("Computer Win!");

                }
                else if(computerDie > userDie)
                {
                    gameResult.setText("User Win!");
                }
                else
                {
                    gameResult.setText("It’s a tie");
                }






            }
        });
    }



}
