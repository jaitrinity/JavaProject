package src;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> collect = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("d : "+collect);
        numbers.stream().filter(isEven).forEach((n) -> System.out.println(n));
    }
}
