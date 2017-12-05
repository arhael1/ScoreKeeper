package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int shotsA = 0;
    int cornersA = 0;
    int foulsA = 0;
    int shotsB = 0;
    int cornersB = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayShotsA(shotsA);
        displayCornersA(cornersA);
        displayFoulsA(foulsA);
        displayShotsB(shotsB);
        displayCornersB(cornersB);
        displayFoulsB(foulsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void displayShotsA(int shotsA) {
        TextView scoreView = (TextView) findViewById(R.id.shots_teamA);
        scoreView.setText(String.valueOf(shotsA));
    }

    public void displayShotsB(int shotsB) {
        TextView scoreView = (TextView) findViewById(R.id.shots_teamB);
        scoreView.setText(String.valueOf(shotsB));
    }

    public void displayCornersA(int cornersA) {
        TextView scoreView = (TextView) findViewById(R.id.corners_teamA);
        scoreView.setText(String.valueOf(cornersA));
    }

    public void displayCornersB(int cornersB) {
        TextView scoreView = (TextView) findViewById(R.id.corners_teamB);
        scoreView.setText(String.valueOf(cornersB));
    }

    public void displayFoulsA(int foulsA) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_teamA);
        scoreView.setText(String.valueOf(foulsA));
    }

    public void displayFoulsB(int foulsB) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_teamB);
        scoreView.setText(String.valueOf(foulsB));
    }

    public void goalTeamA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void goalTeamB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void shotsTeamA(View view) {
        shotsA = shotsA + 1;
        displayShotsA(shotsA);
    }

    public void shotsTeamB(View view) {
        shotsB = shotsB + 1;
        displayShotsB(shotsB);
    }

    public void cornersTeamA(View view) {
        cornersA = cornersA + 1;
        displayCornersA(cornersA);
    }

    public void cornersTeamB(View view) {
        cornersB = cornersB + 1;
        displayCornersB(cornersB);
    }

    public void foulsTeamA(View view) {
        foulsA = foulsA + 1;
        displayFoulsA(foulsA);
    }

    public void foulsTeamB(View view) {
        foulsB = foulsB + 1;
        displayFoulsB(foulsB);
    }

    public void resetButton(View v) {
        scoreA = 0;
        scoreB = 0;
        shotsA = 0;
        cornersA = 0;
        foulsA = 0;
        shotsB = 0;
        cornersB = 0;
        foulsB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayShotsA(shotsA);
        displayCornersA(cornersA);
        displayFoulsA(foulsA);
        displayShotsB(shotsB);
        displayCornersB(cornersB);
        displayFoulsB(foulsB);
    }
}
