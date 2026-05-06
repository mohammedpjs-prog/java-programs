import java.util.Arrays;
public class ArrayFill {
    public static void main(String[] args){
        int[]arr= new int [5];

        Arrays.fill(arr,1,4,7);

        System.out.println(Arrays.toString(arr));
    }
}
