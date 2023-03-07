package com.example.quizzingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    private LinearLayout java, php, html, android;
    private AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = findViewById(R.id.idjava);
        php = findViewById(R.id.idphp);
        html = findViewById(R.id.idhtml);
        android = findViewById(R.id.idandroid);

        button = findViewById(R.id.idButton);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.setBackgroundResource(R.drawable.round_back_white_stroker);
                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
                selectedTopicName = "java";
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white_stroker);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
                selectedTopicName = "php";
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white_stroker);
                android.setBackgroundResource(R.drawable.round_back_white10);
                selectedTopicName = "html";
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white_stroker);
                selectedTopicName = "android";
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Select a topic", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("TOPIC_NAME",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}