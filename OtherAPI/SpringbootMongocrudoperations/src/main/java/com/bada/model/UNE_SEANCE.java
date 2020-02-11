package com.bada.model;


import com.bada.model.utils.UNE_RESSOURCE;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UNE_SEANCE")
public class UNE_SEANCE {


    @Id
    private int id;
    private String CODE;
    private String DATE_MODIFICATION;
    private String ENSEIGNEMENT;
    private String DATE;
    private String HEURE;
    private String DUREE;
    private String CODE_PROPRIETAIRE;
    private UNE_RESSOURCE[] LES_RESSOURCES;

    public UNE_SEANCE(String CODE, String DATE_MODIFICATION, String ENSEIGNEMENT, String DATE,
                      String HEURE, String DUREE, String CODE_PROPRIETAIRE, UNE_RESSOURCE[] LES_RESSOURCES) {
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.ENSEIGNEMENT = ENSEIGNEMENT;
        this.DATE = DATE;
        this.HEURE = HEURE;
        this.DUREE = DUREE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.LES_RESSOURCES = LES_RESSOURCES;
    }

    public UNE_SEANCE() {
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

    public String getDATE_MODIFICATION() {
        return DATE_MODIFICATION;
    }

    public void setDATE_MODIFICATION(String DATE_MODIFICATION) {
        this.DATE_MODIFICATION = DATE_MODIFICATION;
    }

    public String getENSEIGNEMENT() {
        return ENSEIGNEMENT;
    }

    public void setENSEIGNEMENT(String ENSEIGNEMENT) {
        this.ENSEIGNEMENT = ENSEIGNEMENT;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getHEURE() {
        return HEURE;
    }

    public void setHEURE(String HEURE) {
        this.HEURE = HEURE;
    }

    public String getDUREE() {
        return DUREE;
    }

    public void setDUREE(String DUREE) {
        this.DUREE = DUREE;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }

    public UNE_RESSOURCE[] getLES_RESSOURCES() {
        return LES_RESSOURCES;
    }

    public void setLES_RESSOURCES(UNE_RESSOURCE[] LES_RESSOURCES) {
        this.LES_RESSOURCES = LES_RESSOURCES;
    }
}
