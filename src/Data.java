public class Data <T>{
     T value;
     Data(T value){
         this.value=value;
     }
     void show(){
         System.out.println(value);
     }
     public static void main(String[] args){
         Data<String> d1 = new Data<>("java");
         Data<Integer> d2 = new Data<>(11);
         d1.show();
         d2.show();
     }
}
