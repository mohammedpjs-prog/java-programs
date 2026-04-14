public class program49 {
    public static void main(String[] args){
        String intput = "12r";
        try {
            int num = Integer.parseInt(intput);
            System.out.println(" Parsed value : "+num);
        }catch (NumberFormatException e ){
            System.out.println(" invalid number format ");

        }
    }
}
