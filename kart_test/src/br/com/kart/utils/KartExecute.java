package br.com.kart.utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.kart.bussiness.CorridaBussiness;
import br.com.kart.entity.Corrida;
import br.com.kart.entity.Interlagos;
import br.com.kart.entity.Piloto;
import br.com.kart.entity.PilotoCorrida;
import br.com.kart.interfaces.Circuito;

public class KartExecute {

	public static void main(String[] args) throws ParseException {
		KartUtils kartUtils = new KartUtils();
		KartExecute t = new KartExecute();
		Corrida corrida = new Corrida();		
		Circuito interlagos = new Interlagos();
		
		corrida.setCircuito(interlagos);
		corrida.setResultados(kartUtils.getResultados());	
		
		CorridaBussiness cb = new CorridaBussiness();
		cb.rankingCorrida(corrida);
		
	}
	

}
