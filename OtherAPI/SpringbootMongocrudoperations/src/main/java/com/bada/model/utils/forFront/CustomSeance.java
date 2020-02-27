package com.bada.model.utils.forFront;

import com.bada.model.utils.UNE_RESSOURCE;
import org.springframework.data.util.Pair;

import java.util.*;

public class CustomSeance {

    private String date;
    private String heure;
    private String duree;
    private String nomFiliere;
    private String nomMatiere;
    private String formatedDate;
    private String formatedDateEnd;
    private String nomprof;
    private String prenomprof;
    private String prenom2prof;
    private List<String> listeEtudiant = new LinkedList<>();

    private UNE_RESSOURCE salle = new UNE_RESSOURCE();
    private UNE_RESSOURCE groupe = new UNE_RESSOURCE();
    private UNE_RESSOURCE prof = new UNE_RESSOURCE();

    public CustomSeance(String date, String heure, String duree) {
        this.date = date;
        this.heure = heure;
        this.duree = duree;
        this.formatedDate = this.formateDate();
        this.formatedDateEnd = this.formatedendDate();
    }

    private String formatedendDate(){
        char[] datedebut = this.formatedDate.toCharArray();
        int cpt = 0;
        for(int i=0; i<datedebut.length; i++){
            if(datedebut[i] == 'T'  ){
                cpt = i;
            }
        }
        int heureAajouter  = 0;
        int minuteAajouter = 0;
        char[] dureee = this.duree.toCharArray();
        System.out.println("date debut : "+ formatedDate );

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
            System.out.println("dddd "+ duree) ;
            minuteAajouter = Integer.parseInt(
                    String.valueOf(datedebut[cpt+4])
                            +String.valueOf(datedebut[cpt+5]))
                    + Integer.parseInt(
                            String.valueOf(dureee[1])+
                                    String.valueOf(dureee[2]));
        }

        if(minuteAajouter >=60){
            minuteAajouter -= 60;
            heureAajouter += 1;
        }

        String newdate = "";
        for(int i = 0; i<cpt; i++){
            newdate+=datedebut[i];
        }
        newdate +="T"+ Integer.toString(heureAajouter)+":"+Integer.toString(minuteAajouter);

        return newdate+":00";

    }

    private String formateDate(){
        char[] depart = heure.toCharArray();
        String annee;
        if(depart.length > 3 ) {
            annee = this.date + "T"+depart[0]+depart[1]+":"+depart[2]+depart[3]+":00";
        }
        else{
            annee = this.date + "T0"+depart[0]+":"+depart[1]+depart[2]+":00";
        }

        return annee;

    }

    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }

    public String getPrenomprof() {
        return prenomprof;
    }

    public void setPrenomprof(String prenomprof) {
        this.prenomprof = prenomprof;
    }

    public String getPrenom2prof() {
        return prenom2prof;
    }

    public void setPrenom2prof(String prenom2prof) {
        this.prenom2prof = prenom2prof;
    }

    public List<String> getListeEtudiant() {
        return listeEtudiant;
    }


    public void setListeEtudiant(List<String> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }

    public UNE_RESSOURCE getProf() {
        return prof;
    }

    public void setProf(UNE_RESSOURCE prof) {
        this.prof =prof;
    }

    public UNE_RESSOURCE getSalle() {
        return salle;
    }

    public void setSalle(UNE_RESSOURCE salle) {
        this.salle = salle;
    }

    public UNE_RESSOURCE getGroupe() {
        return groupe;
    }

    public void setGroupe(UNE_RESSOURCE groupe) {
        this.groupe = groupe;
    }

    public String getFormatedDate() {
        return formatedDate;
    }

    public void setFormatedDate(String formatedDate) {
        this.formatedDate = formatedDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
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
                "date='" + date + '\'' +
                ", heure='" + heure + '\'' +
                ", duree='" + duree + '\'' +
                ", nomFiliere='" + nomFiliere + '\'' +
                ", nomMatiere='" + nomMatiere + '\'' +
                ", formatedDate='" + formatedDate + '\'' +
                ", formatedDateEnd='" + formatedDateEnd + '\'' +
                ", nomprof='" + nomprof + '\'' +
                ", prenomprof='" + prenomprof + '\'' +
                ", prenom2prof='" + prenom2prof + '\'' +
                ", listeEtudiant=" + listeEtudiant +
                ", salle=" + salle +
                ", groupe=" + groupe +
                ", prof=" + prof +
                '}';
    }
}
