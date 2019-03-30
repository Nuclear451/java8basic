package optionals;

import java.util.Optional;

/**
 * Created by Nuclear on 08.10.2018.
 */
public class SimplestOptional {

    public static Optional<Double> average(int... scores){
        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score : scores) sum += score;

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {



        String s1 = "first";
        String s2 = null;

        Optional<String> first = Optional.ofNullable(s2);
        //Optional<String> second = Optional.of(s2);

        Optional<String> third = Optional.ofNullable(s1);
        Optional<String> fourth = Optional.of(s1);

        first.ifPresent(System.out::print);
        third.ifPresent(System.out::print);
    }
}
