import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class program71 {
    public static void main(String[] args){
        List<Integer>list = Arrays.asList(1,2,34,5,6,7,8);
        List<Integer> result = list.stream()
                .filter(n -> n>3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
