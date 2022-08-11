package com.promad.focus.dashboardbackunion.dash;

public class BodyEventosPrioridad {
	
	private String tipoEvento;
	
	private long prioridadAlta;
	
	private long prioridadMedia;
	
	private long prioridadBaja;
	
	private String region;
	
	private String unidad;

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public long getPrioridadAlta() {
		return prioridadAlta;
	}

	public void setPrioridadAlta(long prioridadAlta) {
		this.prioridadAlta = prioridadAlta;
	}

	public long getPrioridadMedia() {
		return prioridadMedia;
	}

	public void setPrioridadMedia(long prioridadMedia) {
		this.prioridadMedia = prioridadMedia;
	}

	public long getPrioridadBaja() {
		return prioridadBaja;
	}

	public void setPrioridadBaja(long prioridadBaja) {
		this.prioridadBaja = prioridadBaja;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "BodyEventosPrioridad [tipoEvento=" + tipoEvento + ", prioridadAlta=" + prioridadAlta
				+ ", prioridadMedia=" + prioridadMedia + ", prioridadBaja=" + prioridadBaja + ", region=" + region
				+ ", unidad=" + unidad + "]";
	}

}
