package com.hd.teste.hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;

import com.hd.projeto_hd.modelo.BancoHora;

public class TesteHora {

	public static void main(String[] args) throws ParseException {

		// TODO Auto-generated method stub BancoHora hora = new BancoHora();
		// SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		// hora1 = sdf.format(new Date()).replaceAll(":", "");
		// Integer.valueOf(hora1);

		/*
		 * 1String horaEntrada = "07:30"; String horaSaida = "12:00";
		 * 
		 * String horaSemPontoEntrada = horaEntrada.replaceAll(":", ""); String
		 * horaSemPontoSaida = horaSaida.replaceAll(":", "");
		 * 
		 * System.out.println(horaSemPontoEntrada);
		 * System.out.println(horaSemPontoSaida);
		 * 
		 * SimpleDateFormat dbl = new SimpleDateFormat("0000"); double horaFormatEntrada
		 * = Double.valueOf(horaSemPontoEntrada); double horaFormatSaida =
		 * Double.valueOf(horaSemPontoSaida);
		 * 
		 * double horaDia = horaFormatSaida - horaFormatEntrada;
		 * 
		 * System.out.println(horaDia);
		 */
		String horaInicial = "13:30:00";
		String horaFinal = "14:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

		Date horaIni = sdf.parse(horaInicial);
		Date horaFin = sdf.parse(horaFinal);

		long horaI = horaIni.getTime();
		
		long horaf = horaFin.getTime();

		long direfeHoras =  horaI - horaf ;
		
		String resultado = (Long.toString(direfeHoras/ 60));

		System.out.println(direfeHoras );
		System.out.println(resultado);

	}

}
