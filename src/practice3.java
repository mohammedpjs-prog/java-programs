public class practice3 {
    public static void checkevenodd(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is even ");
        }  else {
            System.out.println(num + " is odd ");
        }
    }
    public static void main(String[] args){
        int evencount = 0;
        int oddcount = 0;
        for(int i= 1; i<= 10; i++ ){
            checkevenodd(i);
            if (i % 2 == 0) {
                evencount++;
            }else {
                oddcount++;
                System.out.println(" total even numbers ; " + evencount);
                System.out.println(" total odd numbers : " + oddcount);

            }



        }

        }
    }


