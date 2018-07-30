package nested;

public class Outer {
	private String greeting = "Hello";

	private class Inner{
		private int repeat = 3;
		public void go(){
			for (int i = 0; i < repeat; i++){
				System.out.println(greeting);
			}
		}
	}

	public void callInner(){
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.callInner();

		Inner inner = o.new Inner(); // create the inner class
		inner.go();
	}
}
