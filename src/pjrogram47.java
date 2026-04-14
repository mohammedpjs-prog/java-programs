public class pjrogram47 {
    public static void main(String[] args){
        String csv = " max,21,67779.9";

        String[] parts = csv.split(",");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        double salary = Double.parseDouble(parts[2]);

        System.out.println(" My name is " + name + ". I am " + age + " years old "+". My salary is "+salary);

    }
}
