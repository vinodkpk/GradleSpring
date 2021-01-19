package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aid;
    @Column(name="name")
    private String name;
    @Column(name="lang")
    private String lang;

    public long getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    public Alien() {

    }

    public Alien(String name, String lang) {
        this.name = name;
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + name + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}
