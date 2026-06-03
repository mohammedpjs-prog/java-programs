package Java8Overview;
import java.util.Arrays;
import java.util.List;
public class LambdaExpression {
    public static void main(String[] args){
        List<String > names = Arrays.asList("Imran","rahil","Rehan");
        names.forEach(name -> System.out.println(name));
    }
}
