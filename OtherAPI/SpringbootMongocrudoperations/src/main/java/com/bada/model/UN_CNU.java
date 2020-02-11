package com.bada.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_CNU")
public class UN_CNU {

    @Id
    private int id;
    private String CODE;
    private String SECTION;
    private String NOM;
    private String CODE_PROPRIETAIRE;
    private String DATE_MODIFICATION;


    public UN_CNU(int id, String CODE, String SECTION, String NOM, String CODE_PROPRIETAIRE, String DATE_MODIFICATION) {
        this.id = id;
        this.CODE = CODE;
        this.SECTION = SECTION;
        this.NOM = NOM;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getSECTION() {
        return SECTION;
    }

    public void setSECTION(String SECTION) {
        this.SECTION = SECTION;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }

    public String getDATE_MODIFICATION() {
        return DATE_MODIFICATION;
    }

    public void setDATE_MODIFICATION(String DATE_MODIFICATION) {
        this.DATE_MODIFICATION = DATE_MODIFICATION;
    }
}
