package com.bada.model;


import com.bada.model.utils.UNE_RESSOURCE;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@NodeEntity
public class UNE_RESERVATION {




    @Id
    private String id;
    private String CODE;
    private String DATE_MODIFICATION;
    private String DATE;
    private String HEURE;
    private String DUREE;
    private String COMMENTAIRE;
    private String CODE_PROPRIETAIRE;
    private UNE_RESSOURCE[] RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES;

    public UNE_RESERVATION() {
    }

    public UNE_RESERVATION(String CODE, String DATE_MODIFICATION, String DATE, String HEURE, String DUREE,
                           String COMMENTAIRE, String CODE_PROPRIETAIRE, UNE_RESSOURCE[] RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES) {
        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.DATE = DATE;
        this.HEURE = HEURE;
        this.DUREE = DUREE;
        this.COMMENTAIRE = COMMENTAIRE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES = RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES;
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

    public String getCOMMENTAIRE() {
        return COMMENTAIRE;
    }

    public void setCOMMENTAIRE(String COMMENTAIRE) {
        this.COMMENTAIRE = COMMENTAIRE;
    }

    public String getCODE_PROPRIETAIRE() {
        return CODE_PROPRIETAIRE;
    }

    public void setCODE_PROPRIETAIRE(String CODE_PROPRIETAIRE) {
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
    }

    public UNE_RESSOURCE[] getRESSOURCES_OU_ENSEIGNEMENTS_CONCERNES() {
        return RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES;
    }

    public void setRESSOURCES_OU_ENSEIGNEMENTS_CONCERNES(UNE_RESSOURCE[] RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES) {
        this.RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES = RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES;
    }

    @Override
    public String toString() {
        return "UNE_RESERVATION{" +
                "id='" + id + '\'' +
                ", CODE='" + CODE + '\'' +
                ", DATE_MODIFICATION='" + DATE_MODIFICATION + '\'' +
                ", DATE='" + DATE + '\'' +
                ", HEURE='" + HEURE + '\'' +
                ", DUREE='" + DUREE + '\'' +
                ", COMMENTAIRE='" + COMMENTAIRE + '\'' +
                ", CODE_PROPRIETAIRE='" + CODE_PROPRIETAIRE + '\'' +
                ", RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES=" + Arrays.toString(RESSOURCES_OU_ENSEIGNEMENTS_CONCERNES) +
                '}';
    }
}
