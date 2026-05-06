import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args){
        int [] arr = new int [5];
        for (int i =0; i < arr.length; i++){
            arr [i]= (i + 1)* 10;
        }
        System.out.println(" Array elements : ");
        for (int values : arr ){
            System.out.println(values+" ");

        }
        int key = 30;
        int index = Arrays.binarySearch(arr,key);

        if (index>=0){
            System.out.println("\nElement found " + key + " at index "+ index );
        }else {
            System.out.println("\nNot found :( ");
        }
    }

}
