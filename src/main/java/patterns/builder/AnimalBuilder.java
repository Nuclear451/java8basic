package patterns.builder;

public class AnimalBuilder {
	private String name;
	private int weight;
	private int age;

	public AnimalBuilder setName(String name){
		this.name = name;
		return this;
	}

	public AnimalBuilder setWeight(int weight){
		this.weight = weight;
		return this;
	}

	public AnimalBuilder setAge(int age){
		this.age = age;
		return this;
	}

	public Animal build(){
		return new Animal(name, weight, age);
	}

	public static void main(String[] args) {
		AnimalBuilder animalBuilder = new AnimalBuilder();
		Animal animal = animalBuilder
				.setAge(20)
				.setName("Hippo")
				.setWeight(200)
				.build();

		System.out.println(animal);

		animal = animalBuilder
				.setAge(10)
				.setName("Cat")
				.setWeight(3)
				.build();

		System.out.println(animal);
	}
}
