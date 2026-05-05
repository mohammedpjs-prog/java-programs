abstract class Creation {
     abstract void Draw();
}
class Cone  extends Creation{
    void Draw(){
        System.out.println(" Drawing cone ");
    }
}
class Cube extends Cone{
    void Draw(){
        System.out.println(" Drawing cube ");
    }
}
class Square extends Cube{
    void Draw(){
        System.out.println(" Drawing square ");
    }
    public static void main(String[] args){
        Creation c = new Square();
        c.Draw();
        Creation c2 = new Cone();
        c2.Draw();
        Creation c3 = new Cube();
        c3.Draw();

    }
}

