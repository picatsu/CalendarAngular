package com.example.tdbada.model.utils;

public class LES_CONGES {
    private UNE_JOURNEE[] UNE_JOURNEE;
    private UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES;

    public LES_CONGES() {
    }

    public LES_CONGES(UNE_JOURNEE[] UNE_JOURNEE, UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES) {
        this.UNE_JOURNEE = UNE_JOURNEE;
        this.UNE_PERIODE_CONGES = UNE_PERIODE_CONGES;
    }

    public UNE_JOURNEE[] getUNE_JOURNEE() {
        return UNE_JOURNEE;
    }

    public void setUNE_JOURNEE(UNE_JOURNEE[] UNE_JOURNEE) {
        this.UNE_JOURNEE = UNE_JOURNEE;
    }

    public UNE_PERIODE_CONGES[] getUNE_PERIODE_CONGES() {
        return UNE_PERIODE_CONGES;
    }

    public void setUNE_PERIODE_CONGES(UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES) {
        this.UNE_PERIODE_CONGES = UNE_PERIODE_CONGES;
    }
}
