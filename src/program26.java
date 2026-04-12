public class program26 {
    public static void checkoddoreven(int num) {
         int ecount = 0;
        int ocount = 0;
        if (num % 2 == 0) {
            System.out.println("even");
            ecount++;
        } else {
            System.out.println("odd");
            ocount++;
        }
    }
    public static void main(String[] args){
        checkoddoreven(87);
    }
}


