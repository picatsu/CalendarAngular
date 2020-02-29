package com.bada.model.utils;

public class UNE_PERIODE_CONGES {


    private String DATE_DEBUT;
    private String DATE_FIN;

    public UNE_PERIODE_CONGES() {
    }

    public UNE_PERIODE_CONGES(String DATE_DEBUT, String DATE_FIN) {
        this.DATE_DEBUT = DATE_DEBUT;
        this.DATE_FIN = DATE_FIN;
    }

    public String getDATE_DEBUT() {
        return DATE_DEBUT;
    }

    public void setDATE_DEBUT(String DATE_DEBUT) {
        this.DATE_DEBUT = DATE_DEBUT;
    }

    public String getDATE_FIN() {
        return DATE_FIN;
    }

    public void setDATE_FIN(String DATE_FIN) {
        this.DATE_FIN = DATE_FIN;
    }
}
