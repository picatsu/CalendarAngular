package com.bada.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UNE_SALLE")
public class UNE_SALLE {


    @Id
    private String id;
    private String CODE;
    private String DATE_MODIFICATION;
    private String NOM;
    private String ALIAS;
    private String IDENTIFIANT;
    private String COMMENTAIRE;
    private String COMPOSANTE;
    private String CAPACITE;
    private String SURFACE;
    private String COULEUR;
    private String COULEUR_POLICE;
    private String CODE_PROPRIETAIRE;
    private String CODE_ZONE;
    private String TYPES_DE_LA_SALLE;

    public UNE_SALLE() {
    }

    public UNE_SALLE(String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String IDENTIFIANT,
                     String COMMENTAIRE, String COMPOSANTE, String CAPACITE, String SURFACE, String COULEUR,
                     String COULEUR_POLICE, String CODE_PROPRIETAIRE, String CODE_ZONE, String TYPES_DE_LA_SALLE) {
        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.CAPACITE = CAPACITE;
        this.SURFACE = SURFACE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.CODE_ZONE = CODE_ZONE;
        this.TYPES_DE_LA_SALLE = TYPES_DE_LA_SALLE;
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

    public String getIDENTIFIANT() {
        return IDENTIFIANT;
    }

    public void setIDENTIFIANT(String IDENTIFIANT) {
        this.IDENTIFIANT = IDENTIFIANT;
    }

    public String getCOMMENTAIRE() {
        return COMMENTAIRE;
    }

    public void setCOMMENTAIRE(String COMMENTAIRE) {
        this.COMMENTAIRE = COMMENTAIRE;
    }

    public String getCOMPOSANTE() {
        return COMPOSANTE;
    }

    public void setCOMPOSANTE(String COMPOSANTE) {
        this.COMPOSANTE = COMPOSANTE;
    }

    public String getCAPACITE() {
        return CAPACITE;
    }

    public void setCAPACITE(String CAPACITE) {
        this.CAPACITE = CAPACITE;
    }

    public String getSURFACE() {
        return SURFACE;
    }

    public void setSURFACE(String SURFACE) {
        this.SURFACE = SURFACE;
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

    public String getCODE_ZONE() {
        return CODE_ZONE;
    }

    public void setCODE_ZONE(String CODE_ZONE) {
        this.CODE_ZONE = CODE_ZONE;
    }

    public String getTYPES_DE_LA_SALLE() {
        return TYPES_DE_LA_SALLE;
    }

    public void setTYPES_DE_LA_SALLE(String TYPES_DE_LA_SALLE) {
        this.TYPES_DE_LA_SALLE = TYPES_DE_LA_SALLE;
    }
}
