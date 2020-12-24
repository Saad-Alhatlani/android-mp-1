package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText quiz = findViewById(R.id.quiz); //defining quiz
        EditText hw = findViewById(R.id.hw);// defining homeworks
        EditText midterm = findViewById(R.id.medterm);// defining midterms
        EditText finals = findViewById(R.id.finals);// defining finals
        TextView result = findViewById(R.id.results);// defining result
        Button reset = findViewById(R.id.reset);// defining reset button
        Button calc = findViewById(R.id.button);// defining calclate button



        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quizString = quiz.getText().toString();
                String hwString = hw.getText().toString();
                String midtermsString = midterm.getText().toString();
                String finalsString = finals.getText().toString();
                double total= Double.parseDouble(quizString) + Double.parseDouble(hwString) + Double.parseDouble(midtermsString) + Double.parseDouble(finalsString);
                //total is where the total marks saved
                //System.out.println("////total = "+total);
                char grade = '0';
                if(total >=90){
                    grade = 'A';
                }
                else if (total >= 80){
                    grade = 'B';
                }
                else if (total>=70){
                    grade = 'C';
                }
                else if (total >= 60){
                    grade= 'D';
                }
                else  if (total < 60){
                    grade = 'F';
                }
                result.setText("grade: "+ grade);
                


            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz.setText("");
                hw.setText("");
                midterm.setText("");
                finals.setText("");
            }
        });


    }
}