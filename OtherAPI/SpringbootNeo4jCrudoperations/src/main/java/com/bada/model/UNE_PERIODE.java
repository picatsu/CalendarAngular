package com.bada.model;


import com.bada.model.utils.UNE_PERIODE_CONGES;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NodeEntity
public class UNE_PERIODE {

    @Id
    private int id;
    private String UN_NOM_PERIODE;
    private UNE_PERIODE_CONGES[] DES_DATES_PERIODE;

    public UNE_PERIODE() {
    }

    public String getUN_NOM_PERIODE() {
        return UN_NOM_PERIODE;
    }

    public void setUN_NOM_PERIODE(String UN_NOM_PERIODE) {
        this.UN_NOM_PERIODE = UN_NOM_PERIODE;
    }

    public UNE_PERIODE_CONGES[] getDES_DATES_PERIODE() {
        return DES_DATES_PERIODE;
    }

    public void setDES_DATES_PERIODE(UNE_PERIODE_CONGES[] DES_DATES_PERIODE) {
        this.DES_DATES_PERIODE = DES_DATES_PERIODE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UNE_PERIODE(String UN_NOM_PERIODE, UNE_PERIODE_CONGES[] DES_DATES_PERIODE) {
        this.UN_NOM_PERIODE = UN_NOM_PERIODE;
        this.DES_DATES_PERIODE = DES_DATES_PERIODE;
    }
}
