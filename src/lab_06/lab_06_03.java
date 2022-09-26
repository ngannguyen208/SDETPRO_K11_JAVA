package lab_06;

import java.util.Scanner;

public class lab_06_03 {
    public static void main(String[] args) {
        /*
         * String myStr = "100 minutes";
         * NOT using REGEX, extract digit character from that String
         * Expected output: "100".
         * EX: "12345nabc678" -> "12345678"
         */

        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = "";
        char[] charArr = inputString.toCharArray();

        for (char character : charArr) {
            if (Character.isDigit(character)) {
                result = result + character;
            }
        }
        System.out.println("The result is: " + result);


    }
}
