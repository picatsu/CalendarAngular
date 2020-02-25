package com.bada.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "UN_ETUDIANT")
public class UN_ETUDIANT {


    @Id
    private String   id;
    private String   CODE;
    private String   DATE_MODIFICATION;
    private String   NOM;
    private String   PRENOM;
    private String   PRENOM2;
    private String   NAISSANCE;
    private String   IDENTIFIANT;
    private String   COMMENTAIRE;
    private String   BOURSIER;
    private String   COMPOSANTE;
    private String   EMAIL;
    private String   TYPE_PUBLIC;
    private String   CODE_PROPRIETAIRE;

    public UN_ETUDIANT() {
    }

    public UN_ETUDIANT(String CODE, String DATE_MODIFICATION, String NOM, String PRENOM, String PRENOM2, String NAISSANCE,
                       String IDENTIFIANT,
                       String COMMENTAIRE, String BOURSIER, String COMPOSANTE, String EMAIL, String TYPE_PUBLIC,
                       String CODE_PROPRIETAIRE) {
        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.PRENOM2 = PRENOM2;
        this.NAISSANCE = NAISSANCE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.BOURSIER = BOURSIER;
        this.COMPOSANTE = COMPOSANTE;
        this.EMAIL = EMAIL;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
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

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public String getPRENOM2() {
        return PRENOM2;
    }

    public void setPRENOM2(String PRENOM2) {
        this.PRENOM2 = PRENOM2;
    }

    public String getNAISSANCE() {
        return NAISSANCE;
    }

    public void setNAISSANCE(String NAISSANCE) {
        this.NAISSANCE = NAISSANCE;
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

    public String getBOURSIER() {
        return BOURSIER;
    }

    public void setBOURSIER(String BOURSIER) {
        this.BOURSIER = BOURSIER;
    }

    public String getCOMPOSANTE() {
        return COMPOSANTE;
    }

    public void setCOMPOSANTE(String COMPOSANTE) {
        this.COMPOSANTE = COMPOSANTE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTYPE_PUBLIC() {
        return TYPE_PUBLIC;
    }

    public void setTYPE_PUBLIC(String TYPE_PUBLIC) {
        this.TYPE_PUBLIC = TYPE_PUBLIC;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }
}
