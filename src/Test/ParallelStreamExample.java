package Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class ParallelStreamExample {
    public static void main(String[] args){
        IntStream.rangeClosed(1, 100)
                .parallel()
                .forEach(n ->
                        System.out.println(
                                n + " -> " +
                                        Thread.currentThread().getName()
                        ));
    }
}