package MixedPracticeofArrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> map =
                new HashMap<>();
        map.put(1,"java");
        map.put(11,"python");
        map.put(3,"spring");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(11));
        System.out.println(map.get(3));

    }
}
