package com.newer.hospital.communal.entity;

import java.util.List;

public class Dept {
    private int id;
    private String title;
    private String info;
    private int directory_id;


    public Dept() {
        super();
        // TODO Auto-generated constructor stub
    }


    public int getDirectory_id() {
        return directory_id;
    }


    public void setDirectory_id(int directory_id) {
        this.directory_id = directory_id;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Dept [id=" + id + ", title=" + title + ", info=" + info + ",  ]";
    }

}
