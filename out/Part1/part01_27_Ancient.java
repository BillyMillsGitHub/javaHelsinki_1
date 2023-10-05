package Part1;
import java.util.Scanner;
public class part01_27_Ancient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 2015) {
            System.out.println("Ancient History!");
        } else {
            System.out.println(num);
        }
    }
}
