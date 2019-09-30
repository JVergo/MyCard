package com.example.mycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null && bundle.containsKey("ULR")) {
            String ULR = bundle.getString("ULR");
            WebView myWebView = findViewById(R.id.webview);
            myWebView.loadUrl(ULR);

            EditText editText = findViewById(R.id.editView);
            editText.setText(ULR);

            editText.setOnEditorActionListener(new EditText.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_DONE) {
                        WebView myWebView = findViewById(R.id.webview);
                        EditText editText = findViewById(R.id.editView);
                        myWebView.loadUrl(editText.getText().toString());
                        return true;
                    }
                    return false;
                }
            });
        }
    }

}
