package com.example.android.skatecompetition;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int selectPlayer = 1;
    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fontOnScoreOne = (TextView) findViewById(R.id.player_one_score);
        Typeface typefaceOnScoreOne=Typeface.createFromAsset(getAssets(), "fonts/knewave.ttf");
        fontOnScoreOne.setTypeface(typefaceOnScoreOne);

        TextView fontOnScoreTwo = (TextView) findViewById(R.id.player_two_score);
        Typeface typefaceOnScoreTwo=Typeface.createFromAsset(getAssets(), "fonts/knewave.ttf");
        fontOnScoreTwo.setTypeface(typefaceOnScoreTwo);

        TextView fontOnReset = (TextView) findViewById(R.id.reset_button);
        Typeface typefaceOnReset=Typeface.createFromAsset(getAssets(), "fonts/knewave.ttf");
        fontOnReset.setTypeface(typefaceOnReset);

        ImageButton btnone = (ImageButton) findViewById(R.id.player_one_button);
        btnone.setActivated(true);

        ImageButton btntwo = (ImageButton) findViewById(R.id.player_two_button);
        btntwo.setActivated(false);
    }

    /**
     * Switch to Player One scores
     */
    public void switchToPlayerOne(View v) {
        selectPlayer = 1;
        ImageButton btnone = (ImageButton) findViewById(R.id.player_one_button);
        btnone.setActivated(true);
        ImageButton btntwo = (ImageButton) findViewById(R.id.player_two_button);
        btntwo.setActivated(false);
    }

    /**
     * Switch to Player Two scores
     */
    public void switchToPlayerTwo(View v) {
        selectPlayer = 2;
        ImageButton btnone = (ImageButton) findViewById(R.id.player_one_button);
        btnone.setActivated(false);
        ImageButton btntwo = (ImageButton) findViewById(R.id.player_two_button);
        btntwo.setActivated(true);
    }

    /**
     * Kick Flip Increases the score by 7 points.
     */
    public void kickFlip(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 7;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 7;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }


    /**
     * 180 Spin Increases the score by 5 points.
     */
    public void halfSpin(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 5;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 5;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Varial Flip Increases the score by 10 points.
     */
    public void varialFlip(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 10;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 10;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Shove It Increases the score by 3 points.
     */
    public void shoveIt(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 3;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 3;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Board Slide Increases the score by 7 points.
     */
    public void boardSlide(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 7;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 7;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * 50-50 Increases the score by 6 points.
     */
    public void fiftyFifty(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 6;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 6;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Nose Slide Increases the score by 5 points.
     */
    public void noseSlide(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 5;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 5;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Five 0 Increases the score by 8 points.
     */
    public void fiveAll(View v) {
        if (selectPlayer == 1) {
            scorePlayerOne = scorePlayerOne + 8;
            displayForPlayerOne(scorePlayerOne);
        } else if (selectPlayer == 2) {
            scorePlayerTwo = scorePlayerTwo + 8;
            displayForPlayerTwo(scorePlayerTwo);
        }
    }

    /**
     * Resets the game.
     */
    public void resetGame(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        selectPlayer = 1;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        ImageButton btnone = (ImageButton) findViewById(R.id.player_one_button);
        btnone.setActivated(true);
        ImageButton btntwo = (ImageButton) findViewById(R.id.player_two_button);
        btntwo.setActivated(false);
    }

    /**
     * Displays the given score for Player One.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player Two.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(score));
    }
}
