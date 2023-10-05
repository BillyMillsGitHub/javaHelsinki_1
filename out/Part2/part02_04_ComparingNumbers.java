package Part1.Section2;
import java.util.Scanner;
public class part02_04_ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        int second = Integer.valueOf(scanner.nextLine());
        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (second > first) {
            System.out.println(first + " is smaller than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }
}
