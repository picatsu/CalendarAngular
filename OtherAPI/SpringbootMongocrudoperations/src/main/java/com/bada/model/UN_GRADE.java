package com.bada.model;

import com.bada.model.utils.UNE_PONDERATION;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_GRADE")
public class UN_GRADE {


    private String            CODE;
    private String            DATE_MODIFICATION;
    private String            NOM;
    private String            IDENTIFIANT;
    private String            COMMENTAIRE;
    private String            HEURES_STATUTAIRES;
    private String            HEURES_COMPLEMENTAIRES;
    private UNE_PONDERATION[] LES_PONDERATIONS;

    public UN_GRADE() {
    }

    public UN_GRADE(String CODE, String DATE_MODIFICATION, String NOM, String IDENTIFIANT, String COMMENTAIRE,
                    String HEURES_STATUTAIRES, String HEURES_COMPLEMENTAIRES, UNE_PONDERATION[] LES_PONDERATIONS) {
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.IDENTIFIANT = IDENTIFIANT;
        this.COMMENTAIRE = COMMENTAIRE;
        this.HEURES_STATUTAIRES = HEURES_STATUTAIRES;
        this.HEURES_COMPLEMENTAIRES = HEURES_COMPLEMENTAIRES;
        this.LES_PONDERATIONS = LES_PONDERATIONS;
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

    public String getHEURES_STATUTAIRES() {
        return HEURES_STATUTAIRES;
    }

    public void setHEURES_STATUTAIRES(String HEURES_STATUTAIRES) {
        this.HEURES_STATUTAIRES = HEURES_STATUTAIRES;
    }

    public String getHEURES_COMPLEMENTAIRES() {
        return HEURES_COMPLEMENTAIRES;
    }

    public void setHEURES_COMPLEMENTAIRES(String HEURES_COMPLEMENTAIRES) {
        this.HEURES_COMPLEMENTAIRES = HEURES_COMPLEMENTAIRES;
    }

    public UNE_PONDERATION[] getLES_PONDERATIONS() {
        return LES_PONDERATIONS;
    }

    public void setLES_PONDERATIONS(UNE_PONDERATION[] LES_PONDERATIONS) {
        this.LES_PONDERATIONS = LES_PONDERATIONS;
    }
}
