package com.example.semana1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        final TextView mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText(R.string.app_name);

        Button mbutton = (Button) findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mEdittext = (EditText)findViewById(R.id.edittext);
                mTextView.setText(mEdittext.getText());
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_SHORT).show();
            }
        });
        Button mNewbutton = (Button) findViewById(R.id.button_new);
        mNewbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), NewActivity.class);
                startActivity(intent);
            }
        });
    }
}
