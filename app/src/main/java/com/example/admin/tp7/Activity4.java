package com.example.admin.tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Intent intent = getIntent();
        String texte = intent.getIntExtra("param",0)+"/"+intent.getIntExtra("param2",1);
        TextView editText =((TextView) findViewById(R.id.textView4));
        editText.setText(texte);
    }
}