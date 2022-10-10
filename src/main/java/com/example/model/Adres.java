package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adres")
public class Adres {

    @Column(name = "name")
    @Id
    private String name;

    @Column(name = "adres")
    private String adres;

    public String getName(){
        return name;
    }

    public String getAdres(){
        return adres;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
}
