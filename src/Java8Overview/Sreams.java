package Java8Overview;
import java.util.Arrays;
import java.util.List;
public class Sreams {
    public static void main(String[] args){
        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,434,2,4,566,4,3,2,33,44,5,6,55,7712345);
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("----------------");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println(".................");
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("----------------");
        long count =
                list.stream().count();
        System.out.println(count);
        System.out.println("------------------");




    }
}
