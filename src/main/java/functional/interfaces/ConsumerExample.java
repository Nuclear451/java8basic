package functional.interfaces;

import java.util.function.Consumer;

/**
 * Created by Nuclear on 06.10.2018.
 */
public class ConsumerExample {
    private static Consumer<String> print = System.out::println;
    private static Consumer<String> print2 = s -> System.out.println(s);

    public static void main(String[] args) {
        print.accept("Hello world");
    }
}
