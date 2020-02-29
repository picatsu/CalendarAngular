package com.bada.model;

import com.bada.model.utils.LES_CONGES;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NodeEntity
public class LES_PARAMETRES_GENERAUX {
    @Id
    private int id;
    private String NOM;
    private String HEURE_DEBUT;
    private String HEURE_FIN;
    private String GRAIN_TEMPOREL;
    private String DATE_DEBUT;
    private String DATE_FIN;
    private String MATIERES_V2;
    private LES_CONGES CALENDRIER;

    public LES_PARAMETRES_GENERAUX() {
    }

    public LES_PARAMETRES_GENERAUX(String NOM, String HEURE_DEBUT, String HEURE_FIN, String GRAIN_TEMPOREL,
                                   String DATE_DEBUT, String DATE_FIN, String MATIERES_V2, LES_CONGES CALENDRIER) {
        this.NOM = NOM;
        this.HEURE_DEBUT = HEURE_DEBUT;
        this.HEURE_FIN = HEURE_FIN;
        this.GRAIN_TEMPOREL = GRAIN_TEMPOREL;
        this.DATE_DEBUT = DATE_DEBUT;
        this.DATE_FIN = DATE_FIN;
        this.MATIERES_V2 = MATIERES_V2;
        this.CALENDRIER = CALENDRIER;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getHEURE_DEBUT() {
        return HEURE_DEBUT;
    }

    public void setHEURE_DEBUT(String HEURE_DEBUT) {
        this.HEURE_DEBUT = HEURE_DEBUT;
    }

    public String getHEURE_FIN() {
        return HEURE_FIN;
    }

    public void setHEURE_FIN(String HEURE_FIN) {
        this.HEURE_FIN = HEURE_FIN;
    }

    public String getGRAIN_TEMPOREL() {
        return GRAIN_TEMPOREL;
    }

    public void setGRAIN_TEMPOREL(String GRAIN_TEMPOREL) {
        this.GRAIN_TEMPOREL = GRAIN_TEMPOREL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMATIERES_V2() {
        return MATIERES_V2;
    }

    public void setMATIERES_V2(String MATIERES_V2) {
        this.MATIERES_V2 = MATIERES_V2;
    }

    public LES_CONGES getCALENDRIER() {
        return CALENDRIER;
    }

    public void setCALENDRIER(LES_CONGES CALENDRIER) {
        this.CALENDRIER = CALENDRIER;
    }
}
