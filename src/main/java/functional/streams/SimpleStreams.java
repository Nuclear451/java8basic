package functional.streams;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Nuclear on 03.11.2018.
 */
public class SimpleStreams {
    private static final List<String> list = Arrays.asList("one", "two", "three", "four");
    private static final String[] arrayOfStrings = {"w", "o", "l", "f"};
    private static final int[] arrayOfInts = {1, 2, 3, 4};

    public static void main(String[] args) {

        int a = 5000;
        byte b = (byte) a;

        double pi = 3.14;

        int cuttedPi = (int) pi;

        System.out.println(b);

        String greeting  = "Hello world";

        int[] array;

        char[] letters = new char[10];
        int arraySize = letters.length;

        letters[0] = 'a';
        letters[1] = 'a';
        letters[2] = 'a';

        System.out.println("Второй элемент массива:" + letters[1]); // Получили 2 элемент массива (букву b)


        int[] anotherArray = {1, 2, 3, 5, 6};

        System.out.println("Второй элемент массива:" + anotherArray[1]); // Получили 2 элемент массива (букву b)

        System.out.println(letters[-1]);
        System.out.println(letters[4]);
    }
}
