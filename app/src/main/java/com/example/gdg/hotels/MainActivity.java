package com.example.gdg.hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;

    String str;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhotel1();



            }
        });

    }
    public void openhotel1(){
        Intent intent  = new Intent(MainActivity.this, WELCOME.class);
        str=et.getText().toString();
        intent.putExtra("Value",str);
        startActivity(intent);
        finish();
    }
}
