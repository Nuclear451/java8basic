package enums;

public enum Season {
	WINTER("low"),
	SPRING("medium"),
	SUMMER("high"),
	FALL("medium");

	private String expectedVisitors;

	Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors(){
		System.out.println(expectedVisitors);
	}
}
