package br.com.poo.aula1;

public class Tipo2 extends Empregado {

	private double percentualComissao;

	public Tipo2() {}

	public Tipo2(double salario, double percentualComissao) {
		super();
		this.percentualComissao = percentualComissao;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	@Override
	public double getValorAReceber() {

		double salarioFinal = super.getSalario() + (super.getSalario() * percentualComissao);

		return salarioFinal;
	}

}
