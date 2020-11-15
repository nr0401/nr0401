package com.newer.hospital.communal.entity;


public class Directory {
    private int id;
    private String title;

    public Directory() {
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

    @Override
    public String toString() {
        return "Directory{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
