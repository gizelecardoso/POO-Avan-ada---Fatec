package br.com.poo.aula1;

public class EmpregadoAssalariadoComissionadoBonificado extends EmpregadoAssalariadoComissionado{

	private double bonus;
	
	
	public EmpregadoAssalariadoComissionadoBonificado() {}

	public EmpregadoAssalariadoComissionadoBonificado(double salario, double percentualComissao, double bonus) {
		super(salario, percentualComissao);
		this.bonus = bonus;
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getValorAReceber() {
		double salarioFinal = super.getValorAReceber() + bonus;
		return salarioFinal;
	}

	

}
