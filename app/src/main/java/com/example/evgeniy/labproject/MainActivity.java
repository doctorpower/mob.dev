package com.example.evgeniy.labproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        final EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);


        View.OnClickListener onButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                myIntent.putExtra("username", username.getText().toString());
                startActivity(myIntent);
            }
        };

        button1.setOnClickListener(onButtonClick);
    }
}
