package Exception;
import java.io.*;
public class PracticeOne {
    static void readFile ()throws IOException{
        FileReader fr = new FileReader("abc.txt");
    }
    public static void main(String[] args)throws IOException{
        readFile();

    }
}
