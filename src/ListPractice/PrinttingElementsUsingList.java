package ListPractice;
import java.util.Arrays;
import java.util.List;
public class PrinttingElementsUsingList {
    public static void main(String[] args){
        List<String> names =
                Arrays.asList("A","R","I");
        for ( String name : names){
            System.out.println(name);
        }
    }
}
