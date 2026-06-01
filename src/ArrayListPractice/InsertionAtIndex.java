package ArrayListPractice;
import java.util.ArrayList;
public class InsertionAtIndex {
    public static void main(String[] args){
        ArrayList<String> cities =
                new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add(1,"Bamgalore");
        System.out.println(cities);
    }
}
