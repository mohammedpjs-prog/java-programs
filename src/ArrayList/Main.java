package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list =new ArrayList<>();

        String[]names = {"hafeez","rizwan","imran"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        list.add("bilal");
        list.addAll(Arrays.asList("sufiyan","gowatham"));
        System.out.println(list);
        System.out.println("sufiyan is in the list " + list.contains("sufiyan"));
        System.out.println(list);
        list.removeIf(s -> s.charAt(0)=='s');
        System.out.println(list);
        System.out.println("sufiyan is in the list " + list.contains("sufiyan"));
    }
}
