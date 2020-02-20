import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorDeInteiros implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private int numero;

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		
		List <Observer> aux = new ArrayList<>();
		
		for (Observer o : observers) {
			o.update(numero);
			
			if(!((Animals)o).getQueroSair()) {
				aux.add(o);
			}
			
			System.out.println();
		}
		observers.clear();
		observers.addAll(aux);
	}

	public int iniciar() {

		Random gerador = new Random();

		while (true) {
			numero = gerador.nextInt(10) + 1;
			notifyObserver();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("================================");

		}
	}

}
