package com.bada.model;

import com.bada.model.utils.ADRESSE;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_PROFESSEUR")
public class UN_PROFESSEUR {


    private String CODE;
    private String DATE_MODIFICATION;
    private String NOM;
    private String PRENOM;
    private String PRENOM2;
    private String ALIAS;
    private String IDENTIFIANT_NATIONAL;
    private String IDENTIFIANT;
    private String COMMENTAIRE;
    private String COMPOSANTE;
    private String TITULAIRE;
    private String DATE_DOSSIER;
    private String NAISSANCE;
    private String CNU;
    private String GRADE;
    private String CODE_PROPRIETAIRE;
    private String COULEUR;
    private String COULEUR_POLICE;
    private String VOLUME_STAT_SPECIF;
    private String VOLUME_COMP_SPECIFIQUE;
    private com.bada.model.utils.ADRESSE ADRESSE;


    public UN_PROFESSEUR() {
    }

    public UN_PROFESSEUR(String CODE, String DATE_MODIFICATION, String NOM, String PRENOM, String PRENOM2, String ALIAS, String IDENTIFIANT_NATIONAL, String IDENTIFIANT, String COMMENTAIRE, String COMPOSANTE, String TITULAIRE, String DATE_DOSSIER, String NAISSANCE, String CNU, String GRADE, String CODE_PROPRIETAIRE, String COULEUR, String COULEUR_POLICE, String VOLUME_STAT_SPECIF, String VOLUME_COMP_SPECIFIQUE, ADRESSE ADRESSE) {
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.PRENOM2 = PRENOM2;
        this.ALIAS = ALIAS;
        this.IDENTIFIANT_NATIONAL = IDENTIFIANT_NATIONAL;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.TITULAIRE = TITULAIRE;
        this.DATE_DOSSIER = DATE_DOSSIER;
        this.NAISSANCE = NAISSANCE;
        this.CNU = CNU;
        this.GRADE = GRADE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.VOLUME_STAT_SPECIF = VOLUME_STAT_SPECIF;
        this.VOLUME_COMP_SPECIFIQUE = VOLUME_COMP_SPECIFIQUE;
        this.ADRESSE = ADRESSE;
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

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getIDENTIFIANT_NATIONAL() {
        return IDENTIFIANT_NATIONAL;
    }

    public void setIDENTIFIANT_NATIONAL(String IDENTIFIANT_NATIONAL) {
        this.IDENTIFIANT_NATIONAL = IDENTIFIANT_NATIONAL;
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

    public String getTITULAIRE() {
        return TITULAIRE;
    }

    public void setTITULAIRE(String TITULAIRE) {
        this.TITULAIRE = TITULAIRE;
    }

    public String getDATE_DOSSIER() {
        return DATE_DOSSIER;
    }

    public void setDATE_DOSSIER(String DATE_DOSSIER) {
        this.DATE_DOSSIER = DATE_DOSSIER;
    }

    public String getNAISSANCE() {
        return NAISSANCE;
    }

    public void setNAISSANCE(String NAISSANCE) {
        this.NAISSANCE = NAISSANCE;
    }

    public String getCNU() {
        return CNU;
    }

    public void setCNU(String CNU) {
        this.CNU = CNU;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
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

    public String getVOLUME_STAT_SPECIF() {
        return VOLUME_STAT_SPECIF;
    }

    public void setVOLUME_STAT_SPECIF(String VOLUME_STAT_SPECIF) {
        this.VOLUME_STAT_SPECIF = VOLUME_STAT_SPECIF;
    }

    public String getVOLUME_COMP_SPECIFIQUE() {
        return VOLUME_COMP_SPECIFIQUE;
    }

    public void setVOLUME_COMP_SPECIFIQUE(String VOLUME_COMP_SPECIFIQUE) {
        this.VOLUME_COMP_SPECIFIQUE = VOLUME_COMP_SPECIFIQUE;
    }

    public ADRESSE getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(ADRESSE ADRESSE) {
        this.ADRESSE = ADRESSE;
    }
}
