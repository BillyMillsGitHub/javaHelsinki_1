package Part1.Section2;
import java.util.Scanner;
public class part02_03_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an input:");
        int num = Integer.valueOf(scanner.nextLine());
        int minus = num * 1;
        if (num < 0) {
            System.out.println(minus);
        } else if (num > 0) {
            System.out.println(num);
        }
    }
}
