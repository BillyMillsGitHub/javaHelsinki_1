package Part1;
import java.util.Scanner;
public class part01_08_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }

}
