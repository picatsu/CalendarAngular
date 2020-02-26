package com.bada.model.utils.forFront;

import java.util.ArrayList;
import java.util.List;

public class CustomSeance {

    private String date;
    private String heure;
    private String duree;
    private String nomFiliere;
    private String nomMatiere;
    private String formatedDate;

    private List<String> salle = new ArrayList<>();
    private List<String> groupe = new ArrayList<>();
    private List<String> prof = new ArrayList<>();


    public CustomSeance(String date, String heure, String duree) {
        this.date = date;
        this.heure = heure;
        this.duree = duree;
        this.formatedDate = this.formateDate();

    }

    private String formateDate(){
        char[] depart = heure.toCharArray();
        String annee;
        if(depart.length > 3 ) {
            annee = this.date + "T"+depart[0]+depart[1]+":"+depart[2]+depart[3]   ;
        }
        else{
            annee = this.date + "T0"+depart[1]+":"+depart[2]+depart[3]   ;
        }

        return annee;

    }

    public List<String> getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof.add(prof);
    }

    public List<String> getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle.add(salle);
    }

    public List<String> getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe.add(groupe);
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
}
