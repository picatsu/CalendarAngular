package com.example.tdbada.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomCouchdbSeance {
    private String _id;
    private String _rev;
    private List<CustomSeance> data = new ArrayList<>();


    public CustomCouchdbSeance(String _id, String _rev, List<CustomSeance>  data) {
        this._id = _id;
        this._rev = _rev;
        this.data = data;
    }

    public CustomCouchdbSeance() {

    }


    public void addData(CustomSeance c ) {
        this.data.add(c) ;
    }
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public List<CustomSeance>  getData() {
        return data;
    }

    public void setData(List<CustomSeance>  data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CustomCouchdbSeance{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", data=" + data +
                '}';
    }
}
