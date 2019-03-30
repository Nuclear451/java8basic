package functional.interfaces;

import java.util.function.Function;

/**
 * Created by Nuclear on 08.10.2018.
 */
public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.hashCode();


        System.out.println(f1.apply("Hello world"));
        System.out.println(f2.apply("Aa"));
        System.out.println(f2.apply("BB"));
    }
}
