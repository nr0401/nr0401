package com.newer.hospital.communal.entity;

import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String tel;
    private String identity;
    private List<Person> personlist;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public List<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(List<Person> personlist) {
        this.personlist = personlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", identity='" + identity + '\'' +
                ", personlist=" + personlist +
                '}';
    }
}
