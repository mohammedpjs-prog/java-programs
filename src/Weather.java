public class Weather {
    public static void main(String[] args){
        int temperature = 10;

        if (temperature > 35) {
            System.out.println("It's hot outside.");
        } else if (temperature >= 25) {
            System.out.println("The weather is warm.");
        } else if (temperature >= 15) {
            System.out.println("It's a bit chilly.");
        } else {
            System.out.println("It's cold! Wear a jacket.");
        }

        int newvalue =50;
        if (newvalue == 50){
            System.out.println(newvalue +" " +"no error in the code");
            int num= 77;
            System.out.println(num +(num % 2 == 0 ? "is even": "is odd"));
        }
    }
}
