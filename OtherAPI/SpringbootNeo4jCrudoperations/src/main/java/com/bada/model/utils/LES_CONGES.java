package com.bada.model.utils;

public class LES_CONGES {
    private com.bada.model.utils.UNE_JOURNEE[] UNE_JOURNEE;
    private com.bada.model.utils.UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES;

    public LES_CONGES() {
    }

    public LES_CONGES(com.bada.model.utils.UNE_JOURNEE[] UNE_JOURNEE, UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES) {
        this.UNE_JOURNEE = UNE_JOURNEE;
        this.UNE_PERIODE_CONGES = UNE_PERIODE_CONGES;
    }

    public com.bada.model.utils.UNE_JOURNEE[] getUNE_JOURNEE() {
        return UNE_JOURNEE;
    }

    public void setUNE_JOURNEE(com.bada.model.utils.UNE_JOURNEE[] UNE_JOURNEE) {
        this.UNE_JOURNEE = UNE_JOURNEE;
    }

    public UNE_PERIODE_CONGES[] getUNE_PERIODE_CONGES() {
        return UNE_PERIODE_CONGES;
    }

    public void setUNE_PERIODE_CONGES(UNE_PERIODE_CONGES[] UNE_PERIODE_CONGES) {
        this.UNE_PERIODE_CONGES = UNE_PERIODE_CONGES;
    }
}
