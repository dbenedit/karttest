package br.com.kart.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PilotoConverter {

	/**
	 * Conversor que lê uma String e transforma para o tipo Date Hora:minutos:segundos.Milisegundos (Tempo total da corrida)
	 * @param hora
	 * @return
	 */
	public static Date stringToDateConverter(String hora){
		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");		
			data = sdf.parse(hora);
		} catch (ParseException e) {		
			e.printStackTrace();
		}
		
		return data;
	}
	
	/**
	 * Conversor que lê uma String e transforma para o tipo Date minutos:segundos.Milisegundos (Tempo de cada volta
	 * no circuito)
	 * @param hora
	 * @return
	 */
	public static Date stringToDateVoltaConverter(String hora){
		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");		
			data = sdf.parse(hora);
		} catch (ParseException e) {		
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static String dateToString(Date data){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		return sdf.format(data);
	}
	
	public static String horaToString(Date hora){
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");		
		return sdf.format(hora);
	}

}
