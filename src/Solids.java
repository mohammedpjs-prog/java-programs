public interface Solids {
    double area();
    double perimeter();
}
class CIrcle implements Solids{
    double radius;

    CIrcle(double radius){
        this.radius=radius;

    }
    public double area(){
        return Math.PI  * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
class triagle implements Solids{
    double base, height;
    double s1, s2, s3;

    triagle(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double area(){
        return (base * height)/2;
    }
    triagle(double s1,double s2,double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public double perimeter(){
        return s1+s2+s3;
    }
}