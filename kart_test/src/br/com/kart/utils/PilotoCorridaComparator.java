package br.com.kart.utils;

import java.util.Comparator;

import br.com.kart.entity.PilotoCorrida;

public class PilotoCorridaComparator implements Comparator<PilotoCorrida> {

	@Override
	public int compare(PilotoCorrida pc, PilotoCorrida pc1) {		
		return pc.getHoraTermino().compareTo(pc1.getHoraTermino());
	}

}
