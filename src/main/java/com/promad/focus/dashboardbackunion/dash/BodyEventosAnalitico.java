package com.promad.focus.dashboardbackunion.dash;

import java.util.List;

public class BodyEventosAnalitico {
	
	private List<BodyAnalitico> analitico;
	
	private long total;

	public List<BodyAnalitico> getAnalitico() {
		return analitico;
	}

	public void setAnalitico(List<BodyAnalitico> analitico) {
		this.analitico = analitico;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "BodyEventosAnalitico [analitico=" + analitico + ", total=" + total + "]";
	}

    public void addTotal(long total) {
		this.total += total;
    }
}
