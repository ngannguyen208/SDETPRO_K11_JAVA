package lesson_2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input arrival time: ");
        int arrivalTime = scanner.nextInt();

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        //Comparison operators: ==, !=, >, <, >=, <=
        boolean isHeOnTime = arrivalTime == 7 ? true : false;
        if (isHeOnTime) {
            System.out.println("\t --> Let's talk!");
        } else {
            System.out.println("\t --> Write a letter!");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay xe nha");
    }
}
