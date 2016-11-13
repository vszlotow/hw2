package com.zlotow.v.hw_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity {
    TextView YourMessageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        TextView YourMessageView = (TextView) findViewById(R.id.YourMessageView);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        YourMessageView.setText(message);
    }
}
