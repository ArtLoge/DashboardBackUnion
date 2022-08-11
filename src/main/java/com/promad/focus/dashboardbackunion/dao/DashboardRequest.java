package com.promad.focus.dashboardbackunion.dao;

import java.time.LocalDateTime;

public class DashboardRequest {

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String idesInmueble;

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getIdesInmueble() {
        return idesInmueble;
    }

    public void setIdesInmueble(String idesInmueble) {
        this.idesInmueble = idesInmueble;
    }
}
