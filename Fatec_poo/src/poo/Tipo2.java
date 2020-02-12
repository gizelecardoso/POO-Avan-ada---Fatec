package poo;

public class Tipo2 extends Empregado{
	
	private double percentualComissao;
	
	

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
