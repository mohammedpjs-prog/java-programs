package ArrayListPractice;
import java.util.ArrayList;
public class Replacing {
    public static void main(String[] args){
        ArrayList<String>lang =
                new ArrayList<>();
        lang.add("Java");
        lang.add("Python");
        lang.set(1,"Spring");
        System.out.println(lang);
    }
}
