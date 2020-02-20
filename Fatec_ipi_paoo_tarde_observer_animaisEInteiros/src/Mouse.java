
public class Mouse extends Animals {

	@Override
	public void agir(int numero) {
		for(int i=0; i < numero; i++) {
			System.out.print(i + " m -> ");
		}
	}

}
