abstract class vehicles {
    String brand;
     vehicles(String brand){
         this.brand=brand;
     }
     abstract void start();

     void showbrand(){
         System.out.println(" Brand : "+brand);
     }
     final  void fueltype(){
         System.out.println(" Uses fuel");
     }
     static  void catogory(){
         System.out.println(" Transport vehicle ");
     }
}
class carr extends vehicles{
    carr(String brand){
        super(brand);
    }
    void start(){
        System.out.println(" start with a key ");
    }
}
