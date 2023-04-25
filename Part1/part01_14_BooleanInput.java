package Part1;
import java.util.Scanner;
public class part01_14_BooleanInput {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
    }


}
