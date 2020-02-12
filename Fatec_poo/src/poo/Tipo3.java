package poo;

public class Tipo3 extends Empregado{

	private double percentualComissao;
	private double bonus;
	
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
