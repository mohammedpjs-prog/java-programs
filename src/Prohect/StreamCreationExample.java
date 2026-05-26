package Prohect;
import java.util.*;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args){
        // From list
        List <String> names = Arrays.asList("java ","python","spring");

        names.stream()
                .forEach(System.out::println);

        //From Arrays
        int [] numbers ={1,2,3,4,5};
        Arrays.stream(numbers)
                .forEach(System.out::println);

        //Using stream.of()
        Stream<String> stream = Stream.of("A","B","C");
                stream.forEach(System.out::println);
    }
}
