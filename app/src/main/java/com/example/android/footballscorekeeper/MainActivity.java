package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotTeamA = 0;
    int shotTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalsForTeamA(scoreTeamA);
    }

    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalsForTeamB(scoreTeamB);
    }


    /**
     * Increase the score for Team A by 2 points.
     */
    public void addShotForTeamA(View v) {
        shotTeamA = shotTeamA + 1;
        displayShotsForTeamA(shotTeamA);
    }

    public void addShotForTeamB(View v) {
        shotTeamB = shotTeamB + 1;
        displayShotsForTeamB(shotTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);
    }

    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayShotsForTeamA(int shots) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(shots));
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsForTeamB(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayShotsForTeamB(int shots) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(shots));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }


    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotTeamA = 0;
        shotTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayGoalsForTeamA(scoreTeamA);
        displayShotsForTeamA(shotTeamA);
        displayFoulsForTeamA(shotTeamB);
        displayGoalsForTeamB(scoreTeamB);
        displayShotsForTeamB(foulTeamA);
        displayFoulsForTeamB(foulTeamB);

    }

}