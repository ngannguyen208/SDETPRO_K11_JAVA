package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {

    public static void main(String[] args) {
        int randomNumber = new SecureRandom().nextInt(10);
        int guessingTime = 0;

        System.out.println("randomNumber: " + randomNumber);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int userNum = scanner.nextInt();

            if (userNum == randomNumber) {
                System.out.println("Hooray!");
                break;
            }

            guessingTime++;
        } while (guessingTime < 3);

        if (guessingTime == 3) {
            System.out.println("Chuc ban may man lan sau!");
        }
    }
}
