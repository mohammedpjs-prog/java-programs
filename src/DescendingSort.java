import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args){

        Integer[]arr ={11,4,22,55,3,7};

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
