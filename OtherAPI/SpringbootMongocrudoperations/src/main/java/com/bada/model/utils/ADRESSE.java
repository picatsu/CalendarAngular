package com.bada.model.utils;


public class ADRESSE {

    private String NUMERO;
    private String RUE;
    private String CODE_POSTAL;
    private String VILLE;
    private String PAYS;
    private String TELEPHONE;
    private String TELEPHONE2;
    private String EMAIL;


    public ADRESSE() {
    }

    public ADRESSE(String NUMERO, String RUE, String CODE_POSTAL, String VILLE,
                   String PAYS, String TELEPHONE, String TELEPHONE2, String EMAIL) {
        this.NUMERO = NUMERO;
        this.RUE = RUE;
        this.CODE_POSTAL = CODE_POSTAL;
        this.VILLE = VILLE;
        this.PAYS = PAYS;
        this.TELEPHONE = TELEPHONE;
        this.TELEPHONE2 = TELEPHONE2;
        this.EMAIL = EMAIL;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getRUE() {
        return RUE;
    }

    public void setRUE(String RUE) {
        this.RUE = RUE;
    }

    public String getCODE_POSTAL() {
        return CODE_POSTAL;
    }

    public void setCODE_POSTAL(String CODE_POSTAL) {
        this.CODE_POSTAL = CODE_POSTAL;
    }

    public String getVILLE() {
        return VILLE;
    }

    public void setVILLE(String VILLE) {
        this.VILLE = VILLE;
    }

    public String getPAYS() {
        return PAYS;
    }

    public void setPAYS(String PAYS) {
        this.PAYS = PAYS;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getTELEPHONE2() {
        return TELEPHONE2;
    }

    public void setTELEPHONE2(String TELEPHONE2) {
        this.TELEPHONE2 = TELEPHONE2;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
