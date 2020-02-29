package com.bada.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_TYPE_ACTIVITE")
public class UN_TYPE_ACTIVITE {


    @Id
    private String    id;
    private String    CODE;
    private String    NOM;
    private String    ALIAS;
    private String    IDENTIFIANT;
    private String    DATE_MODIFICATION;
    private String    COMMENTAIRE;
    private String    COULEUR;
    private String    COULEUR_POLICE;
    private String    CODE_PROPRIETAIRE;

    public UN_TYPE_ACTIVITE() {
    }

    public UN_TYPE_ACTIVITE(String CODE, String NOM, String ALIAS, String IDENTIFIANT, String DATE_MODIFICATION,
                            String COMMENTAIRE, String COULEUR, String COULEUR_POLICE, String CODE_PROPRIETAIRE) {
        this.CODE = CODE;
        this.id = CODE;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.IDENTIFIANT = IDENTIFIANT;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getIDENTIFIANT() {
        return IDENTIFIANT;
    }

    public void setIDENTIFIANT(String IDENTIFIANT) {
        this.IDENTIFIANT = IDENTIFIANT;
    }

    public String getDATE_MODIFICATION() {
        return DATE_MODIFICATION;
    }

    public void setDATE_MODIFICATION(String DATE_MODIFICATION) {
        this.DATE_MODIFICATION = DATE_MODIFICATION;
    }

    public String getCOMMENTAIRE() {
        return COMMENTAIRE;
    }

    public void setCOMMENTAIRE(String COMMENTAIRE) {
        this.COMMENTAIRE = COMMENTAIRE;
    }

    public String getCOULEUR() {
        return COULEUR;
    }

    public void setCOULEUR(String COULEUR) {
        this.COULEUR = COULEUR;
    }

    public String getCOULEUR_POLICE() {
        return COULEUR_POLICE;
    }

    public void setCOULEUR_POLICE(String COULEUR_POLICE) {
        this.COULEUR_POLICE = COULEUR_POLICE;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }
}
