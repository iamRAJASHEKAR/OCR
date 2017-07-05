package com.example.raju.peopleforce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show_activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_activity);

        textView= (TextView) findViewById(R.id.ttext_view);



        Bundle bundle = getIntent().getExtras();

//Extract the data…
        String value =bundle.getString("value");
        textView.setText(value);

    }
}
