package lab_06;

import java.security.SecureRandom;
import java.util.Scanner;

public class lab_06_02 {
    public static void main(String[] args) {
        /*
         * String myPassword = "password123";
         * Allow user to input maximum 3 times
         */
        String myPassword = "password123";
        int countTime = 0;

        while (countTime < 3) {
            System.out.print("Please enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String passWord = scanner.nextLine();
            if (passWord.equals(myPassword)) {
                System.out.println("Password is correct!");
                break;
            } else {
                System.out.println("Wrong password. Please enter password again!");
            }
            countTime++;
        }
        if (countTime == 3) {
            System.out.println("You have entered the wrong password 3 times!");
        }
    }
}
