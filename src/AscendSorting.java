import java.util.Arrays;
public class AscendSorting {
    public static void main(String[] args){
        int []arr = {4,55,12,33,21};
        Arrays.sort(arr);


        for (int i = 0;i<args.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
