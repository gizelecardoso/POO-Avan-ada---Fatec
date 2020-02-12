package poo;

public class Tipo4 extends Empregado{

	private double bonus;
	

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
