package Part1.Section2;
import java.util.Scanner;
public class part02_01_Squared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        int sum = num * num;
        System.out.println("your number squared is " + sum);
    }
}
