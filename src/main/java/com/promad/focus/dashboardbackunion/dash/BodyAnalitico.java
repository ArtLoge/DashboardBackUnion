package com.promad.focus.dashboardbackunion.dash;

public class BodyAnalitico {

	private String nombreAnalitico;
	
	private long totalPorAnalitico;

	public String getNombreAnalitico() {
		return nombreAnalitico;
	}

	public void setNombreAnalitico(String nombreAnalitico) {
		this.nombreAnalitico = nombreAnalitico;
	}

	public long getTotalPorAnalitico() {
		return totalPorAnalitico;
	}

	public void setTotalPorAnalitico(long totalPorAnalitico) {
		this.totalPorAnalitico = totalPorAnalitico;
	}

	@Override
	public String toString() {
		return "BodyAnalitico [nombreAnalitico=" + nombreAnalitico + ", totalPorAnalitico=" + totalPorAnalitico + "]";
	}
	
}
