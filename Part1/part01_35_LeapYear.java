package Part1;
import java.util.Scanner;
public class part01_35_LeapYear {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        if (year % 4 == 0 && year % 400 == 0 && year % 100 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0 && year % 400 != 0 && year % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 != 0 && year % 400 == 0 && year % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year");
        } else if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        }
    }
}
