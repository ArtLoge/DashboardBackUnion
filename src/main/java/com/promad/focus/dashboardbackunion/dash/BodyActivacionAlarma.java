package com.promad.focus.dashboardbackunion.dash;

public class BodyActivacionAlarma {

	private long convertidoAEvento;
	
	private long descartadas;
	
	private long activacionFalsa;
	
	private long sinAtender;
	
	private long total;

	public long getConvertidoAEvento() {
		return convertidoAEvento;
	}

	public void setConvertidoAEvento(long convertidoAEvento) {
		this.convertidoAEvento = convertidoAEvento;
	}

	public long getDescartadas() {
		return descartadas;
	}

	public void setDescartadas(long descartadas) {
		this.descartadas = descartadas;
	}

	public long getActivacionFalsa() {
		return activacionFalsa;
	}

	public void setActivacionFalsa(long activacionFalsa) {
		this.activacionFalsa = activacionFalsa;
	}

	public long getSinAtender() {
		return sinAtender;
	}

	public void setSinAtender(long sinAtender) {
		this.sinAtender = sinAtender;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "BodyActivacionAlarma [convertidoAEvento=" + convertidoAEvento + ", descartadas=" + descartadas
				+ ", activacionFalsa=" + activacionFalsa + ", sinAtender=" + sinAtender + ", total=" + total + "]";
	}

	public void addActivacionFalsa(long activacionFalsa) {
		this.activacionFalsa += activacionFalsa;
	}

	public void addConvertidoAEvento(long convertidoAEvento) {
		this.convertidoAEvento += convertidoAEvento;
	}

	public void addDescartadas(long descartadas) {
		this.descartadas += descartadas;
	}

	public void addSinAtender(long sinAtender) {
		this.sinAtender += sinAtender;
	}

	public void addTotal(long total) {
		this.total += total;
	}
}
