import java.util.Arrays;
import java.util.List;
public class program70 {
    public static void main(String[] args){
        List<String>names =
                Arrays.asList("java","python","spring");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("----------------");
        List<String> name =
                Arrays.asList("Alex", "Bob", "Ankit");

        name.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);


    }
}
