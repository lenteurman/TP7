package com.example.admin.tp7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    public static final String VAL_1 = "val1";
    public static final String VAL_2 = "val2";
    private int tableau;
    private int compteur;
    private int reponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //On récupère les valeurs de ma dernière Activité
        Intent intent = getIntent();
        tableau = intent.getIntExtra(VAL_1,0);
        compteur = intent.getIntExtra(VAL_2,0);
        reponse = questions[tableau].getReponse();

        //On actualise Texte et Boutons
        String texte = questions[tableau].getQuestion();
        TextView editText =((TextView) findViewById(R.id.textView3));
        editText.setText(texte);


        Button boutonB = (Button) findViewById(R.id.button4);
        String texte2 = questions[tableau].getChoix1();
        boutonB.setText(texte2);

        Button boutonA = (Button) findViewById(R.id.button5);
        String texte3 = questions[tableau].getChoix2();
        boutonA.setText(texte3);

        //Le Comportement si on clique sur le bouton de Droite
        boutonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tant qu'on n'a pas parcouru toutes les questions
                if (tableau < questions.length-1) {
                    tableau++;
                    if (reponse == 1) { //Bonne réponse
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity3.class);
                    intent.putExtra(VAL_1,tableau);
                    intent.putExtra(VAL_2,compteur);
                    startActivity(intent);
                }
                //Si on a répondu à toutes les questions
                else  {
                    if (reponse == 1) {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity4.class);
                    intent.putExtra("param",compteur);
                    intent.putExtra("param2",questions.length);
                    startActivity(intent);
                }
            }
        });

        //Le Comportement si on clique sur le bouton de Gauche
        boutonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tableau < questions.length-1) {
                    tableau++;
                    if (reponse == 2) {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity3.class);
                    intent.putExtra(VAL_1,tableau);
                    intent.putExtra(VAL_2,compteur);
                    startActivity(intent);
                }
                else  {
                    if (reponse == 2) {
                        compteur++;
                    }
                    Intent intent = new Intent(Activity3.this,Activity4.class);
                    intent.putExtra("param",compteur);
                    intent.putExtra("param2",questions.length);
                    startActivity(intent);
                }
            }
        });

    }
    //Mon tableau de questions
    //Le 4 eme paramètre indique quel est le bon choix le n°1 ou 2
    VraiFaux[] questions = new VraiFaux[] {
            new VraiFaux("Android ou iPhone ?","Android","iPhone",1),
            new VraiFaux("Football ou Rugby ?","Football","Rugby",2),
            new VraiFaux("Nain ou Elfe ?","Nain","Elfe",2)
    };

}
