package br.com.kart.entity;

import java.util.List;

import br.com.kart.interfaces.Circuito;

/**
 * Classe que representa uma corrida.
 * Ex. Interlagos, Melbourne,
 * @author Daniel
 *
 */
public class Corrida {

	private Integer codigoCorrida;
	private Circuito circuito;
	private List<PilotoCorrida> resultados;
	
	
	
	public Integer getCodigoCorrida() {
		return codigoCorrida;
	}
	public void setCodigoCorrida(Integer codigoCorrida) {
		this.codigoCorrida = codigoCorrida;
	}

	public Circuito getCircuito() {
		return circuito;
	}
	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}
	
	public List<PilotoCorrida> getResultados() {
		return resultados;
	}
	public void setResultados(List<PilotoCorrida> resultados) {
		this.resultados = resultados;
	}
	@Override
	public String toString() {
		return "Corrida [codigoCorrida=" + codigoCorrida + ", circuito="
				+ circuito + "]";
	}
	
}
