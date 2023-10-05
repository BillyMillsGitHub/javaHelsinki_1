package Part1;
import java.util.Scanner;

public class part01_21_AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double second = Double.valueOf(scanner.nextLine());
        double sum = (double) (first + second) / 2;
        System.out.println("The average is " + sum);



    }

}
