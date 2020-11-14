package com.newer.hospital.communal.entity;

import java.util.List;

public class Drugtype {
    private int id;
    private String title;
    private int status;
    private List<Drug> druglist;

    public List<Drug> getDruglist() {
        return druglist;
    }

    public void setDruglist(List<Drug> druglist) {
        this.druglist = druglist;
    }

    public Drugtype() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Drugtype [id=" + id + ", title=" + title + ", status=" + status + ", druglist=" + druglist + "]";
    }

}
