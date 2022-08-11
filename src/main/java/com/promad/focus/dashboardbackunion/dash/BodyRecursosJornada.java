package com.promad.focus.dashboardbackunion.dash;

public class BodyRecursosJornada {
	
	private String recursos;
	
	private String region;
	
	private String unidad;

	public String getRecursos() {
		return recursos;
	}

	public void setRecursos(String recursos) {
		this.recursos = recursos;
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
		return "BodyRecursosJornada [recursos=" + recursos + ", region=" + region + ", unidad=" + unidad + "]";
	}
	
}
