public class signal {
    public static void main(String[] args){
        int signal = 4;
        String color = switch (signal){
            case 1 -> {
                System.out.println("Stop signal");
                yield "red";  // must yield a value here
            }
            case 2 -> {
                System.out.println("Caution signal");
                yield "yellow";
            }
            case 3 -> {
                System.out.println("Go signal");
                yield "green";
            }
            default -> "invalid";
        };
    }
}
