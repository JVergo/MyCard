package com.example.mycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null && bundle.containsKey("name")) {
            String myName = bundle.getString("name");
            Toast toast = Toast.makeText(this, myName, Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
