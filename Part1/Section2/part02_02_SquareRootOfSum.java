package Part1.Section2;
import java.util.Scanner;
public class part02_02_SqaureRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Enter second number:");
        int second = Integer.valueOf(scan.nextLine());
        double squareRoot = Math.sqrt(first + second);
        System.out.println(squareRoot);

    }
}
