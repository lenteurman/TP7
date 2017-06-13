package com.example.admin.tp7;

/**
 * Created by admin on 12/06/2017.
 */

public class VraiFaux {
    private String question;
    private String choix1;
    private String choix2;
    private int reponse;

    public VraiFaux(String question, String choix1, String choix2, int reponse) {
        setQuestion(question);
        setChoix1(choix1);
        setChoix2(choix2);
        setReponse(reponse);
    };

    public void setQuestion(String question) {
        this.question = question;
    }
    public void setChoix1(String choix1) {
        this.choix1 = choix1;
    }
    public void setChoix2(String choix2) {
        this.choix2 = choix2;
    }
    public void setReponse(int reponse) {
        this.reponse = reponse;
    }
    public String getChoix1() {
        return choix1;
    }
    public String getChoix2() {
        return choix2;
    }
    public String getQuestion() {
        return question;
    }
    public int getReponse() { return reponse; }

}
