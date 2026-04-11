public class program13 {
    public static final int INVALID_VALUE= -1;
    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        } else {
            return radius * radius * Math.PI;
        }
    }
    public static double area(double x,double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }else {
            return x * y;
        }

        }
        public static void main(String[] args){
            System.out.println(area(2.3));
            System.out.println(area(4.5,5.6));
            System.out.println(area(3));
            System.out.println(area(3,4));
            System.out.println(area(5));
            System.out.println(area(4,6));
        }
}
