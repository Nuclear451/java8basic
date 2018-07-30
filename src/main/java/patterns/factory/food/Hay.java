package patterns.factory.food;

public class Hay extends Food {
	public Hay(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: " + quantity);
	}
}