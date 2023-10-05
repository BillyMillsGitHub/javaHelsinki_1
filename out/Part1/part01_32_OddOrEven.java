package Part1;
import java.util.Scanner;
public class part01_32_OddOrEven {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even.");
        } else if (num % 1 == 0) {
            System.out.println("Number " + num + " is odd.");
        }
    }
}
