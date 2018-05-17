package com.gru.ovo.model;

public class CarreraModel
{
    private int id;
    private String nombre;
    private String abreviaturamenu;

    public CarreraModel(){}

    public CarreraModel(int id, String nombre, String abreviaturamenu) {
        this.id = id;
        this.nombre = nombre;
        this.abreviaturamenu = abreviaturamenu;
    }

    public CarreraModel(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviaturamenu() {
        return abreviaturamenu;
    }

    public void setAbreviaturamenu(String abreviaturamenu) {
        this.abreviaturamenu = abreviaturamenu;
    }
}
