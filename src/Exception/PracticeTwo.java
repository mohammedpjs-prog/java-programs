package Exception;
import java.util.function.BiPredicate;
public class PracticeTwo {
    public static void main(String[] args){
        BiPredicate<Integer,Integer> greater =
                (a,b)-> a>b;
        System.out.println(greater.test(3,21));

    }
}
