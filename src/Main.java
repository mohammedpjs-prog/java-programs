
    public class Main {

        static void greet() {
            System.out.println("Welcome!");
        }

        static int add(int x, int y) {
            return x + y;
        }

        public static void main(String[] args) {
            greet();  // calling method

            int sum = add(10, 20);
            System.out.println("Sum: " + sum);

        }
    }
