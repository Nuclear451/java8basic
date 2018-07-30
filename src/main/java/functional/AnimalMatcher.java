package functional;

import java.util.function.Predicate;

public class AnimalMatcher {
	private static void print(Animal animal, Predicate<Animal> trait){
		if (trait.test(animal)){
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.isCanSwim());
		print(new Animal("rabbit", true, false), Animal::isCanSwim);
	}
}
