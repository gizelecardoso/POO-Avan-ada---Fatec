package br.com.poo.aula1;

public class EmpregadoBonificado extends Empregado{

	private double bonus;
	
	public EmpregadoBonificado() {}

	public EmpregadoBonificado(double bonus) {
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
		double salarioFinal = bonus;
		return salarioFinal;
		
	}


}
