package Part1.Section2;
import java.util.Scanner;
public class part02_09_NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (input == 0) {
                break;
            }
            if (input < 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
