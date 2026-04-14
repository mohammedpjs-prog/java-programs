public class program51 {
    public static void main(String[] args){
        int currentyear = 2026;

        System.out.println(getinputfromconsole(currentyear));
        System.out.println(getinputfromscanner(currentyear));
    }
    public static String getinputfromconsole(int currentyaar){

        String name = System.console().readLine(" Hi, what's your name ");
        System.out.println(" Hi " +name+" thank you for visiting");
        return "";
    }
    public static String getinputfromscanner(int currentyear){
        return "";
    }

}
