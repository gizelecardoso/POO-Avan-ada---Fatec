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
			
		
			
			if(tipo == 1) {
				
				Tipo1 tipo1 = new Tipo1();
				
				double salario = 1500 + gerador.nextDouble() * 3500;
				tipo1.setSalario(salario);
				
				empregados.add(tipo1);
				
				System.out.println(salario);
				
			} else if(tipo == 2) {
				
				Tipo2 tipo2 = new Tipo2();
				
				double salario = 1200 + gerador.nextDouble() * 1000;
				double percentualComissao = gerador.nextDouble();
				
				tipo2.setSalario(salario);
				tipo2.setPercentualComissao(percentualComissao);
				
				empregados.add(tipo2);
				
				System.out.println(salario);
				System.out.println(percentualComissao);
				
			} else if(tipo == 3) {
				
				Tipo3 tipo3 = new Tipo3();
				
				double salario = 1100 + gerador.nextDouble() * 700;
				double percentualComissao = 0.2 + gerador.nextDouble() * 0.5;
				double bonus = gerador.nextDouble();
				
				tipo3.setSalario(salario);
				tipo3.setPercentualComissao(percentualComissao);
				tipo3.setBonus(bonus);
				
				empregados.add(tipo3);
				
				System.out.println(salario);
				System.out.println(percentualComissao);
				System.out.println(bonus);
				
			}else if(tipo == 4) {
				
				Tipo4 tipo4 = new Tipo4();
				
				double bonus = 2000 + gerador.nextDouble() + 2500;
				
				tipo4.setBonus(bonus);
				
				empregados.add(tipo4);
				
				System.out.println(bonus);
			}
			
		}
		
		for(Empregado e: empregados) {
			System.out.println("Tipo do empregado: " + e.getValorAReceber());
			
		}
		
	
	}

}
