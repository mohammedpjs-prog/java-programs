import java.util.LinkedList;
public class LinkedListMethods {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.add("Hafeez");
        names.add("Rizwan");
        names.add("Imran");

        names.addFirst("Musaib");
        names.addLast("Jilan");
        System.out.println(names);
        System.out.println(names.get(2));
        names.remove("Musaib");
        System.out.println(names);
        System.out.println(names.contains("Musaib"));

        //Second linkedlist

        LinkedList<String> name = new LinkedList<>();
        name.addAll(names);
        System.out.println("this is a second linkedlist : "+name);
        System.out.println(name.get(1));
        names.remove("Jilan");
        System.out.println(name);
        System.out.println(names.contains("Jilan"));

    }
}
