package com.example.admin.tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final int tableau = 0;
        final int compteur = 0;
        final String reponse = questions[tableau].getReponse();

        Intent intent = getIntent();

        String texte = questions[tableau].getQuestion();
        TextView editText =((TextView) findViewById(R.id.textView3));
        editText.setText(texte);

        Button boutonB = (Button) findViewById(R.id.button4);
        String texte2 = questions[tableau].getChoix1();
        boutonB.setText(texte2);

        Button boutonA = (Button) findViewById(R.id.button5);
        String texte3 = questions[tableau].getChoix2();
        boutonA.setText(texte3);

        boutonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tableau < questions.length-1) {
                    tableau++;
                    if (reponse == "1") {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity3.class);
                    startActivity(intent);
                }
                else  {
                    if (reponse == "1") {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity4.class);
                    intent.getIntExtra("param",compteur);
                    intent.getIntExtra("param2",questions.length);
                    startActivity(intent);
                }
            }
        });

        boutonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tableau < questions.length-1) {
                    tableau++;
                    if (reponse =="2") {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity3.class);
                    startActivity(intent);
                }
                else  {
                    if (reponse =="2") {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity4.class);
                    intent.getIntExtra("param",compteur);
                    intent.getIntExtra("param2",questions.length);
                    startActivity(intent);
                }
            }
        });

    }
    //Mon tableau de questions
    VraiFaux[] questions = new VraiFaux[] {
            new VraiFaux("Couleur","Jaune","Rouge","1"),
            new VraiFaux("Autre","Bleu","Vert","2"),
            new VraiFaux("Autre2","Noir","Blanc","2")
    };

}
