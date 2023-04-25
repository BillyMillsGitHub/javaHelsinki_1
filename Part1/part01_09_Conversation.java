package Part1;
import java.util.Scanner;
public class part01_09_Conversation {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        System.out.println("oh how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
