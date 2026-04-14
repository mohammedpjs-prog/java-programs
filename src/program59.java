import java.util.Scanner;

public class program59 {
    public static void main(String[] args){
        Scanner sc = new Scanner("a,d,f,g,h,");
        sc.useDelimiter(",");

        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
