public class program9 {
    public static boolean areEqualbythreedecimalplaces(double a,double b){
        long arounded = (long) (a * 1000);
        long brounded = (long) (b * 1000);
        return arounded == brounded;
    }
    public static void main(String[] args){
        System.out.println(areEqualbythreedecimalplaces(8.8,9.0));
        System.out.println(areEqualbythreedecimalplaces(10.0,20.00));
        System.out.println(areEqualbythreedecimalplaces(100.0,100.0));
        System.out.println(areEqualbythreedecimalplaces(8.0,8.0));
    }
}
