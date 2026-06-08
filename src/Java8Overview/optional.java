package Java8Overview;

import java.util.Optional;

public class optional {
    public static void main(String[] args){
        Optional<String > name =
                Optional.ofNullable("Rehan");
        System.out.println(name.orElse("No nmae"));
    }
}
