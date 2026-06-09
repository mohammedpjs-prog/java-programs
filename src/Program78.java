import java.util.HashMap;
public class Program78 {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ali");
        map.put(2,"rahil");
        map.put(143,"ayan");
        map.put(3,"rehan");

        System.out.println(map);
        System.out.println("Value of key 1: " + map.get(1));
    }

}
