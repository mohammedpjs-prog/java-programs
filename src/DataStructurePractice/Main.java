package DataStructurePractice;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<String > courses =
                new ArrayList<>();
        courses.add("java");
        courses.add("python");
        courses.add("spring");

        System.out.println(courses);
        System.out.println(courses.get(1));
        courses.remove(1);
        System.out.println(courses);
    }

}
