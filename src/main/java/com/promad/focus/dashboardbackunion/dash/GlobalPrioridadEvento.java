package com.promad.focus.dashboardbackunion.dash;

public class GlobalPrioridadEvento {
	
	private String tipoEvento;
	
	private Long prioridadAlta;
	
	private Long prioridadMedia;
	
	private Long prioridadBaja;
	
	private Long totalEvento;
	
	private String region;
	
	private String unidad;

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Long getPrioridadAlta() {
		return prioridadAlta;
	}

	public void setPrioridadAlta(Long prioridadAlta) {
		this.prioridadAlta = prioridadAlta;
	}

	public Long getPrioridadMedia() {
		return prioridadMedia;
	}

	public void setPrioridadMedia(Long prioridadMedia) {
		this.prioridadMedia = prioridadMedia;
	}

	public Long getPrioridadBaja() {
		return prioridadBaja;
	}

	public void setPrioridadBaja(Long prioridadBaja) {
		this.prioridadBaja = prioridadBaja;
	}

	public Long getTotalEvento() {
		return totalEvento;
	}

	public void setTotalEvento(Long totalEvento) {
		this.totalEvento = totalEvento;
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
		return "GlobalPrioridadEvento [tipoEvento=" + tipoEvento + ", prioirdadAlta=" + prioridadAlta
				+ ", prioridadMedia=" + prioridadMedia + ", prioridadBaja=" + prioridadBaja + ", totalEvento="
				+ totalEvento + ", region=" + region + ", unidad=" + unidad + "]";
	}

}
