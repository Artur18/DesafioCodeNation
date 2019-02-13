package br.com.desafio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteProjeto {

	public static void main(String[] args) {
		
		 
		 
		Gerenciador_de_Times gt = new Gerenciador_de_Times();
		gt.incluirJogador(1l, 1l, "Daniel", LocalDate.of(2012, 02, 12), Integer.valueOf(60), BigDecimal.valueOf(1600.00));
		System.out.println(gt.getJogadores());
		
	}

}
