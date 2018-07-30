package patterns.builder;

public class Animal {
	protected String name;
	protected int weight;
	protected int age;

	public Animal(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("patterns.builder.Animal{");
		sb.append("name='").append(name).append('\'');
		sb.append(", weight=").append(weight);
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
