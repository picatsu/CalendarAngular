package com.bada.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UNe_COMPOSANTE")
public class UNE_COMPOSANTE {
    @Id
    private String id;
    private String CODE;
    private String DATE_MODIFICATION;
    private String NOM;
    private String ALIAS;
    private String COMMENTAIRE;
    private String IDENTIFIANT ;
    private String TYPE_DE_COMPOSANTE ;
    private String COULEUR ;
    private String COULEUR_POLICE ;
    private String CODE_PROPRIETAIRE ;

    public UNE_COMPOSANTE() {
    }

    public UNE_COMPOSANTE( String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String COMMENTAIRE,
                          String IDENTIFIANT,
                          String TYPE_DE_COMPOSANTE, String COULEUR, String COULEUR_POLICE, String CODE_PROPRIETAIRE) {

        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.TYPE_DE_COMPOSANTE = TYPE_DE_COMPOSANTE;
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

    public String getDATE_MODIFICATION() {
        return DATE_MODIFICATION;
    }

    public void setDATE_MODIFICATION(String DATE_MODIFICATION) {
        this.DATE_MODIFICATION = DATE_MODIFICATION;
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

    public String getCOMMENTAIRE() {
        return COMMENTAIRE;
    }

    public void setCOMMENTAIRE(String COMMENTAIRE) {
        this.COMMENTAIRE = COMMENTAIRE;
    }

    public String getIDENTIFIANT() {
        return IDENTIFIANT;
    }

    public void setIDENTIFIANT(String IDENTIFIANT) {
        this.IDENTIFIANT = IDENTIFIANT;
    }

    public String getTYPE_DE_COMPOSANTE() {
        return TYPE_DE_COMPOSANTE;
    }

    public void setTYPE_DE_COMPOSANTE(String TYPE_DE_COMPOSANTE) {
        this.TYPE_DE_COMPOSANTE = TYPE_DE_COMPOSANTE;
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
