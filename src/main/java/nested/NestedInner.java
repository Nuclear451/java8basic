package nested;

/**
 * Created by Nuclear on 18.07.2018.
 */
public class NestedInner {
    private final String greeting = "Hello";

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
        NestedInner outer = new NestedInner();
        Inner inner = outer.new Inner();
        inner.go();
    }
}
