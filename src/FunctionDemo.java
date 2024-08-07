package src;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("jai", "Naman", "dasw", "desd");
        Function<String, Integer> fuc = String::length;
        List<Integer> collect = name.stream().map(fuc).collect(Collectors.toList());
        System.out.println(collect);


    }
}
