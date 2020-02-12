package br.com.poo.aula1;

public class Tipo3 extends Empregado{

	private double percentualComissao;
	private double bonus;
	
	
	public Tipo3() {}

	public Tipo3(double salario, double percentualComissao, double bonus) {
		super();
		this.percentualComissao = percentualComissao;
		this.bonus = bonus;
	}
	
	
	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getValorAReceber() {
		double salarioFinal = super.getSalario() + (super.getSalario() * percentualComissao) + bonus;
		return salarioFinal;
	}

	

}
