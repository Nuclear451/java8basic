package enums;

public class App {
	public static void main(String[] args) {
		Season[] seasonsArr = Season.values();

		for (Season s : seasonsArr){
			s.printExpectedVisitors();
		}
	}
}
