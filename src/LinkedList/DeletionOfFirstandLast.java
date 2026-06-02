package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;

public class DeletionOfFirstandLast {
    public static void main(String[] args){
        LinkedList<String>list =
                new LinkedList<>();
        list.add("java");
        list.add("Python");
        list.add("Spring");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
