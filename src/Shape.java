public interface Shape {
    double calculateArea();

}
class Circle implements Shape {
    double radius;

    Circle( double radius){
        this.radius=radius;

    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Triangle implements Shape {
        double base, height;

        Triangle(double base, double height){
            this.base=base;
            this.height=height;
        }
        public double calculateArea(){
            return 0.5 * base * height;
        }
}



