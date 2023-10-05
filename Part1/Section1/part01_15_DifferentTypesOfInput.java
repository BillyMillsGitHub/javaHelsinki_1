package Part1;
import java.util.Scanner;
public class part01_15_DifferentTypesOfInput {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String word = String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean");
        boolean eval = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the String " + word);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + value);
        System.out.println("You gave the boolean " + eval);
    }
}
