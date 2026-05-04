public class ShapesDetermination {
    public static void main(String[] args){
        Shapes c = new circle(2);
        System.out.println("Circle Perimeter : " + c.calculatePerimeter());
        Shapes r = new rectangle(22.3,44.5);
        System.out.println("Rectangle Perimeter : " +r.calculatePerimeter());
    }
}
