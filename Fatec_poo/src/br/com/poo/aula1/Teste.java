package br.com.poo.aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {

		List<Empregado> empregados = new ArrayList<Empregado>();
		Random gerador = new Random();

		System.out.println("Preencher dados \n");
		
		for(int i=0; i<10; i++) {
			int tipo = 1 + gerador.nextInt(4);//parametro que limita até onde será criado o random
						
			System.out.println("Tipo" + tipo + "\n");
			
			switch (tipo) {
			
				case 0:
					empregados.add(new EmpregadoAssalariado(1700 + gerador.nextDouble() * 500));
					break;
				case 1:
					empregados.add(new EmpregadoAssalariadoComissionado(1000 + gerador.nextDouble() * 500, gerador.nextDouble()));
					break;
				case 2:
					empregados.add(new EmpregadoAssalariadoComissionadoBonificado(800 + gerador.nextDouble() * 400, gerador.nextDouble(), gerador.nextDouble() * 400));
					break;
				case 3:
					empregados.add(new EmpregadoBonificado(2000 + gerador.nextDouble() * 2000));
					break;
			
			}
		
			
		}
		
		for(Empregado e: empregados) {
			System.out.println("Tipo do empregado: " + e.getValorAReceber());
			
		}
		
	
	}

}
