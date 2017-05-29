package br.com.kart.entity;

import java.util.Date;

import br.com.kart.interfaces.Circuito;

public class PilotoCorrida {
	
	private Piloto piloto;
	private Date horaInicio;
	private Date horaTermino;
	private Integer numeroVolta;
	private Date tempoVolta;	
	
	
	
	public PilotoCorrida(Piloto piloto, Date horaInicio, Date horaTermino,
			Integer numeroVolta, Date tempoVolta) {
		
		this.piloto = piloto;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.numeroVolta = numeroVolta;
		this.tempoVolta = tempoVolta;
		
	}
	
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Date horaTermino) {
		this.horaTermino = horaTermino;
	}
	public Integer getNumeroVolta() {
		return numeroVolta;
	}
	public void setNumeroVolta(Integer numeroVolta) {
		this.numeroVolta = numeroVolta;
	}
	public Date getTempoVolta() {
		return tempoVolta;
	}
	public void setTempoVolta(Date tempoVolta) {
		this.tempoVolta = tempoVolta;
	}

	@Override
	public String toString() {
		return "piloto=" + piloto  
				+ ", horaTermino=" + horaTermino 
				+ ", numeroVolta=" + numeroVolta 
				+ ", tempoVolta=" + tempoVolta + "\n";
	}	
	
	

}
