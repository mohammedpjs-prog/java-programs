package FunctionalInterfaces;

import java.util.function.Predicate;

public class Testing {
    public static void main(String[] args){
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(12));
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
