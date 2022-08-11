package com.promad.focus.dashboardbackunion.dash;

import java.util.List;

public class MsgResponse {
	
	private String estatus;
	
	private String mensaje;
	
	private List<GlobalRegionEvento> globalRegionEvento;
	
	private List<GlobalPrioridadEvento> globalPrioridadEvento;
	
	private GlobalPrioridadEventoDetalle globalDetalle;
	
	private Long totalEventosNacional;
	
	private List<BodyEventoAnioMes> eventoAnioMes;
	
	private BodyActivacionAlarma activacionAlarma;
	
	private BodyEventosAnalitico eventosAnalitico;
	
	private MsgResponseDetalle detalle;

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

	public List<GlobalRegionEvento> getGlobalRegionEvento() {
		return globalRegionEvento;
	}

	public void setGlobalRegionEvento(List<GlobalRegionEvento> globalRegionEvento) {
		this.globalRegionEvento = globalRegionEvento;
	}

	public void addGlobalRegionEvento(GlobalRegionEvento globalRegionEvento) {
		this.globalRegionEvento.add(globalRegionEvento);
	}

	public List<GlobalPrioridadEvento> getGlobalPrioridadEvento() {
		return globalPrioridadEvento;
	}

	public void setGlobalPrioridadEvento(List<GlobalPrioridadEvento> globalPrioridadEvento) {
		this.globalPrioridadEvento = globalPrioridadEvento;
	}

	public void addGlobalPrioridadEvento(GlobalPrioridadEvento globalPrioridadEvento) {
		this.globalPrioridadEvento.add(globalPrioridadEvento);
	}

	public GlobalPrioridadEventoDetalle getGlobalDetalle() {
		return globalDetalle;
	}

	public void setGlobalDetalle(GlobalPrioridadEventoDetalle globalDetalle) {
		this.globalDetalle = globalDetalle;
	}

	public Long getTotalEventosNacional() {
		return totalEventosNacional;
	}

	public void setTotalEventosNacional(Long totalEventosNacional) {
		this.totalEventosNacional = totalEventosNacional;
	}

	public List<BodyEventoAnioMes> getEventoAnioMes() {
		return eventoAnioMes;
	}

	public void setEventoAnioMes(List<BodyEventoAnioMes> eventoAnioMes) {
		this.eventoAnioMes = eventoAnioMes;
	}

	public BodyActivacionAlarma getActivacionAlarma() {
		return activacionAlarma;
	}

	public void setActivacionAlarma(BodyActivacionAlarma activacionAlarma) {
		this.activacionAlarma = activacionAlarma;
	}

	public BodyEventosAnalitico getEventosAnalitico() {
		return eventosAnalitico;
	}

	public void setEventosAnalitico(BodyEventosAnalitico eventosAnalitico) {
		this.eventosAnalitico = eventosAnalitico;
	}
	
	public MsgResponseDetalle getDetalle() {
		return detalle;
	}

	public void setDetalle(MsgResponseDetalle detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "MsgResponse [estatus=" + estatus + ", mensaje=" + mensaje + ", globalRegionEvento=" + globalRegionEvento
				+ ", globalPrioridadEvento=" + globalPrioridadEvento + ", globalDetalle=" + globalDetalle
				+ ", totalEventosNacional=" + totalEventosNacional + ", eventoAnioMes=" + eventoAnioMes
				+ ", activacionAlarma=" + activacionAlarma + ", eventosAnalitico=" + eventosAnalitico + ", detalle="
				+ detalle + "]";
	}

	public void addTotalEventosNacional(Long totalEventosNacional) {
		if (this.totalEventosNacional == null) this.totalEventosNacional = totalEventosNacional;
		else this.totalEventosNacional += totalEventosNacional;
	}

	public void addEventoAnioMes(BodyEventoAnioMes bodyEventoAnioMes) {
		if (this.eventoAnioMes.size() == 0) {
			this.eventoAnioMes.add(bodyEventoAnioMes);
		} else {
			for (BodyEventoAnioMes evento : this.eventoAnioMes) {
				if (evento.getYear() == bodyEventoAnioMes.getYear()) {
					evento.setEne(evento.getEne() + bodyEventoAnioMes.getEne());
					evento.setFeb(evento.getFeb() + bodyEventoAnioMes.getFeb());
					evento.setMar(evento.getMar() + bodyEventoAnioMes.getMar());
					evento.setAbr(evento.getAbr() + bodyEventoAnioMes.getAbr());
					evento.setMay(evento.getMay() + bodyEventoAnioMes.getMay());
					evento.setJun(evento.getJun() + bodyEventoAnioMes.getJun());
					evento.setJul(evento.getJul() + bodyEventoAnioMes.getJul());
					evento.setAgs(evento.getAgs() + bodyEventoAnioMes.getAgs());
					evento.setSep(evento.getSep() + bodyEventoAnioMes.getSep());
					evento.setOct(evento.getOct() + bodyEventoAnioMes.getOct());
					evento.setNov(evento.getNov() + bodyEventoAnioMes.getNov());
					evento.setDic(evento.getDic() + bodyEventoAnioMes.getDic());
				} else {
					this.eventoAnioMes.add(bodyEventoAnioMes);
				}
			}
		}
	}
}
