package com.example.tdbada.model.utils;


public class UNE_RESSOURCE {



    private String TYPE;
    private String CODE_RESSOURCE;


    public UNE_RESSOURCE(String TYPE, String CODE_RESSOURCE) {
        this.TYPE = TYPE;
        this.CODE_RESSOURCE = CODE_RESSOURCE;
    }

    public UNE_RESSOURCE() {
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getCODE_RESSOURCE() {
        return CODE_RESSOURCE;
    }

    public void setCODE_RESSOURCE(String CODE_RESSOURCE) {
        this.CODE_RESSOURCE = CODE_RESSOURCE;
    }
}
