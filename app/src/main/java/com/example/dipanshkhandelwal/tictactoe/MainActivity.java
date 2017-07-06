package com.example.dipanshkhandelwal.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvGameBoard;
    Button[][] b = new Button[3][3];
    int count;
    Button bReset;
    int boardStatus[][] = new int[3][3];
    String PLAYER_X = "Player X ";
    String PLAYER_O = "Player O ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        PLAYER_X = i.getStringExtra("PLAYER_X") + " ";
        PLAYER_O = i.getStringExtra("PLAYER_O") + " ";

        tvGameBoard = (TextView) findViewById(R.id.tvGameStatus);
        bReset = (Button) findViewById(R.id.bReset);
        b[0][0] = (Button) findViewById(R.id.b00);
        b[0][1] = (Button) findViewById(R.id.b01);
        b[0][2] = (Button) findViewById(R.id.b02);
        b[1][0] = (Button) findViewById(R.id.b10);
        b[1][1] = (Button) findViewById(R.id.b11);
        b[1][2] = (Button) findViewById(R.id.b12);
        b[2][0] = (Button) findViewById(R.id.b20);
        b[2][1] = (Button) findViewById(R.id.b21);
        b[2][2] = (Button) findViewById(R.id.b22);

        initialize();
        b[0][0].setOnClickListener(this);
        b[0][1].setOnClickListener(this);
        b[0][2].setOnClickListener(this);
        b[1][0].setOnClickListener(this);
        b[1][1].setOnClickListener(this);
        b[1][2].setOnClickListener(this);
        b[2][0].setOnClickListener(this);
        b[2][1].setOnClickListener(this);
        b[2][2].setOnClickListener(this);
        bReset.setOnClickListener(this);

    }


    public void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardStatus[i][j] = -1;
            }
        }

        count = 0;
    }

    public void setInfo(String s) {
        tvGameBoard.setText(s);

    }

    public void enableAllButtons(boolean value) {
        b[0][0].setEnabled(value);
        b[0][1].setEnabled(value);
        b[0][2].setEnabled(value);
        b[1][0].setEnabled(value);
        b[1][1].setEnabled(value);
        b[1][2].setEnabled(value);
        b[2][0].setEnabled(value);
        b[2][1].setEnabled(value);
        b[2][2].setEnabled(value);
    }

    public void resetButtonPressed() {
        initialize();
        setInfo("Start Again");
        enableAllButtons(true);

        Toast.makeText(MainActivity.this, "Play Again", Toast.LENGTH_LONG).show();
        b[0][0].setText("");
        b[0][1].setText("");
        b[0][2].setText("");
        b[1][0].setText("");
        b[1][1].setText("");
        b[1][2].setText("");
        b[2][0].setText("");
        b[2][1].setText("");
        b[2][2].setText("");
    }

    public void result(String s) {
        setInfo(s);
        enableAllButtons(false);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        boolean resetpressed = false;
        switch (id) {
            case R.id.b00:
                if (count % 2 == 0) {
                    boardStatus[0][0] = 1;
                    b[0][0].setText("X");
                    b[0][0].setEnabled(false);
                } else {
                    boardStatus[0][0] = 0;
                    b[0][0].setText("O");
                    b[0][0].setEnabled(false);
                }
                break;

            case R.id.b01:
                if (count % 2 == 0) {
                    boardStatus[0][1] = 1;
                    b[0][1].setText("X");
                    b[0][1].setEnabled(false);
                } else {
                    boardStatus[0][1] = 0;
                    b[0][1].setText("O");
                    b[0][1].setEnabled(false);
                }
                break;

            case R.id.b02:
                if (count % 2 == 0) {
                    boardStatus[0][2] = 1;
                    b[0][2].setText("X");
                    b[0][2].setEnabled(false);
                } else {
                    boardStatus[0][2] = 0;
                    b[0][2].setText("O");
                    b[0][2].setEnabled(false);
                }
                break;

            case R.id.b10:
                if (count % 2 == 0) {
                    boardStatus[1][0] = 1;
                    b[1][0].setText("X");
                    b[1][0].setEnabled(false);
                } else {
                    boardStatus[1][0] = 0;
                    b[1][0].setText("O");
                    b[1][0].setEnabled(false);
                }
                break;

            case R.id.b11:
                if (count % 2 == 0) {
                    boardStatus[1][1] = 1;
                    b[1][1].setText("X");
                    b[1][1].setEnabled(false);
                } else {
                    boardStatus[1][1] = 0;
                    b[1][1].setText("O");
                    b[1][1].setEnabled(false);
                }
                break;

            case R.id.b12:
                if (count % 2 == 0) {
                    boardStatus[1][2] = 1;
                    b[1][2].setText("X");
                    b[1][2].setEnabled(false);
                } else {
                    boardStatus[1][2] = 0;
                    b[1][2].setText("O");
                    b[1][2].setEnabled(false);
                }
                break;

            case R.id.b20:
                if (count % 2 == 0) {
                    boardStatus[2][0] = 1;
                    b[2][0].setText("X");
                    b[2][0].setEnabled(false);
                } else {
                    boardStatus[2][0] = 0;
                    b[2][0].setText("O");
                    b[2][0].setEnabled(false);
                }
                break;

            case R.id.b21:
                if (count % 2 == 0) {
                    boardStatus[2][1] = 1;
                    b[2][1].setText("X");
                    b[2][1].setEnabled(false);
                } else {
                    boardStatus[2][1] = 0;
                    b[2][1].setText("O");
                    b[2][1].setEnabled(false);
                }
                break;

            case R.id.b22:
                if (count % 2 == 0) {
                    boardStatus[2][2] = 1;
                    b[2][2].setText("X");
                    b[2][2].setEnabled(false);
                } else {
                    boardStatus[2][2] = 0;
                    b[2][2].setText("O");
                    b[2][2].setEnabled(false);
                }
                break;

            case R.id.bReset:
                resetpressed = true;
                break;
        }

        if (!resetpressed) {

            count++;
            if (count % 2 == 0) {
                setInfo(PLAYER_X + "turn");
            } else {
                setInfo(PLAYER_O + "turn");
            }

            check();


        } else {
            resetButtonPressed();
        }

    }

    public void check() {
        boolean t=false;
        //horizontal
        for (int i = 0; i < 3; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]) {
                if (boardStatus[i][0] == 1) {
                    result(PLAYER_X + "wins");enableAllButtons(false);t=true;
                } else if (boardStatus[i][0] == 0) {
                    result(PLAYER_O + "wins");enableAllButtons(false);t=true;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[1][i] == boardStatus[2][i]) {
                if (boardStatus[0][i] == 1) {
                    result(PLAYER_X + "wins");enableAllButtons(false);t=true;

                } else if (boardStatus[0][i] == 0) {
                    result(PLAYER_O + "wins");enableAllButtons(false);t=true;
                }
            }
        }

        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]) {
            if (boardStatus[0][0] == 1) {
                result(PLAYER_X + "wins");enableAllButtons(false);t=true;
            } else if (boardStatus[0][0] == 0) {
                result(PLAYER_O + "wins");enableAllButtons(false);t=true;
            }
        }

        if (boardStatus[0][2] == boardStatus[1][1] && boardStatus[2][0] == boardStatus[1][1]) {
            if (boardStatus[0][2] == 1) {
                result(PLAYER_X + "wins");enableAllButtons(false);t=true;
            } else if (boardStatus[0][2] == 0) {
                result(PLAYER_O + "wins");enableAllButtons(false);t=true;
            }
        }

        if (count == 9 && !t) {
            result("DRAW");
        }
    }
}
