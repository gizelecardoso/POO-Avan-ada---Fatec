
public class Empregado {

	private int tipo; //variavel de instancia encapsulada do tipo inteiro
	private double salario;
	private double percentualComissao;
	private double bonus;
		
	//gerando construtor Padrão
	public Empregado() {}

	//gerando construtor com sobrecarga como parametro o um tipo e atribui ao atributo dessa classe.
	public Empregado(int tipo) {
		this.tipo = tipo; // this - operador de autoreferecia - esta fazendo referencia a ele mesmo.
	}
	
	//sobrecarga (overload) de contrutores é um exemplo de polimorfismo - 
	//nesse exemplo é um polimorfismo estático - (normalmente não é falado assim)
	//em tempo de compilação - o compilador enxerga o erro antes de executar
	
	//polimorfismo dinamico - tempo de execução - JVM
	
	//polimorfismo Paramétrico -  com o Generics do Java.
		//ArrayList<T> a;   recebe o tipo Genérico (não primitivo) // fazendo ela se comportar de diversas formas
	
	//sobrescrita - override 
	
	
	//gerando getters e setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
	
	public double getValorAReceber(int tipo, double salario, double percentualComissao, double bonus) {

		switch(tipo) {
			case 1:
				return salario;
			case 2:
				return salario = salario * percentualComissao;
			case 3:
				return salario = salario * percentualComissao + bonus;
			case 4:
				return salario = bonus;
			default:
				return salario = 0;
		}
	}	
	
	
	
}
