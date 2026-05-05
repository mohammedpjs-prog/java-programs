abstract class Animals {
    Animals(){

    }
    abstract void sound();
}
class Ddgs extends Animals{
    void sound(){
        System.out.println(" makes sound like barking ");
    }
}