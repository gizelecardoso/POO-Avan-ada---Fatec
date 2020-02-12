package br.com.poo.aula1;

public class Tipo1 extends Empregado{
	
	public Tipo1() {}
	
	public Tipo1(double salario) {
		super.setSalario(salario);
	}

	@Override
	public double getValorAReceber() {
		return super.getSalario();
	}
	
	
	
	


}
