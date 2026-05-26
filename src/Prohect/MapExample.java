package Prohect;
import java.util.Arrays;
import java.util.List;
public class MapExample {
    public static void main(String[] args){

        List<String>names =
                Arrays.asList("java","java","python","spring","html");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("----------------");

        List<Integer> numbers =
                Arrays.asList(40,333,22,1,10,20,30,40,50,60);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------");

        numbers.stream()
                .skip(2)
                .limit(4)
                .forEach(System.out::println);
    }
}
