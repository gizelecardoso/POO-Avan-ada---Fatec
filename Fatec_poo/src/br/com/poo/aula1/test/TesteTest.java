package br.com.poo.aula1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.poo.aula1.Tipo1;
import br.com.poo.aula1.Tipo2;
import br.com.poo.aula1.Tipo3;
import br.com.poo.aula1.Tipo4;

class TesteTest {

	@Test
	public void testValorAReceber() {
		
		Tipo1 tipo1 = new Tipo1(1500);
		assertEquals(1500, tipo1.getValorAReceber());
		
		Tipo2 tipo2 = new Tipo2(1500, 0.1);
		
		double salarioAtual = tipo2.getSalario() + (tipo2.getSalario() * tipo2.getPercentualComissao());
		
		assertEquals(salarioAtual, tipo2.getValorAReceber());
		
		Tipo3 tipo3 = new Tipo3(1500, 0.1, 0.1);
		
		double salarioAtual2 = tipo3.getSalario() + (tipo3.getSalario() * tipo3.getPercentualComissao()) + tipo3.getBonus();
		
		assertEquals(salarioAtual2, tipo3.getValorAReceber());
		
		Tipo4 tipo4 = new Tipo4(1200);
		
		assertEquals(tipo4.getBonus(), tipo4.getValorAReceber());	
		
	}

}
