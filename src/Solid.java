abstract class Solid {
    void display(){
    }
    abstract double calarea();
}
class Circlee extends Solid{
    double radius;

    Circlee(double radius){
        this.radius=radius;
    }
    double calarea(){
        return Math.PI * radius * radius;
    }
}
class Rectanglee extends Solid{
    double lenght , width;
    Rectanglee(double l, double w){
        lenght=l;
        width=w;
    }
    double calarea(){
        return lenght * width;
    }
}

