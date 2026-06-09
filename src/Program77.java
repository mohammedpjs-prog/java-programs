import java.util.HashMap;
public class Program77 {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Ali",10);
        map.put("Ali",20);

        System.out.println(map.get("Ali"));
    }
}
