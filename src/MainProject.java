package src;

import java.util.*;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

//@FunctionalInterface
//interface  A{
//    void show();
////    default void display();
//    String toString();
//}

public class MainProject {
    public static void main(String[] args) {
//        Integer [] a = {22,33,44,33,22,11};
//        List<Integer> b = Arrays.asList(a);
////        Stream<Integer> s = b.stream().sorted();
//        b.forEach(System.out::println);

        int [] b = {22,33,44,33,22,11};
        int sum = Arrays.stream(b).sum();
        System.out.println(sum);

//        Consumer<Integer> consumer = (value) -> System.out.println(value);
//        Predicate<Integer> isEven = (n -> n%2 == 0);
//        System.out.println(isEven.test(9));

//        Supplier
        String name = "Java Hungry Blog Alive is Awesome";
//        String name = "a bcd";

//        Map<Character, Long> result = name
//                .chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
//        result.forEach((r,v) -> {
//            if (!r.equals(' ') && v > 1) {
//                System.out.println(r + " : " + v);
//            }
//        });

//        name
//                .chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
//                .forEach((k,v)->{
//                    if(!k.equals(' ')  && v > 1){
//                        System.out.print(k+" ");
//                    }
//                });

//         Set<Character> r = name.chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.toSet());
//         System.out.println(r);
//         if(r.size() < name.length()){
//             System.out.println("false");
//         }
//         else{
//             System.out.println("true");
//         }



//        result.forEach((k, v) -> {
//            if (v > 1) {
//                System.out.println(k + " : " + v);
//            }
//        });

//        List<Integer> list = Arrays.asList(32, 1, 3, 4, 53, 22, 44);
//        Integer maxNumber = list
//                .stream()
//                .max(Comparator.naturalOrder())
//                .orElseThrow(() -> new RuntimeException("List is empty"));
//        System.out.println("max : "+maxNumber);


//        Optional<Integer> max = list
//                .stream()
//                .max(Comparator.naturalOrder());
//        System.out.println("max : "+max.get());
    }
}
