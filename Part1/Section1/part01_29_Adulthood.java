package Part1;
import java.util.Scanner;
public class part01_29_Adulthood {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        if (age < 18) {
            System.out.println("You are not an adult");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        }
    }
}
