package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    T t;

    public Box(T t) {
        this.t = t;
    }

    public static <T> Box<T> getBox(T t){
        return new Box<>(t);
    }

    public static void main(String[] args) {
        Box<Number> box = new Box<>(1);
        Box.<String>getBox("123");

        List<String> list = new ArrayList<>();
        list.add("string");

        test(list);
    }

    public static void test(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static int summarize(List<? extends Number> list){
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
        }
        return sum;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
