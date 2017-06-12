package com.example.admin.tp7;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText =((TextView) findViewById(R.id.textView2));
        editText.setText(texte);

        Button boutonC = (Button) findViewById(R.id.button3);
        boutonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Celui de la page 2");
                Intent intent = new Intent(Activity2.this,Activity3.class);
                intent.putExtra("param2", "Je suis du bouton de la page 2");
                startActivity(intent);
            }
        });
    }
}
