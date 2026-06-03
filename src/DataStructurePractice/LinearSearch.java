package DataStructurePractice;

public class LinearSearch {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};

        int target = 40;
        boolean found = false;

        for (int num : arr ){
            if (num == target){
                found = true;
                break;
            }

        }
        System.out.println(found);
    }
}
