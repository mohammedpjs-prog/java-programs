package Functionalinterfaces;
import java.util.function.Predicate;
public class PracticeOne {
    public static void main(String[] args){
        Predicate<Integer> isEligible = age -> age >=18;
        int age = 2;
        if (isEligible.test(age)){
            System.out.println("You are eligible for DL");
        }else {
            System.out.println("You are not eligible");
        }


    }
}
