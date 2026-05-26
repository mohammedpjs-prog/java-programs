package TerminalOperations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class FindFIrstExample {
    public static void main(String[] args){
        List<String>names =
                Arrays.asList("ayan","rehan","rahil");
        boolean result =
                names.stream().parallel()
                        .anyMatch(n -> n.equals("Rehan"));
        System.out.println(result);
    }
}
