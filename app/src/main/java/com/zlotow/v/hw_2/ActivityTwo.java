package com.zlotow.v.hw_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zlotow.v.hw_2.ActivityThree;
import com.zlotow.v.hw_2.R;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{
    Button buttonSendMessage;
    EditText YourMessageField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        buttonSendMessage = (Button) findViewById(R.id.buttonSendMessage);
        YourMessageField = (EditText) findViewById(R.id.YourMessageField);
        buttonSendMessage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (YourMessageField.getText().toString().equals("")) {
            Toast.makeText(this, "Please,fill the field", Toast.LENGTH_SHORT).show();

        } else {
            Intent intent = new Intent(this, ActivityThree.class);
            intent.putExtra("message",YourMessageField.getText().toString());
            startActivity(intent);
        }

    }
}
