package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;

public class AdditionOfFirstandLast {
    public static void main(String[] args){
        LinkedList<String> list =
                new LinkedList<>();
        list.addFirst("java");
        list.add("Python");
        list.addLast("spring");


        System.out.println(list);
    }
}
