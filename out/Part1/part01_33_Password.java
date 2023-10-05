package Part1;
import java.util.Scanner;
public class part01_33_Password {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String password = scan.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        }
    }
