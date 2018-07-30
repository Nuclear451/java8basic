package patterns.factory;

import patterns.factory.food.Fish;
import patterns.factory.food.Food;
import patterns.factory.food.Hay;
import patterns.factory.food.Pellets;

public class FoodFactory {
	private FoodFactory(){}

	public static Food getFood(String animalName){
		switch (animalName){
			case "zebra" : return new Hay(100);
			case "rabbit" : return new Pellets(5);
			case "goat" : return new Pellets(30);
			case "polar bear" : return new Fish(20);
		}

		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}
