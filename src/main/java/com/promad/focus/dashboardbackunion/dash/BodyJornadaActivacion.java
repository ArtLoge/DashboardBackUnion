package com.promad.focus.dashboardbackunion.dash;

public class BodyJornadaActivacion {
	
	private int jornada;
	
	private long alarmaDisparada;

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public long getAlarmaDisparada() {
		return alarmaDisparada;
	}

	public void setAlarmaDisparada(long alarmaDisparada) {
		this.alarmaDisparada = alarmaDisparada;
	}

	public void addAlarmaDisparada(long alarmaDisparada) {
		this.alarmaDisparada += alarmaDisparada;
	}

	@Override
	public String toString() {
		return "BodyJornadaActivacion [jornada=" + jornada + ", alarmaDisparada=" + alarmaDisparada + "]";
	}
	
}
