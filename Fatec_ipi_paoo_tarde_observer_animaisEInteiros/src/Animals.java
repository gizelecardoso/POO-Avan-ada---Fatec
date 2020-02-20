import java.util.Random;

public abstract class Animals implements Observer {
	
	private Random gerador = new Random();
	private boolean queroSair = false;
	
	//esse código só funciona pois como agir é abstrato ele garante que só virá das classes concretas, já que a abstrata não pode ser instanciadas
	@Override
	public void update(int n) {
		agir(n);
		queroSair = gerador.nextDouble() <= 0.4;
	}
	
	public boolean getQueroSair() {
		return queroSair;
	}
	
	public abstract void agir(int numero);


}
