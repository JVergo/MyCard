package com.example.mycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editView, setView;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editView = findViewById(R.id.EditView);
        setView = findViewById(R.id.SetView);
        pb = findViewById(R.id.progressBar);
    }

    public void changeText(View view) {
        setView.setText(editView.getText());
    }

    public void changeProgressBar(View view) {
        String change = view.getTag().toString();
        if(change == "add") {
            pb.setProgress(pb.getProgress() + 1);
        }
        else if (change == "sub")
        {
            pb.setProgress(pb.getProgress() - 1);
        }
    }
}
