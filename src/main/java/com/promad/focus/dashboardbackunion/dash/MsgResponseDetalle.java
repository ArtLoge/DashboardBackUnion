package com.promad.focus.dashboardbackunion.dash;

import java.util.List;

public class MsgResponseDetalle {
	
	private String estatus;
	
	private String mensaje;

	private List<BodyRiesgosFrecuentes> riesgosFrecuentes;
	
	private List<BodyEventosPrioridad> eventoPrioridad;
	
	private List<BodyActivacionSemana> activacionSemana;
	
	private List<BodyJornadaActivacion> jornadaActivacion;
	
	private List<BodyRecursosJornada> recursosJornada;
	
	private List<GlobalRegionEventoDetalle> globalRegionEventoDetalle;

	public List<BodyRiesgosFrecuentes> getRiesgosFrecuentes() {
		return riesgosFrecuentes;
	}

	public void setRiesgosFrecuentes(List<BodyRiesgosFrecuentes> riesgosFrecuentes) {
		this.riesgosFrecuentes = riesgosFrecuentes;
	}

	public List<BodyEventosPrioridad> getEventoPrioridad() {
		return eventoPrioridad;
	}

	public void setEventoPrioridad(List<BodyEventosPrioridad> eventoPrioridad) {
		this.eventoPrioridad = eventoPrioridad;
	}

	public List<BodyActivacionSemana> getActivacionSemana() {
		return activacionSemana;
	}

	public void setActivacionSemana(List<BodyActivacionSemana> activacionSemana) {
		this.activacionSemana = activacionSemana;
	}

	public List<BodyJornadaActivacion> getJornadaActivacion() {
		return jornadaActivacion;
	}

	public void setJornadaActivacion(List<BodyJornadaActivacion> jornadaActivacion) {
		this.jornadaActivacion = jornadaActivacion;
	}

	public List<BodyRecursosJornada> getRecursosJornada() {
		return recursosJornada;
	}

	public void setRecursosJornada(List<BodyRecursosJornada> recursosJornada) {
		this.recursosJornada = recursosJornada;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<GlobalRegionEventoDetalle> getGlobalRegionEventoDetalle() {
		return globalRegionEventoDetalle;
	}

	public void setGlobalRegionEventoDetalle(List<GlobalRegionEventoDetalle> globalRegionEventoDetalle) {
		this.globalRegionEventoDetalle = globalRegionEventoDetalle;
	}

	@Override
	public String toString() {
		return "MsgResponseDetalle [estatus=" + estatus + ", mensaje=" + mensaje + ", riesgosFrecuentes="
				+ riesgosFrecuentes + ", eventoPrioridad=" + eventoPrioridad + ", activacionSemana=" + activacionSemana
				+ ", jornadaActivacion=" + jornadaActivacion + ", recursosJornada=" + recursosJornada
				+ ", globalRegionEventoDetalle=" + globalRegionEventoDetalle + "]";
	}

	
	
}
