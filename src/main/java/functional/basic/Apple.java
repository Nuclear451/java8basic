package functional.basic;

public class Apple{
	private String cultivar;
	private String color;
	private int weight;

	public Apple(String cultivar, String color, int weight) {
		this.cultivar = cultivar;
		this.weight = weight;
		this.color = color;
	}

	public String getCultivar() {
		return cultivar;
	}

	public void setCultivar(String cultivar) {
		this.cultivar = cultivar;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "{cultivar: " + cultivar + ", weight: " + weight + ",color: " + color + "}";
	}
}
