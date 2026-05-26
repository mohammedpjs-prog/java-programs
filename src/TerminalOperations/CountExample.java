package TerminalOperations;
import java.util.List;
import java.util.Arrays;
public class CountExample {
    public static void main(String[] args){
        List<String>names =
                Arrays.asList("Rizwan","Rehan","Ayan","rahil");
        long count =
              names.stream()
                .filter(n-> n.startsWith("r"))
                .count();
        System.out.println(count);

    }
}
