import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {

		List<Empregado> empregados = new ArrayList<Empregado>();
		Random gerador = new Random();

		System.out.println("Preencher dados \n");
		
		for(int i=0; i<10; i++) {
			int tipo = 1 + gerador.nextInt(4);//parametro que limita até onde será criado o random
						
			System.out.println("Tipo" + tipo + "\n");
			empregados.add(new Empregado(tipo));	
			
			if(tipo == 1) {
				double salario = 1500 + gerador.nextDouble() * 3500;
				empregados.get(i).setSalario(salario);
			} else if(tipo == 2) {
				double salario = 1200 + gerador.nextDouble() * 1000;
				double percentualComissao = gerador.nextDouble();
				
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
			} else if(tipo == 3) {
				double salario = 1100 + gerador.nextDouble() * 700;
				double percentualComissao = 0.2 + gerador.nextDouble() * 0.5;
				double bonus = gerador.nextDouble();
				
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
				empregados.get(i).setBonus(bonus);
			}else if(tipo == 4) {
				double bonus = 2000 + gerador.nextDouble() + 2500;
				
				empregados.get(i).setBonus(bonus);
			}
			
		}
		
		for(Empregado e: empregados) {
			System.out.println("Tipo do empregado: " + e.getTipo());
			
			double salarioFinal = e.getValorAReceber(e.getTipo(), e.getSalario(), e.getPercentualComissao(), e.getBonus());
			
			e.setSalario(salarioFinal);
			
			System.out.println("Salario a receber: " + String.format("R$ %.2f", salarioFinal) + "\n");
		}
		
	
	}

}
