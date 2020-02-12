package br.com.poo.aula1;


public abstract class Empregado {

	//private int tipo;
	protected double salario;
	//private double percentualComissao;
	//private double bonus;
	


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	
	public abstract double getValorAReceber();

	
	
	
}
