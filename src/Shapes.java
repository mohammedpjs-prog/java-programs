public interface Shapes {
    double calculatePerimeter();
}
class circle implements Shapes{
    double radius;

    circle(double radius){
        this.radius=radius;
    }
    public double calculatePerimeter(){
        return 2* Math.PI * radius;
    }
}
class rectangle implements Shapes{
    double length , width;

    rectangle(double length,double width){
        this.length=length;
        this.width=width;

    }
    public double calculatePerimeter(){
        return 2 * (length * width);
    }
}