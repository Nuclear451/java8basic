package patterns.factory.food;

public abstract class Food {
	protected int quantity;

	public Food(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public abstract void consumed();
}
