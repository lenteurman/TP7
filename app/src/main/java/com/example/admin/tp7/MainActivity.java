package com.example.admin.tp7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boutonD = (Button) findViewById(R.id.button2);
        boutonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Celui de droite");
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("param", "Je viens du bouton de Droite");
                startActivity(intent);
            }
        });

        Button boutonG = (Button) findViewById(R.id.button);
    }

    public void boutonG(View view) {
        Log.d("BOUTON","Celui de gauche");
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        intent.putExtra("param", "Je viens du bouton de Gauche");
        startActivity(intent);
    }
}
