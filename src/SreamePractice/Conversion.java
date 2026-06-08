package SreamePractice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {
    public static void main(String[] args){
        List<String>names=
                Arrays.asList("ali","rehan","ayan","rahil","rehan");
        List<String> res = names.stream()
                .sorted()
                .distinct()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(res);


    }
}
