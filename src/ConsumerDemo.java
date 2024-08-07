package src;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8);
        Consumer<Integer> con = n -> System.out.println(n);
        list.forEach(con);
    }
}
