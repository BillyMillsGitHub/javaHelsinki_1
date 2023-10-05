package Part1;

import java.util.Scanner;
public class part01_24_SpeedingTicket {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scan.nextLine());
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        } else {
            System.out.println(speed);
        }
    }
}
