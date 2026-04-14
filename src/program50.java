public class program50 {
    public static void main(String[] args){
        String intput = "age12years2206";
        String number = intput.replaceAll("[^0-9]"," ");
        String [] nums = number.trim().split("\\s+");

        for (String num : nums){
            System.out.println(Integer.parseInt(num));
        }
    }
}
