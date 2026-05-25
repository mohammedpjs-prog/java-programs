import java.util.Arrays;
import java.util.List;

public class Program69 {
    public static void main(String[] args){
        List<Integer> num =Arrays.asList(1,2,3,4,6,8,10);
        num.stream()
                .filter(n -> n >10)
                .forEach(System.out::println);

        num.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


    }
}
