public interface AutoMobile {
    void start();
    default void fueltype() {
    }
}
class Motorcycle implements AutoMobile{
    public void start(){
        System.out.println(" Motorcyle starts with key... ");
    }
}
class ElectricCar implements AutoMobile{
    public void start(){
        System.out.println(" Start with a button... ");
    }

     public void fueltype(){
    System.out.println(" Usess electricity... ");
    }
}
