package br.com.poo.aula1;

public class EmpregadoAssalariadoComissionado extends EmpregadoAssalariado {

	private double percentualComissao;

	public EmpregadoAssalariadoComissionado() {}

	public EmpregadoAssalariadoComissionado(double salario, double percentualComissao) {
		super(salario);
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
