package br.com.kart.entity;

import br.com.kart.interfaces.Circuito;


public class Melbourne implements Circuito{

	@Override
	public Double tamanhoCircuito() {
		
		return new Double(7.9);
	}

	@Override
	public Integer numeroVoltas() {
		// TODO Auto-generated method stub
		return new Integer(4);
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "MELBOURNE/AUSTRALIA";
	}

}
