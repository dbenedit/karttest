package br.com.kart.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.kart.entity.Interlagos;
import br.com.kart.entity.Piloto;
import br.com.kart.entity.PilotoCorrida;
import br.com.kart.interfaces.Circuito;

public class KartUtils {
	
	public List<PilotoCorrida> getResultados(){
		List<PilotoCorrida> pilotoCorridas = new ArrayList<PilotoCorrida>();	
		
		PilotoCorrida massa = new PilotoCorrida(new Piloto(new Integer("038"), "F.Massa"),
				null, 
				PilotoConverter.stringToDateConverter("23:49:08.277"), 
				new Integer("1"), 
				PilotoConverter.stringToDateVoltaConverter("1:02.852"));
		pilotoCorridas.add(massa);
		
		PilotoCorrida barrichello = new PilotoCorrida(new Piloto(new Integer("033"), "R.Barichello"),
				null, 
				PilotoConverter.stringToDateConverter("23:49:10.858"), 
				new Integer("1"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.352"));		
		pilotoCorridas.add(barrichello);
		
		PilotoCorrida raikonen = new PilotoCorrida(new Piloto(new Integer("002"), "K.Raikonen"),
				null, 
				PilotoConverter.stringToDateConverter("23:49:11.075"), 
				new Integer("1"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.108"));		
		pilotoCorridas.add(raikonen);
		
		PilotoCorrida webber = new PilotoCorrida(new Piloto(new Integer("023"), "M.Webber"),
				null, 
				PilotoConverter.stringToDateConverter("23:49:12.667"), 
				new Integer("1"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.414"));		
		pilotoCorridas.add(webber);
		
		PilotoCorrida alonso = new PilotoCorrida(new Piloto(new Integer("015"), "F.Alonso"),
				null, 
				PilotoConverter.stringToDateConverter("23:49:30.976"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:18.456"));		
		pilotoCorridas.add(alonso);
		
		
		PilotoCorrida massa2 = new PilotoCorrida(new Piloto(new Integer("038"), "F.Massa"),
				null, 
				PilotoConverter.stringToDateConverter("23:50:11.447"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:03.170"));
		pilotoCorridas.add(massa2);
		
		PilotoCorrida barrichello2 = new PilotoCorrida(new Piloto(new Integer("033"), "R.Barichello"),
				null, 
				PilotoConverter.stringToDateConverter("23:50:14.860"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.002"));		
		pilotoCorridas.add(barrichello2);
		
		PilotoCorrida raikonen2 = new PilotoCorrida(new Piloto(new Integer("002"), "K.Raikonen"),
				null, 
				PilotoConverter.stringToDateConverter("23:50:15.057"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:03.982"));		
		pilotoCorridas.add(raikonen2);
		
		PilotoCorrida webber2 = new PilotoCorrida(new Piloto(new Integer("023"), "M.Webber"),
				null, 
				PilotoConverter.stringToDateConverter("23:50:17.472"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.80"));		
		pilotoCorridas.add(webber2);
		
		PilotoCorrida alonso2 = new PilotoCorrida(new Piloto(new Integer("015"), "F.Alonso"),
				null, 
				PilotoConverter.stringToDateConverter("23:50:37.987"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:07.011"));		
		pilotoCorridas.add(alonso2);
		
		PilotoCorrida massa3 = new PilotoCorrida(new Piloto(new Integer("038"), "F.Massa"),
				null, 
				PilotoConverter.stringToDateConverter("23:51:14.216"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:02.769"));
		pilotoCorridas.add(massa3);
		
		PilotoCorrida barrichello3 = new PilotoCorrida(new Piloto(new Integer("033"), "R.Barichello"),
				null, 
				PilotoConverter.stringToDateConverter("23:51:18.576"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:03.716"));		
		pilotoCorridas.add(barrichello3);
		
		PilotoCorrida raikonen3 = new PilotoCorrida(new Piloto(new Integer("002"), "K.Raikonen"),
				null, 
				PilotoConverter.stringToDateConverter("23:51:19.044"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:03.987"));		
		pilotoCorridas.add(raikonen3);
		
		PilotoCorrida webber3 = new PilotoCorrida(new Piloto(new Integer("023"), "M.Webber"),
				null, 
				PilotoConverter.stringToDateConverter("23:51:21.759"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.287"));		
		pilotoCorridas.add(webber3);
		
		PilotoCorrida alonso3 = new PilotoCorrida(new Piloto(new Integer("015"), "F.Alonso"),
				null, 
				PilotoConverter.stringToDateConverter("23:51:46.691"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:08.704"));		
		pilotoCorridas.add(alonso3);
		
		PilotoCorrida vetel = new PilotoCorrida(new Piloto(new Integer("011"), "F.Vettel"),
				null, 
				PilotoConverter.stringToDateConverter("23:52:01.796"), 
				new Integer("1"), 
				PilotoConverter.stringToDateVoltaConverter("3:31.315"));
		pilotoCorridas.add(vetel);
		
		PilotoCorrida massa4 = new PilotoCorrida(new Piloto(new Integer("038"), "F.Massa"),
				null, 
				PilotoConverter.stringToDateConverter("23:52:17.003"), 
				new Integer("4"), 
				PilotoConverter.stringToDateVoltaConverter("1:02.787"));
		pilotoCorridas.add(massa4);
		
		PilotoCorrida barrichello4 = new PilotoCorrida(new Piloto(new Integer("033"), "R.Barichello"),
				null, 
				PilotoConverter.stringToDateConverter("23:52:22.586"), 
				new Integer("4"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.010"));		
		pilotoCorridas.add(barrichello4);
		
		PilotoCorrida raikonen4 = new PilotoCorrida(new Piloto(new Integer("002"), "K.Raikonen"),
				null, 
				PilotoConverter.stringToDateConverter("23:52:22.120"), 
				new Integer("4"), 
				PilotoConverter.stringToDateVoltaConverter("1:03.076"));		
		pilotoCorridas.add(raikonen4);
		
		PilotoCorrida webber4 = new PilotoCorrida(new Piloto(new Integer("023"), "M.Webber"),
				null, 
				PilotoConverter.stringToDateConverter("23:52:25.975"), 
				new Integer("4"), 
				PilotoConverter.stringToDateVoltaConverter("1:04.216"));		
		pilotoCorridas.add(webber4);
		
		PilotoCorrida alonso4 = new PilotoCorrida(new Piloto(new Integer("015"), "F.Alonso"),
				null, 
				PilotoConverter.stringToDateConverter("23:53:06.741"), 
				new Integer("4"), 
				PilotoConverter.stringToDateVoltaConverter("1:20.050"));		
		pilotoCorridas.add(alonso4);
		
		PilotoCorrida vetel2 = new PilotoCorrida(new Piloto(new Integer("011"), "F.Vettel"),
				null, 
				PilotoConverter.stringToDateConverter("23:53:39.660"), 
				new Integer("2"), 
				PilotoConverter.stringToDateVoltaConverter("1:37.864"));
		pilotoCorridas.add(vetel2);
		
		PilotoCorrida vetel3 = new PilotoCorrida(new Piloto(new Integer("011"), "F.Vettel"),
				null, 
				PilotoConverter.stringToDateConverter("23:54:57.757"), 
				new Integer("3"), 
				PilotoConverter.stringToDateVoltaConverter("1:18.097"));
		pilotoCorridas.add(vetel3);
		
		return pilotoCorridas;	
		
	}


}
