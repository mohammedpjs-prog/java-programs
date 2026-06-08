package SreamePractice;
import java.util.Arrays;
import java.util.List;
public class CountMaxNumber {
    public static void main(String[] args){
        List<Integer> num =
                Arrays.asList(10,222,3,34,444);
        long count =num.stream()
                .filter(n->n>50)
                .count();
        System.out.println(count);
    }
}
