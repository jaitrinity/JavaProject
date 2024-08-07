package src;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Integer> intSupp = () -> new Random().nextInt(100);
        System.out.println("1 : "+intSupp.get());
        System.out.println("2 : "+intSupp.get());
        System.out.println("3 : "+intSupp.get());

    }
}
