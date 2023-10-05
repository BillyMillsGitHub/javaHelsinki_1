package Part1.Section2;
import java.util.Scanner;

public class part02_06_AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 4) {
                break;
            }
            System.out.println("You input " + command);
        }
        System.out.println("Done, thank you!");
    }
}

