package functional.interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * Created by Nuclear on 06.10.2018.
 */
public class SupplierExample {
    private static Supplier<LocalDate> s1 = LocalDate::now;
    private static Supplier<LocalDate> s2 = () -> LocalDate.now();

    public static void main(String[] args) {
        System.out.println(s1.get());
    }
}
