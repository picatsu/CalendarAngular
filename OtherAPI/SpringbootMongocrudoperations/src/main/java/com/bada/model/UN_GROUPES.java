package com.bada.model;

import com.bada.model.utils.LES_CONGES;
import com.bada.model.utils.UN_CODE_ETUDIANT;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UN_GROUPES")
public class UN_GROUPES {


    @Id
    private String          id;
    private String          CODE;
    private String          DATE_MODIFICATION;
    private String          NOM;
    private String          ALIAS;
    private String          COMMENTAIRE;
    private String          COMPOSANTE;
    private String          NIVEAU;
    private String          DIPLOME;
    private String          IDENTIFIANT;
    private String          TYPE_PUBLIC;
    private String          QUANTITE_MAX;
    private String          COULEUR;
    private String          COULEUR_POLICE;
    private String          CODE_PROPRIETAIRE;
    private String          UN_CODE_SUPER_GROUPE;
    private UN_CODE_ETUDIANT  LES_ETUDIANTS_DU_GROUPE;
    private LES_CONGES[]    LES_CONGES;
    private LES_CONGES[]    LES_EXAMENS;


    public UN_GROUPES() {
    }

    public UN_GROUPES(String id, String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String COMMENTAIRE,
                      String COMPOSANTE, String NIVEAU, String DIPLOME, String IDENTIFIANT, String TYPE_PUBLIC,
                      String QUANTITE_MAX, String COULEUR, String COULEUR_POLICE, String CODE_PROPRIETAIRE,
                      String UN_CODE_SUPER_GROUPE, UN_CODE_ETUDIANT LES_ETUDIANTS_DU_GROUPE,
                      com.bada.model.utils.LES_CONGES[] LES_CONGES) {
        this.id = id;
        this.CODE = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.NIVEAU = NIVEAU;
        this.DIPLOME = DIPLOME;
        this.IDENTIFIANT = IDENTIFIANT;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
        this.QUANTITE_MAX = QUANTITE_MAX;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.UN_CODE_SUPER_GROUPE = UN_CODE_SUPER_GROUPE;
        this.LES_ETUDIANTS_DU_GROUPE = LES_ETUDIANTS_DU_GROUPE;
        this.LES_CONGES = LES_CONGES;
    }

    public UN_GROUPES(String CODE, String DATE_MODIFICATION, String NOM, String ALIAS, String COMMENTAIRE,
                      String COMPOSANTE, String NIVEAU, String DIPLOME, String IDENTIFIANT, String TYPE_PUBLIC,
                      String QUANTITE_MAX, String COULEUR, String COULEUR_POLICE, String CODE_PROPRIETAIRE,
                      UN_CODE_ETUDIANT LES_ETUDIANTS_DU_GROUPE, String UN_CODE_SUPER_GROUPE, LES_CONGES[] LES_CONGES,
                      LES_CONGES[]    LES_EXAMENS) {
        this.CODE = CODE;
        this.id = CODE;
        this.DATE_MODIFICATION = DATE_MODIFICATION;
        this.NOM = NOM;
        this.ALIAS = ALIAS;
        this.COMMENTAIRE = COMMENTAIRE;
        this.COMPOSANTE = COMPOSANTE;
        this.NIVEAU = NIVEAU;
        this.DIPLOME = DIPLOME;
        this.IDENTIFIANT = IDENTIFIANT;
        this.TYPE_PUBLIC = TYPE_PUBLIC;
        this.QUANTITE_MAX = QUANTITE_MAX;
        this.COULEUR = COULEUR;
        this.COULEUR_POLICE = COULEUR_POLICE;
        this.CODE_PROPRIETAIRE = CODE_PROPRIETAIRE;
        this.LES_ETUDIANTS_DU_GROUPE = LES_ETUDIANTS_DU_GROUPE;
        this.UN_CODE_SUPER_GROUPE = UN_CODE_SUPER_GROUPE;
        this.LES_CONGES = LES_CONGES;
        this.LES_EXAMENS = LES_EXAMENS;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUN_CODE_SUPER_GROUPE() {
        return UN_CODE_SUPER_GROUPE;
    }

    public com.bada.model.utils.LES_CONGES[] getLES_CONGES() {
        return LES_CONGES;
    }

    public void setLES_CONGES(com.bada.model.utils.LES_CONGES[] LES_CONGES) {
        this.LES_CONGES = LES_CONGES;
    }

    public void setUN_CODE_SUPER_GROUPE(String UN_CODE_SUPER_GROUPE) {
        this.UN_CODE_SUPER_GROUPE = UN_CODE_SUPER_GROUPE;
    }

    public com.bada.model.utils.LES_CONGES[] getLES_EXAMENS() {
        return LES_EXAMENS;
    }

    public void setLES_EXAMENS(com.bada.model.utils.LES_CONGES[] LES_EXAMENS) {
        this.LES_EXAMENS = LES_EXAMENS;
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

    public String getDIPLOME() {
        return DIPLOME;
    }

    public void setDIPLOME(String DIPLOME) {
        this.DIPLOME = DIPLOME;
    }

    public String getIDENTIFIANT() {
        return IDENTIFIANT;
    }

    public void setIDENTIFIANT(String IDENTIFIANT) {
        this.IDENTIFIANT = IDENTIFIANT;
    }

    public String getTYPE_PUBLIC() {
        return TYPE_PUBLIC;
    }

    public void setTYPE_PUBLIC(String TYPE_PUBLIC) {
        this.TYPE_PUBLIC = TYPE_PUBLIC;
    }

    public String getQUANTITE_MAX() {
        return QUANTITE_MAX;
    }

    public void setQUANTITE_MAX(String QUANTITE_MAX) {
        this.QUANTITE_MAX = QUANTITE_MAX;
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

    public UN_CODE_ETUDIANT getLES_ETUDIANTS_DU_GROUPE() {
        return LES_ETUDIANTS_DU_GROUPE;
    }

    public void setLES_ETUDIANTS_DU_GROUPE(UN_CODE_ETUDIANT LES_ETUDIANTS_DU_GROUPE) {
        this.LES_ETUDIANTS_DU_GROUPE = LES_ETUDIANTS_DU_GROUPE;
    }
}
