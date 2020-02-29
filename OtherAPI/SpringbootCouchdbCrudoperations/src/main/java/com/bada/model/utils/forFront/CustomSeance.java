package com.bada.model.utils.forFront;

import com.bada.model.UNE_SALLE;
import com.bada.model.UN_GROUPES;
import com.bada.model.UN_PROFESSEUR;
import com.bada.model.utils.UNE_RESSOURCE;

import java.util.*;

public class CustomSeance {


    private String nomFiliere;
    private String nomMatiere;
    private String formatedDate;
    private String formatedDateEnd;
    private String nomProf;
    private String prenomProf;
    private String prenomProf2;
    private String nomSalle;
    private String[] listEtudiants;
    private String idSalle;
    private String idGroupe;
    private String idProf;
    private String idEnseignement;



    public CustomSeance(String date, String heure, String duree) {

        this.formatedDate = this.formateDate( date,  heure,  duree);
        this.formatedDateEnd = this.formatedendDate( date,  heure,  duree);
    }
    public CustomSeance() {

    }

    private String formatedendDate(String date, String heure, String duree){
        char[] datedebut = this.formatedDate.toCharArray();
        int cpt = 0;
        for(int i=0; i<datedebut.length; i++){
            if(datedebut[i] == 'T'  ){
                cpt = i;
            }
        }
        int heureAajouter  = 0;
        int minuteAajouter = 0;
        char[] dureee = duree.toCharArray();

        if(dureee.length > 3) {
           heureAajouter =
                   Integer.parseInt(String.valueOf(datedebut[cpt+1])+String.valueOf(datedebut[cpt+2]))
                           + Integer.parseInt(String.valueOf(dureee[0])+String.valueOf(dureee[1]));
           minuteAajouter =
                   Integer.parseInt(String.valueOf(datedebut[cpt+4])+String.valueOf(datedebut[cpt+5]))
                           + Integer.parseInt(String.valueOf(dureee[2])+String.valueOf(dureee[3]));

        }
        else{
            heureAajouter = Integer.parseInt(String.valueOf(datedebut[cpt+1])+String.valueOf(datedebut[cpt+2]))
                    + Integer.parseInt("0"+String.valueOf(dureee[0]));
            minuteAajouter = Integer.parseInt(
                    String.valueOf(datedebut[cpt+4])
                            +String.valueOf(datedebut[cpt+5]))
                    + Integer.parseInt(
                            String.valueOf(dureee[1])+
                                    String.valueOf(dureee[2]));
        }
        String formatedheureaAjouter = "";
        String formatedminuteaAjouter = "";

        if(minuteAajouter >=60){
            minuteAajouter -= 60;
            heureAajouter += 1;
        }


        if(heureAajouter < 10 ){
            formatedheureaAjouter = "0"+ Integer.toString(heureAajouter);
        } if(heureAajouter >= 10 ){
            formatedheureaAjouter = Integer.toString(heureAajouter);
        }

        if(minuteAajouter < 10 ){
            formatedminuteaAjouter = "0"+ Integer.toString(minuteAajouter);
        }if(minuteAajouter >= 10){
            formatedminuteaAjouter = Integer.toString(minuteAajouter);
        }

        System.out.println("date arrive : "+ formatedheureaAjouter + " minutes " +formatedminuteaAjouter );



        String newdate = "";
        for(int i = 0; i<cpt; i++){
            newdate+=datedebut[i];
        }
        newdate +="T"+ formatedheureaAjouter +":"+formatedminuteaAjouter;

        return newdate+":00";

    }

    private String formateDate(String date, String heure, String duree){
        char[] depart = heure.toCharArray();
        String annee;
        // "2013-9-9T08:30:00"  =>   "2013-09-09T08:30:00"

        String[] newdate = date.split("-");
        String anneNumber = newdate[0];
        String moisNumber = newdate[1];
        String jourNumber = newdate[2];


        if(Integer.parseInt(moisNumber) < 10 ){
            moisNumber = "0"+moisNumber;
        }
        if(Integer.parseInt(jourNumber) < 10 ){
            jourNumber = "0"+jourNumber;
        }
        date = anneNumber+"-"+moisNumber+"-"+jourNumber;

        if(depart.length > 3 ) {
            annee = date + "T"+depart[0]+depart[1]+":"+depart[2]+depart[3]+":00";
        }
        else{
            annee = date + "T0"+depart[0]+":"+depart[1]+depart[2]+":00";
        }

        return annee;

    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getPrenomProf2() {
        return prenomProf2;
    }

    public void setPrenomProf2(String prenomProf2) {
        this.prenomProf2 = prenomProf2;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public String[] getListEtudiants() {
        return listEtudiants;
    }

    public void setListEtudiants(String[] listEtudiants) {
        this.listEtudiants = listEtudiants;
    }

    public String getIdEnseignement() {
        return idEnseignement;
    }

    public void setIdEnseignement(String idEnseignement) {
        this.idEnseignement = idEnseignement;
    }



    public String getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(String idSalle) {
        this.idSalle = idSalle;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIdProf() {
        return idProf;
    }

    public void setIdProf(String idProf) {
        this.idProf = idProf;
    }


    public String getFormatedDate() {
        return formatedDate;
    }

    public void setFormatedDate(String formatedDate) {
        this.formatedDate = formatedDate;
    }


    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public String getFormatedDateEnd() {
        return formatedDateEnd;
    }

    public void setFormatedDateEnd(String formatedDateEnd) {
        this.formatedDateEnd = formatedDateEnd;
    }

    @Override
    public String toString() {
        return "CustomSeance{" +
                "nomFiliere='" + nomFiliere + '\'' +
                ", nomMatiere='" + nomMatiere + '\'' +
                ", formatedDate='" + formatedDate + '\'' +
                ", formatedDateEnd='" + formatedDateEnd + '\'' +

                ", idSalle='" + idSalle + '\'' +
                ", idGroupe='" + idGroupe + '\'' +
                ", idProf='" + idProf + '\'' +

                '}';
    }
}
