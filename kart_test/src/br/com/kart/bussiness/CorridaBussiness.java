package br.com.kart.bussiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.kart.entity.Corrida;
import br.com.kart.entity.PilotoCorrida;
import br.com.kart.utils.PilotoConverter;
import br.com.kart.utils.PilotoCorridaComparator;


/**
 * Classe que representa as regras de negocio de uma corrida
 * @author Daniel
 *
 */
public class CorridaBussiness {
	
	
	List<PilotoCorrida> rankingVencedores = new ArrayList<PilotoCorrida>();
	List<PilotoCorrida> abandonoList = new ArrayList<PilotoCorrida>();
	
	/**
	 * Faz o ranking dos vencedores de acordo com o numero de voltas do circuito e 
	 * o menor tempo de conclusao da prova
	 * @param corrida
	 */
	public void rankingCorrida(Corrida corrida){		
		
		for(PilotoCorrida pc : corrida.getResultados()){
			if(pc.getNumeroVolta().equals(corrida.getCircuito().numeroVoltas())){
				rankingVencedores.add(pc);
			}
		}
		
		Collections.sort(rankingVencedores, new PilotoCorridaComparator());	
		mostrarRanking(corrida);
		mostrarAbandonoCorrida(corrida);	
		
	}
	
	/**
	 * Mostra os pilotos que nao completaram a prova
	 * @param corrida
	 */
	public void mostrarAbandonoCorrida(Corrida corrida){
		List<PilotoCorrida> listaAbandono = new ArrayList<PilotoCorrida>();
		List<PilotoCorrida> listaPilotoCorridaTemp = new ArrayList<PilotoCorrida>();	
		listaAbandono = corrida.getResultados();		
		
		for(int i=0; i< rankingVencedores.size(); i++){
			
			for(PilotoCorrida pc : listaAbandono){
				if(rankingVencedores.get(i).getPiloto().getCodigo().equals(pc.getPiloto().getCodigo())){
					listaPilotoCorridaTemp.add(pc);
				}
			}
		}
		
		System.out.println("\n============ NAO FINALIZARAM A CORRIDA ============\n");
			listaAbandono.removeAll(listaPilotoCorridaTemp);			
			Collections.reverse(listaAbandono);			
			for(PilotoCorrida pc : listaAbandono){			
				System.out.println("PILOTO: " + pc.getPiloto().getNome() +						
							" NUM. VOLTA: " + pc.getNumeroVolta());					
				
			}
			
			
		
		
			
		
	}
	
	/**
	 * Formata os dados para exibição no console.
	 * @param corrida
	 */
	public void mostrarRanking(Corrida corrida){
		System.out.println("============" + corrida.getCircuito().getNome() + "============\n");
		System.out.println("NUM. VOLTAS: " + corrida.getCircuito().numeroVoltas());
		System.out.println("TAMANHO CIRCUITO: " + corrida.getCircuito().tamanhoCircuito() + " KM");
		
		System.out.println("\n============ RANKING FINAL ============\n");
		
		for(PilotoCorrida pc : rankingVencedores){
			System.out.println("PILOTO: " + pc.getPiloto().getNome() +
					" TEMPO (TERMINO): " +PilotoConverter.dateToString(pc.getHoraTermino()) +
					" TEMPO VOLTA: " + PilotoConverter.horaToString(pc.getTempoVolta()) +
					" NUM. VOLTA: " + pc.getNumeroVolta());
		}
		
		
	}

}
