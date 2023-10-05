package Part1.Section2;

import java.util.Scanner;

public class part02_05_CarryOn {

        public static void main(String[] args) {

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Shall we carry on?");
                String input = scanner.nextLine();
                if (input.equals("No")) {
                    break;
                }
                System.out.println("Ready!");

            }
        }
    }

