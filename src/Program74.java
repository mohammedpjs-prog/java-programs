import java.util.HashSet;
public class Program74 {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("kiwi");
        System.out.println("set: "+fruits);
        System.out.println("Contains mango: "+ fruits.contains("mango"));
        fruits.remove("banana");
        System.out.println("After removal: "+fruits);
        System.out.println("Size: "+fruits.size());

    }
}

