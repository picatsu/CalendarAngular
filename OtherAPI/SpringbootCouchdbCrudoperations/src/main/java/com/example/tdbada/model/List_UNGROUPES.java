package com.example.tdbada.model;

import java.util.ArrayList;
import java.util.List;

public class List_UNGROUPES {

    private List<UN_GROUPES> listeGroupes;

    public List_UNGROUPES() {
        this.listeGroupes = new ArrayList<>();
    }
    public List_UNGROUPES(List<UN_GROUPES> listeGroupes) {
        this.listeGroupes = listeGroupes;
    }

    public List<UN_GROUPES> getListeGroupes() {
        return listeGroupes;
    }

    public void setListeGroupes(List<UN_GROUPES> listeGroupes) {
        this.listeGroupes = listeGroupes;
    }
}
