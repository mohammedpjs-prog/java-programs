public class program16 {
    public static void numberinword(int num){
        switch (num){
            case 0:System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("OTHER");

        }
    }
    public static void main(String[] args){
        numberinword(4);
        numberinword(9);

    }
}
