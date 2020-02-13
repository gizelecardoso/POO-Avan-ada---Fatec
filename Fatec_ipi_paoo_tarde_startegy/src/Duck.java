
public class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void realizarVoo() {
		flyBehavior.fly();
	}
	
	public void realizarQuack() {
		quackBehavior.quack();
	}
	
	public void swin() {
		System.out.println("Nadando");	
	}
	

	public void display() {
		System.out.println(this.getClass().getSimpleName());
	}
	

}
