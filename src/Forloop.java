import java.text.MessageFormat;

public class Forloop {
    public static void main(String[]args){
        for( int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (double rate = 2.0; rate <= 5; rate++){
            double intrestamount = calintrest(10000.0, rate);
            System.out.println(MessageFormat.format(" 10,000 {0} % intrest is: {1}", rate, intrestamount));
        }

        for (double i = 7.5; i <= 10; i+=0.25 ){
            double intrestamount = calintrest(100.00,i);
            System.out.println(" $100.00 "+ i + " intrest is : " + intrestamount);
        }
    }


    public static double calintrest(double inrest , double rate){
        return (inrest *(rate/ 100));
    }
}
