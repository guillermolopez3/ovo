package com.gru.ovo.model;

import java.io.Serializable;

public class NoticiaModel implements Serializable
{
    private int id;
    private String nombre;
    private String descripcion;
    private String descripcion_larga;
    private String link;

    public NoticiaModel(){};
    public NoticiaModel(int id,String nombre, String descripcion,String descripcion_larga, String link) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descripcion_larga = descripcion_larga;
        this.link = link;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion_larga() {
        return descripcion_larga;
    }

    public void setDescripcion_larga(String descripcion_larga) {
        this.descripcion_larga = descripcion_larga;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
