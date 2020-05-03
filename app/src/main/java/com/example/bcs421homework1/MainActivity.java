package com.example.bcs421homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mCreditsTextView;
    private Button mCreditsButton;
    private TextView mStudyHoursTextView;
    private Button mStudyHoursButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCreditsButton = findViewById(R.id.buttonCredits);
        mCreditsTextView = findViewById(R.id.textViewCredits);
        mStudyHoursButton = findViewById(R.id.buttonStudyHours);
        mStudyHoursTextView = findViewById(R.id.textViewStudyHours);


        mCreditsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String credits = mCreditsTextView.getText().toString();
                Toast.makeText(getApplicationContext(),credits, Toast.LENGTH_SHORT).show();
            }
        });

        mStudyHoursButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hours = mStudyHoursTextView.getText().toString();
                Toast.makeText(getApplicationContext(),hours, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
