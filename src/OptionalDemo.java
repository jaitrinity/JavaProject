package src;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.function.IntFunction;



public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = getName();
        System.out.println(name.isPresent());
        name.ifPresent(System.out::println);
        name.ifPresent((c)->System.out.println("c : "+c));
        String d = name.orElse("Na");
        System.out.println("d : "+d);

        name.orElseGet(() -> {
            return "aa";
        });

        System.out.println(name.orElseThrow(NoSuchElementException::new));

    }

    private static Optional<String> getName(){
        String name = "Jai";
//        return Optional.ofNullable(name);
        return Optional.empty();

    }
}
