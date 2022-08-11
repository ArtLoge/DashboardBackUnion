package com.promad.focus.dashboardbackunion.dash;

public class BodyRiesgosFrecuentes {
	
	private String nombreRiesgo;
	
	private long pendientes;
	
	private long cancelados;
	
	private long atendidos;
	
	private long total;

	public String getNombreRiesgo() {
		return nombreRiesgo;
	}

	public void setNombreRiesgo(String nombreRiesgo) {
		this.nombreRiesgo = nombreRiesgo;
	}

	public long getPendientes() {
		return pendientes;
	}

	public void setPendientes(long pendientes) {
		this.pendientes = pendientes;
	}

	public long getCancelados() {
		return cancelados;
	}

	public void setCancelados(long cancelados) {
		this.cancelados = cancelados;
	}

	public long getAtendidos() {
		return atendidos;
	}

	public void setAtendidos(long atendidos) {
		this.atendidos = atendidos;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "BodyRiesgosFrecuentes [nombreRiesgo=" + nombreRiesgo + ", pendientes=" + pendientes + ", cancelados="
				+ cancelados + ", atendidos=" + atendidos + ", total=" + total + "]";
	}
	
}
