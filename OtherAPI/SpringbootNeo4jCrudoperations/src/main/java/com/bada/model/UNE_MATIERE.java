package com.bada.model;


import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NodeEntity
public class UNE_MATIERE {


    @Id
    private String id;
    private String CODE;
    private String DATE_MODIFICATION;
    private String NOM;
    private String ALIAS;
    private String COMMENTAIRE;
    private String IDENTIFIANT;
    private String COULEUR;
    private String COULEUR_POLICE;
    private String CODE_PROPRIETAIRE;
    private String CODE_CNU;


    public UNE_MATIERE() {
    }

    public UNE_MATIERE(String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String COMMENTAIRE,
                       String IDENTIFIANT, String COULEUR, String COULEUR_POLICE, String CODE_PROPRIETAIRE,
                       String CODE_CNU) {
        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.CODE_CNU = CODE_CNU;
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

    public String getCODE_CNU() {
        return CODE_CNU;
    }

    public void setCODE_CNU(String CODE_CNU) {
        this.CODE_CNU = CODE_CNU;
    }

    @Override
    public String toString() {
        return "UNE_MATIERE{" +
                "id='" + id + '\'' +
                ", CODE='" + CODE + '\'' +
                ", DATE_MODIFICATION='" + DATE_MODIFICATION + '\'' +
                ", NOM='" + NOM + '\'' +
                ", ALIAS='" + ALIAS + '\'' +
                ", COMMENTAIRE='" + COMMENTAIRE + '\'' +
                ", IDENTIFIANT='" + IDENTIFIANT + '\'' +
                ", COULEUR='" + COULEUR + '\'' +
                ", COULEUR_POLICE='" + COULEUR_POLICE + '\'' +
                ", CODE_PROPRIETAIRE='" + CODE_PROPRIETAIRE + '\'' +
                ", CODE_CNU='" + CODE_CNU + '\'' +
                '}';
    }
}
