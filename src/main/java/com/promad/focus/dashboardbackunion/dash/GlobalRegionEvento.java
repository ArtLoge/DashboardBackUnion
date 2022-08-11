package com.promad.focus.dashboardbackunion.dash;

public class GlobalRegionEvento {
	
	private String region;
	
	private String unidad;
	
	private Long evPendientes;
	
	private Long evCancelados;
	
	private Long evAtendidos;
	
	private Long totalEventos;
	
	private String nombreInmueble;

	public String getNombreInmueble() {
		return nombreInmueble;
	}

	public void setNombreInmueble(String nombreInmueble) {
		this.nombreInmueble = nombreInmueble;
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

	public Long getEvPendientes() {
		return evPendientes;
	}

	public void setEvPendientes(Long evPendientes) {
		this.evPendientes = evPendientes;
	}

	public Long getEvCancelados() {
		return evCancelados;
	}

	public void setEvCancelados(Long evCancelados) {
		this.evCancelados = evCancelados;
	}

	public Long getEvAtendidos() {
		return evAtendidos;
	}

	public void setEvAtendidos(Long evAtendidos) {
		this.evAtendidos = evAtendidos;
	}

	public Long getTotalEventos() {
		return totalEventos;
	}

	public void setTotalEventos(Long totalEventos) {
		this.totalEventos = totalEventos;
	}

	@Override
	public String toString() {
		return "GlobalRegionEvento [region=" + region + ", unidad=" + unidad + ", evPendientes=" + evPendientes
				+ ", evCancelados=" + evCancelados + ", evAtendidos=" + evAtendidos + ", totalEventos=" + totalEventos
				+ "]";
	}
	
}
