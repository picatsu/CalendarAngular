package com.bada.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "SAUVEGARDE")
public class SAUVEGARDE {


    private String DATE;
    private String VERSION;
    private String UTILISATEUR;

    public SAUVEGARDE(String DATE, String VERSION, String UTILISATEUR) {
        this.DATE = DATE;
        this.VERSION = VERSION;
        this.UTILISATEUR = UTILISATEUR;
    }

    public SAUVEGARDE() {
    }



    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getUTILISATEUR() {
        return UTILISATEUR;
    }

    public void setUTILISATEUR(String UTILISATEUR) {
        this.UTILISATEUR = UTILISATEUR;
    }

    @Override
    public String toString() {
        return "SAUVEGARDE{" +
                ", DATE='" + DATE + '\'' +
                ", VERSION='" + VERSION + '\'' +
                ", UTILISATEUR='" + UTILISATEUR + '\'' +
                '}';
    }
}
