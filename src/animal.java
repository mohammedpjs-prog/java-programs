abstract class animal {
    abstract void sound();
    void eat(){
        System.out.println(" this animal eats ");
    }

}
class DOG extends animal{
     void sound(){
        System.out.println(" Dog barks ");
    }
    public static void main(String[] args){
         DOG d = new DOG();
         d.sound();
         d.eat();
    }
}