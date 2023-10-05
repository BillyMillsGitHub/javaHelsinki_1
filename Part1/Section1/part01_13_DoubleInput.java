package Part1;

import java.util.Scanner;
public class part01_13_DoubleInput {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + number);

    }

}
