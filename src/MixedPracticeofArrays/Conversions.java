package MixedPracticeofArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Conversions {
    public static void main(String[] args){
        String []arr =
                {"java","python","spring"};
        List<String> list =
                new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);


    }
}
