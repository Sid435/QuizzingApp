package com.example.quizzingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    private TextView topicName, timer, question, questions;
    AppCompatButton option_1, option_2, option_3, option_4, nextBtn;
    private Timer quizTimer;
    private ImageView backButton;
    private int totalTime = 1, seconds = 0;
    private List<QuestionList> questionLists;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final String getSelectedItemName = getIntent().getStringExtra("TOPIC_NAME");

        questionLists = Questionbank.getQuestions(getSelectedItemName);
        topicName = findViewById(R.id.idTVTopicName);
        timer = findViewById(R.id.idTVTimer);
        backButton = findViewById(R.id.idIVBackButton);
        topicName.setText(getSelectedItemName);

        questions = findViewById(R.id.questions);question = findViewById(R.id.question);
        option_1 = findViewById(R.id.option_1);option_2 = findViewById(R.id.option_2);option_3 = findViewById(R.id.option_3); option_4 = findViewById(R.id.option_4);
        nextBtn = findViewById(R.id.nextBtn);
        startTimer(timer);
        questions.setText((currentQuestionPosition + 1) + "/" + (questionLists.size()));
        question.setText(questionLists.get(0).getQuestion());
        option_1.setText(questionLists.get(0).getOption1());
        option_2.setText(questionLists.get(0).getOption2());
        option_3.setText(questionLists.get(0).getOption3());
        option_4.setText(questionLists.get(0).getOption4());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizTimer.purge();
                quizTimer.cancel();
                Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        option_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_1.getText().toString();
                    option_1.setBackgroundResource(R.drawable.back_red_background);
                    option_1.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_2.getText().toString();
                    option_2.setBackgroundResource(R.drawable.back_red_background);
                    option_2.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_3.getText().toString();
                    option_3.setBackgroundResource(R.drawable.back_red_background);
                    option_3.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option_4.getText().toString();
                    option_4.setBackgroundResource(R.drawable.back_red_background);
                    option_4.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Please Select an option", Toast.LENGTH_SHORT).show();
                }else{
                    changeNextQuestion();
                }
            }
        });
    }
    private void changeNextQuestion(){
        currentQuestionPosition++;
        if(currentQuestionPosition == questionLists.size()){
            nextBtn.setText("Submit");
        }
        if(currentQuestionPosition < questionLists.size()){
            selectedOptionByUser = "";
            option_1.setBackgroundResource(R.drawable.round_back_white_stroke);
            option_1.setTextColor(Color.BLACK);

            option_2.setBackgroundResource(R.drawable.round_back_white_stroke);
            option_2.setTextColor(Color.BLACK);

            option_3.setBackgroundResource(R.drawable.round_back_white_stroke);
            option_3.setTextColor(Color.BLACK);

            option_4.setBackgroundResource(R.drawable.round_back_white_stroke);
            option_4.setTextColor(Color.BLACK);

            questions.setText((currentQuestionPosition + 1) + "/" + (questionLists.size()));
            question.setText(questionLists.get(currentQuestionPosition).getQuestion());
            option_1.setText(questionLists.get(currentQuestionPosition).getOption1());
            option_2.setText(questionLists.get(currentQuestionPosition).getOption2());
            option_3.setText(questionLists.get(currentQuestionPosition).getOption3());
            option_4.setText(questionLists.get(currentQuestionPosition).getOption4());
        }else{
            Intent intent = new Intent(QuizActivity.this, QuizResult.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);
            finish();
        }
    }
    private void startTimer(TextView timerTextView){
        quizTimer = new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(totalTime != 0 && seconds == 0){
                    totalTime--;
                    seconds = 59;
                }else if(totalTime == 0 && seconds == 0){
                    quizTimer.purge();
                    quizTimer.cancel();

//                    Toast.makeText(QuizActivity.this, "Time over!!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResult.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrectAnswer", getIncorrectAnswers());
                    startActivity(intent);
                    finish();
                }else{
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes = String.valueOf(totalTime);
                        String finalSeconds = String.valueOf(seconds);
                        if (finalMinutes.length()== 1){
                            finalMinutes = "0" + finalMinutes;
                        }

                        if(finalSeconds.length() == 1){
                            finalSeconds = "0" + finalSeconds;
                        }
                        timerTextView.setText(finalMinutes + ":" + finalSeconds);
                    }
                });

            }
        }, 1000, 1000);

    }

    private int getIncorrectAnswers() {
        int incorrectAnswers = 0;
        for (int i = 0; i < questionLists.size(); i++) {
            QuestionList list = questionLists.get(i);
            final String getUserSelectedAnswer = list.getUserSelectedAnswer();
            final String getAnswer =  list.getAnswer();

            if(!getUserSelectedAnswer.equals(getAnswer)){
                incorrectAnswers++;
            }

        }return incorrectAnswers;
    }

    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for (int i = 0; i < questionLists.size(); i++) {
            QuestionList list = questionLists.get(i);
            final String getUserSelectedAnswer = list.getUserSelectedAnswer();
            final String getAnswer =  list.getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }

        }return correctAnswers;
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this,MainActivity.class));
        finish();
    }
    private void revealAnswer(){
        final String getAnswer = questionLists.get(currentQuestionPosition).getAnswer();
        if(option_1.getText().toString().equals(getAnswer)){
            option_1.setBackgroundResource(R.drawable.back_green_background);
            option_1.setTextColor(Color.WHITE);
        }
        else if(option_2.getText().toString().equals(getAnswer)){
            option_2.setBackgroundResource(R.drawable.back_green_background);
            option_2.setTextColor(Color.WHITE);
        }
        else if(option_3.getText().toString().equals(getAnswer)){
            option_3.setBackgroundResource(R.drawable.back_green_background);
            option_3.setTextColor(Color.WHITE);
        }
        else if(option_4.getText().toString().equals(getAnswer)){
            option_4.setBackgroundResource(R.drawable.back_green_background);
            option_4.setTextColor(Color.WHITE);
        }
    }
}