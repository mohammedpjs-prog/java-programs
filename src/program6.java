public class program6 {
    public static void main(String[] args){
        System.out.println("5ft,8in "+ convertTocentimeters(5,8)+" cm ");
        System.out.println("68in = "+ convertTocentimeters(68)+" cm ");

    }
    public static double convertTocentimeters(int inches){

        return inches*2.54;
    }
    public static double convertTocentimeters(int feet,int inches){

        return ((feet * 12) + inches ) * 2.54;
    }
}
