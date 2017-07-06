package com.example.dipanshkhandelwal.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        play = (Button) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = et1.getText().toString();
                String name2 = et2.getText().toString();

                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                i.putExtra("PLAYER_X", name1);
                i.putExtra("PLAYER_O", name2);
                startActivity(i);
            }
        });
    }
}
