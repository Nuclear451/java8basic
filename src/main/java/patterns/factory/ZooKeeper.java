package patterns.factory;

import patterns.factory.food.Food;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("zebra");
		food.consumed();
		//final Food food2 = FoodFactory.getFood("test animal");
	}
}
