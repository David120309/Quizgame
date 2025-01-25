package com.example.quiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;

public class QuizActivity extends AppCompatActivity {
    private TextView questions;
    private TextView question;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;
    private Timer quizTimer;
    private int seconds = 0;
    private int totalTimeInMins = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"}) final ImageView backBtn = findViewById(R.id.backBtn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress", "WrongViewCast"}) final TextView timer = findViewById(R.id.timer);
        @SuppressLint({"MissingInflatedId", "LocalSuppress", "WrongViewCast"}) final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);
        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopic);
    }
    private void startTimer (TextView timerTextView) {
      quizTimer = new Timer();
    }
}