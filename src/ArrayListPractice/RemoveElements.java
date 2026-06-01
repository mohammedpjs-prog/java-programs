package ArrayListPractice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args){
        List<String >fruits =
                new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");

        fruits.remove("banana");
        System.out.println(fruits);
    }
}
