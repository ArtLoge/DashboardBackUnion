package com.promad.focus.dashboardbackunion.dash;

public class BodyActivacionSemana {
	
	private int numeroSemana;
	
	private long numeroDeAlerta;
	
	private String nombreInmueble;

	public int getNumeroSemana() {
		return numeroSemana;
	}

	public void setNumeroSemana(int numeroSemana) {
		this.numeroSemana = numeroSemana;
	}

	public long getNumeroDeAlerta() {
		return numeroDeAlerta;
	}

	public void setNumeroDeAlerta(long numeroDeAlerta) {
		this.numeroDeAlerta = numeroDeAlerta;
	}

	public String getNombreInmueble() {
		return nombreInmueble;
	}

	public void setNombreInmueble(String nombreInmueble) {
		this.nombreInmueble = nombreInmueble;
	}

	@Override
	public String toString() {
		return "BodyActivacionSemana [numeroSemana=" + numeroSemana + ", numeroDeAlerta=" + numeroDeAlerta
				+ ", nombreInmueble=" + nombreInmueble + "]";
	}

	
}
