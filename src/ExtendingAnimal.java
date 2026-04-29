public class ExtendingAnimal {
    void eat(){
        System.out.println(" Animal eats food ");
    }
    void sound(){
        System.out.println(" Animal makes sounds ");
    }
}
class D extends ExtendingAnimal{
    void sound(){
        System.out.println(" Dogs barks ");
    }
}
class Cat extends ExtendingAnimal{
    void sound(){
        System.out.println(" Cat meow ");
    }
}
