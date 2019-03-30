package functional.interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Nuclear on 06.10.2018.
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = s -> s.isEmpty();


        System.out.println("Predicate");
        System.out.println(p1.test(""));
        System.out.println(p2.test("dsf") + "\n");


        BiPredicate<String, String> bp1 = String::startsWith;
        BiPredicate<Integer, Integer> bp2 = (a, b) -> a > b;

        System.out.println("BiPredicate");
        System.out.println(bp1.test("Я помню чудное мнгновение", "Я"));
        System.out.println(bp2.test(5, 10));
        System.out.println(bp2.test(10, 6));

    }
}
