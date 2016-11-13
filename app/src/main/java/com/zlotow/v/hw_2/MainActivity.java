package com.zlotow.v.hw_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zlotow.v.hw_2.ActivityTwo;
import com.zlotow.v.hw_2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonStart2Act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart2Act = (Button) findViewById(R.id.buttonStart2Act);
        buttonStart2Act.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonStart2Act:
                Intent intent = new Intent (this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
