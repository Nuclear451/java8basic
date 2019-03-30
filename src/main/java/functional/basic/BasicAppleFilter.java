package functional.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasicAppleFilter {
	private static List<Apple> apples = new ArrayList<>();

	static {
		apples.add(new Apple("Admiral", "red", 200));
		apples.add(new Apple("Adams Pearmain", "yellow", 290));
		apples.add(new Apple("Beacon", "red", 100));
		apples.add(new Apple("Bismarck", "green", 156));
		apples.add(new Apple("Braeburn", "green", 68));
		apples.add(new Apple("Cameo", "red", 300));
		apples.add(new Apple("Clivia", "red", 254));
		apples.add(new Apple("Crispin", "yellow", 278));
		apples.add(new Apple("Envy", "red", 205));
		apples.add(new Apple("Empire", "green", 400));
	}

	public static void main(String[] args) throws Exception {
		System.out.println(apples);
		System.out.println(" ");
		new Thread(() -> {apples.sort(Comparator.comparing(Apple::getWeight)); System.out.println(apples);}).start();
		Thread.sleep(24);

		System.out.println(apples);
		System.out.println(" ");

		System.out.println();

	}

	public static List<Apple> weightFilter(List<Apple> apples, int weigh) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : apples) {
			if (apple.getWeight() >= weigh) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> appleFilter(List<Apple> apples, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : apples)
			if (p.test(apple)) result.add(apple);
		return result;
	}

	public static<T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : list)
			if (p.test(t)) result.add(t);
		return result;
	}

	public static List<Apple> filterAnonymous(List<Apple> apples, ApplePredicate p) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : apples)
			if (p.test(apple)) result.add(apple);
		return result;
	}

	private interface ApplePredicate{
		boolean test(Apple apple);
	}
}

