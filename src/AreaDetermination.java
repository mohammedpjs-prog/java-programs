public class AreaDetermination {
    public static void main(String[] args) {
        Shape Circle = new Circle(5);
        System.out.println(" Circle area : " + Circle.calculateArea());
        Shape r = new Rectangle(12.0, 3.0);
        System.out.println(" Rectangle area : " + r.calculateArea());
        Shape t = new Triangle(4.5, 5.6);
        System.out.println(" Triangle area : " + t.calculateArea());
    }
}
