package com.bada.model;


import com.bada.model.utils.UNE_RESSOURCE;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_ENSEIGNEMENT")
public class UN_ENSEIGNEMENT {



    private String                 CODE;
    private String                 DATE_MODIFICATION;
    private String                 NOM;
    private String                 ALIAS;
    private String                 TYPE_ACTIVITE;
    private String                 COMPOSANTE;
    private String                 NIVEAU;
    private String                 COMMENTAIRE;
    private String                 IDENTIFIANT;
    private String                 CODE_PROPRIETAIRE;
    private String                 COULEUR;
    private String                 COULEUR_POLICE;
    private String                 CODE_MATIERE;
    private String                 DUREE_TOTALE;
    private String                 DUREE_CHAQUE_SEANCE;
    private String                 VOLUME_REPARTI;
    private String                 FORFAITAIRE;
    private String                 ARTICLE6;
    private String                 VOLUME_FORFAITAIRE;
    private String                 DATE_DEBUT;
    private String                 DATE_FIN;
    private String                 TYPE_PUBLIC;
    private String                 NB_SEANCES_HEBDO;
    private String                 CODE_TYPE_SALLE;
    private String                 CODE_ZONE_SALLE;
    private UNE_RESSOURCE[]        LES_RESSOURCES;

    public UN_ENSEIGNEMENT(String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String TYPE_ACTIVITE,
                           String COMPOSANTE, String NIVEAU, String COMMENTAIRE, String IDENTIFIANT,
                           String CODE_PROPRIETAIRE, String COULEUR, String COULEUR_POLICE, String CODE_MATIERE,
                           String DUREE_TOTALE, String DUREE_CHAQUE_SEANCE, String VOLUME_REPARTI, String FORFAITAIRE,
                           String ARTICLE6, String VOLUME_FORFAITAIRE, String DATE_DEBUT, String DATE_FIN, String TYPE_PUBLIC,
                           String NB_SEANCES_HEBDO,
                           String CODE_TYPE_SALLE, String CODE_ZONE_SALLE, UNE_RESSOURCE[] LES_RESSOURCES) {
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.TYPE_ACTIVITE = TYPE_ACTIVITE;
        this.COMPOSANTE = COMPOSANTE;
        this.NIVEAU = NIVEAU;
        this.COMMENTAIRE = COMMENTAIRE;
        this.IDENTIFIANT = IDENTIFIANT;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_MATIERE = CODE_MATIERE;
        this.DUREE_TOTALE = DUREE_TOTALE;
        this.DUREE_CHAQUE_SEANCE = DUREE_CHAQUE_SEANCE;
        this.VOLUME_REPARTI = VOLUME_REPARTI;
        this.FORFAITAIRE = FORFAITAIRE;
        this.ARTICLE6 = ARTICLE6;
        this.VOLUME_FORFAITAIRE = VOLUME_FORFAITAIRE;
        this.DATE_DEBUT = DATE_DEBUT;
        this.DATE_FIN = DATE_FIN;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
        this.NB_SEANCES_HEBDO = NB_SEANCES_HEBDO;
        this.CODE_TYPE_SALLE = CODE_TYPE_SALLE;
        this.CODE_ZONE_SALLE = CODE_ZONE_SALLE;
        this.LES_RESSOURCES = LES_RESSOURCES;
    }

    public UN_ENSEIGNEMENT() {
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

    public String getTYPE_ACTIVITE() {
        return TYPE_ACTIVITE;
    }

    public void setTYPE_ACTIVITE(String TYPE_ACTIVITE) {
        this.TYPE_ACTIVITE = TYPE_ACTIVITE;
    }

    public String getCOMPOSANTE() {
        return COMPOSANTE;
    }

    public void setCOMPOSANTE(String COMPOSANTE) {
        this.COMPOSANTE = COMPOSANTE;
    }

    public String getNIVEAU() {
        return NIVEAU;
    }

    public void setNIVEAU(String NIVEAU) {
        this.NIVEAU = NIVEAU;
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

    public String getCODE_MATIERE() {
        return CODE_MATIERE;
    }

    public void setCODE_MATIERE(String CODE_MATIERE) {
        this.CODE_MATIERE = CODE_MATIERE;
    }

    public String getDUREE_TOTALE() {
        return DUREE_TOTALE;
    }

    public void setDUREE_TOTALE(String DUREE_TOTALE) {
        this.DUREE_TOTALE = DUREE_TOTALE;
    }

    public String getDUREE_CHAQUE_SEANCE() {
        return DUREE_CHAQUE_SEANCE;
    }

    public void setDUREE_CHAQUE_SEANCE(String DUREE_CHAQUE_SEANCE) {
        this.DUREE_CHAQUE_SEANCE = DUREE_CHAQUE_SEANCE;
    }

    public String getVOLUME_REPARTI() {
        return VOLUME_REPARTI;
    }

    public void setVOLUME_REPARTI(String VOLUME_REPARTI) {
        this.VOLUME_REPARTI = VOLUME_REPARTI;
    }

    public String getFORFAITAIRE() {
        return FORFAITAIRE;
    }

    public void setFORFAITAIRE(String FORFAITAIRE) {
        this.FORFAITAIRE = FORFAITAIRE;
    }

    public String getARTICLE6() {
        return ARTICLE6;
    }

    public void setARTICLE6(String ARTICLE6) {
        this.ARTICLE6 = ARTICLE6;
    }

    public String getVOLUME_FORFAITAIRE() {
        return VOLUME_FORFAITAIRE;
    }

    public void setVOLUME_FORFAITAIRE(String VOLUME_FORFAITAIRE) {
        this.VOLUME_FORFAITAIRE = VOLUME_FORFAITAIRE;
    }

    public String getDATE_DEBUT() {
        return DATE_DEBUT;
    }

    public void setDATE_DEBUT(String DATE_DEBUT) {
        this.DATE_DEBUT = DATE_DEBUT;
    }

    public String getDATE_FIN() {
        return DATE_FIN;
    }

    public void setDATE_FIN(String DATE_FIN) {
        this.DATE_FIN = DATE_FIN;
    }

    public String getTYPE_PUBLIC() {
        return TYPE_PUBLIC;
    }

    public void setTYPE_PUBLIC(String TYPE_PUBLIC) {
        this.TYPE_PUBLIC = TYPE_PUBLIC;
    }

    public String getNB_SEANCES_HEBDO() {
        return NB_SEANCES_HEBDO;
    }

    public void setNB_SEANCES_HEBDO(String NB_SEANCES_HEBDO) {
        this.NB_SEANCES_HEBDO = NB_SEANCES_HEBDO;
    }

    public String getCODE_TYPE_SALLE() {
        return CODE_TYPE_SALLE;
    }

    public void setCODE_TYPE_SALLE(String CODE_TYPE_SALLE) {
        this.CODE_TYPE_SALLE = CODE_TYPE_SALLE;
    }

    public String getCODE_ZONE_SALLE() {
        return CODE_ZONE_SALLE;
    }

    public void setCODE_ZONE_SALLE(String CODE_ZONE_SALLE) {
        this.CODE_ZONE_SALLE = CODE_ZONE_SALLE;
    }

    public UNE_RESSOURCE[] getLES_RESSOURCES() {
        return LES_RESSOURCES;
    }

    public void setLES_RESSOURCES(UNE_RESSOURCE[] LES_RESSOURCES) {
        this.LES_RESSOURCES = LES_RESSOURCES;
    }
}
