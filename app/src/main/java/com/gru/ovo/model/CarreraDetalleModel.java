package com.gru.ovo.model;

/**
 * Created by guill on 19/03/2018.
 */

public class CarreraDetalleModel
{
    private int id;
    private String nombre;
    private String duracion;
    private String detalle;

    public CarreraDetalleModel(int id, String nombre, String duracion, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.detalle = detalle;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
