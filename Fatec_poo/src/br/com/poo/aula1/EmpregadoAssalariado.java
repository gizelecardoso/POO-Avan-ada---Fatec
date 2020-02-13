package br.com.poo.aula1;

public class EmpregadoAssalariado extends Empregado{
	
	private double salario;
	
	public EmpregadoAssalariado() {}
	
	public EmpregadoAssalariado(double salario) {
		this.salario = salario;
	}
	


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getValorAReceber() {
		return salario;
	}
	
	
	
	


}
