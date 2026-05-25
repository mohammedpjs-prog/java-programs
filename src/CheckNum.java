import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class CheckNum {
    public static void main(String[] args){

        System.out.println("Example for predicate");
        System.out.println("---------------------");
        Predicate<Integer> isEven = n -> n%2==0;
        System.out.println(isEven.test(199));
        System.out.println(isEven.test(88));

        System.out.println("Example for function");
        System.out.println("--------------------");
        Function<Integer,Integer> square = n -> n*n;
        System.out.println(square.apply(8));

        System.out.println("Example for consumer");
        System.out.println("--------------------");
        Consumer<String> print =name ->
                System.out.println(name);
        print.accept("Mohammed");

        System.out.println("Example for suppl");
        System.out.println("-----------------");
        Supplier<Double> random = ()->
                Math.random();
        System.out.println(random.get());
    }
}
