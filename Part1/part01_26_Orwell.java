package Part1;

import java.util.Scanner;
public class part01_26_Orwell {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, if it is correct, the console will read -- Orwell --");
        int input = Integer.valueOf(scan.nextLine());
        if (input == 1984) {
            System.out.println("Orwell");
        } else {
            System.out.println(input);
        }
    }
}
