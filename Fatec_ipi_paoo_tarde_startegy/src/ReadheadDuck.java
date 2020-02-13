
public class ReadheadDuck extends Duck implements Flyable, Quackable{


	@Override
	public void fly() {
		System.out.println("Nadando");
		
	}

	@Override
	public void quack() {
		System.out.println("Quack");		
	}

}
