public class Switchpractice2 {
    public static void main(String [] args){
        int signal = 9;
        String color = switch (signal){
          case 1 -> "red";
          case 2 -> "yellow ";
          case 3 -> " greem ";
            default -> "invalid";
        };
        System.out.println(color);

    }
}
