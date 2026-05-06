import java.util.ArrayList;
import java.util.List;
public class ListPractice {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add(" Rahul ");
        names.add(" Imran ");
        names.add(" Rohit ");
        for (String name : names){
            System.out.println(name);
        }

    }
}
