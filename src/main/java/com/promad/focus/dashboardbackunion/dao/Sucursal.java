package com.promad.focus.dashboardbackunion.dao;

import java.util.List;

public class Sucursal {

    private String nombre;
    private String url;
    private int id;
    private List<Inmueble> inmuebles;

    public Sucursal(String nombre, String url, int id, List<Inmueble> inmuebles) {
        this.nombre = nombre;
        this.url = url;
        this.id = id;
        this.inmuebles = inmuebles;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public void addInmueble(Inmueble inmueble) {
        this.inmuebles.add(inmueble);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
