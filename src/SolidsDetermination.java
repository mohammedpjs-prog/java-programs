public class SolidsDetermination {
    public static void main(String[] args){
        Solids c = new CIrcle(22);
        System.out.println(" Circle area : "+ c.area());
        System.out.println(" Perimeter of circle : "+c.perimeter());
        Solids t = new triagle(13.0,11.0);
        Solids t2 = new triagle(1.0,2.0,3.0);
        System.out.println(" Area of triangle : "+ t.area());
        System.out.println(" Perimeter of triangle : "+ t2.perimeter());
    }
}