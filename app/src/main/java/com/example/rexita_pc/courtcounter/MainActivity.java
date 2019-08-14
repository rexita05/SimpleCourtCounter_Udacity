package com.example.rexita_pc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneForTeamA(View v) {
        displayForTeamA(scoreTeamA += 1);
    }

    public void addTwoForTeamA(View v) {
        displayForTeamA(scoreTeamA += 2);
    }

    public void addThreeForTeamA(View v) {
        displayForTeamA(scoreTeamA += 3);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View v) {
        displayForTeamB(scoreTeamB += 1);
    }

    public void addTwoForTeamB(View v) {
        displayForTeamB(scoreTeamB += 2);
    }

    public void addThreeForTeamB(View v) {
        displayForTeamB(scoreTeamB += 3);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
}
