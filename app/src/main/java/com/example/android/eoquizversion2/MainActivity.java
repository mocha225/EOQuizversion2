package com.example.android.eoquizversion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int totalScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        //Getting the correct answers initialized by id and then assign a boolean variable for scoring.

        public void submitAnswers(View view){

        //Question 1-the answer is lavendar.
            RadioButton lavendar = (RadioButton) findViewById(R.id.radio_lavendar);
            boolean questionOne = lavendar.isChecked();
            if (questionOne) {
                totalScore += 20;
                Log.v(TAG, "score is = ", totalScore);
            }

            //Question 2-the answers are Myrrh and Frankensense.
            CheckBox cedarwoodCheckBox = (CheckBox) findViewById(R.id.cb_Cedarwood);
            boolean hasCedarwood = cedarwoodCheckBox.isChecked();


            CheckBox myrhhCheckBox = (CheckBox) findViewById(R.id.cb_Myrhh);
            boolean hasMrryh = myrhhCheckBox.isChecked();


            CheckBox vetiverCheckBox = (CheckBox) findViewById(R.id.cb_Vetiver);
            boolean hasVetiver = vetiverCheckBox.isChecked();


            CheckBox frankensenseCheckBox = (CheckBox) findViewById(R.id.cb_Frankensense);
            boolean hasFrankensense = frankensenseCheckBox.isChecked();

            if (hasFrankensense && hasMrryh && !hasVetiver && !hasCedarwood) {
                totalScore += 20;
            }

            //Question 3-the answer is true.
            RadioButton radioTrue = (RadioButton) findViewById(R.id.radio_true);
            boolean radioTrueChecked = radioTrue.isChecked();
            if (radioTrueChecked) {
                totalScore += 20;
            }

            //Question 4-the answer is basil.
            RadioButton basil = (RadioButton) findViewById(R.id.radio_basil);
            boolean basilChecked = basil.isChecked();
            if (basilChecked) {
                totalScore += 20;
            }

            //Question 5-the answer is cleaning.
            RadioButton cleaning = (RadioButton) findViewById(R.id.radio_cleaning);
            boolean questionFive = cleaning.isChecked();
            if (questionFive) {
                totalScore += 20;
            }
        }

        /**
     * Displays the final score. First, method displays the given score.
     */

    public void submitOrder(View view){
        TextView fullTextView = findViewById(R.id.button3_id);
        Toast.makeText(this, "You scored " + totalScore + "%!", Toast.LENGTH_SHORT).show();
    }
}