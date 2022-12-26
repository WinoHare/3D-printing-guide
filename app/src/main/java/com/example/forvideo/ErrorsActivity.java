package com.example.forvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ErrorsActivity extends AppCompatActivity {
    public static final String EXTRA_ERROR = "errorId";
    TextView textView2;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errors);


        int sportId = (Integer) getIntent().getExtras().get(EXTRA_ERROR);
        Error error = Error.errors[sportId];

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(error.getImageResourceId());
        imageView.setContentDescription(error.getName());

        TextView textView = findViewById(R.id.name);
        textView.setText(error.getName());

        textView1 = findViewById(R.id.description);
        textView1.setText(error.getDescription());

        textView2 = findViewById(R.id.solution);
        textView2.setText(error.getSolution());

        loadDoc();
    }
    private void loadDoc() {

        textView1.setMovementMethod(new ScrollingMovementMethod());
        textView2.setMovementMethod(new ScrollingMovementMethod());
    }
}
