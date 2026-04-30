public class StringMethod {
    public static void main(String[] args){
        String s = "  Java programming  ";

        System.out.println(" Originol : " + s);

        System.out.println(" Length : " + s.length());

        String trimmed = s.trim();
        System.out.println(" Trimmed : " + trimmed );

        System.out.println(" Upper case : "+ trimmed.toUpperCase());

        System.out.println(" Lower case : " + trimmed.toLowerCase());

        System.out.println(" Replaced : "+ trimmed.replace("java","python"));

        System.out.println(" Contains : " + trimmed.contains(" python "));


    }
}
