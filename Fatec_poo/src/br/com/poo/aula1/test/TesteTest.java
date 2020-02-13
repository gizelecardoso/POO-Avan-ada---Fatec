package br.com.poo.aula1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.poo.aula1.EmpregadoAssalariado;
import br.com.poo.aula1.EmpregadoAssalariadoComissionado;
import br.com.poo.aula1.EmpregadoAssalariadoComissionadoBonificado;
import br.com.poo.aula1.EmpregadoBonificado;

class TesteTest {

	@Test
	public void testValorAReceberTipo1() {
		
		EmpregadoAssalariado tipo1 = new EmpregadoAssalariado(1500);
		assertEquals(1500, tipo1.getValorAReceber());
	
	}
	
	@Test
	public void testValorAReceberTipo2() {
		
		EmpregadoAssalariadoComissionado tipo2 = new EmpregadoAssalariadoComissionado(1500, 0.1);
		double salarioAtual = tipo2.getSalario() + (tipo2.getSalario() * tipo2.getPercentualComissao());
		assertEquals(salarioAtual, tipo2.getValorAReceber());	
	}
	
	@Test
	public void testValorAReceberTipo3() {
		
		EmpregadoAssalariadoComissionadoBonificado tipo3 = new EmpregadoAssalariadoComissionadoBonificado(1500, 0.1, 0.1);
		double salarioAtual2 = tipo3.getSalario() + (tipo3.getSalario() * tipo3.getPercentualComissao()) + tipo3.getBonus();
		assertEquals(salarioAtual2, tipo3.getValorAReceber());
		
	}
	
	
	@Test
	public void testValorAReceberTipo4() {
		
		EmpregadoBonificado tipo4 = new EmpregadoBonificado(1200);
		assertEquals(tipo4.getBonus(), tipo4.getValorAReceber());	
		
	}

}
