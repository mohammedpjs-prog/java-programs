package Test;
import java.util.function.Predicate;
public class Main2 {
    public static void main(String[] args){
        Predicate<String>checklength =
                str -> str.length()>5;
        System.out.println(checklength.test("java"));
        System.out.println(checklength.test("Functional"));
        System.out.println();
    }
}
