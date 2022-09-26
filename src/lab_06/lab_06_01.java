package lab_06;

import java.util.Scanner;

public class lab_06_01 {
    public static void main(String[] args) {
        /*
        * Given input string: "2hrs and 5 minutes"
        * Please calculate how many minutes in total
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Please enter minutes: ");
        int minutes = scanner.nextInt();

        change(hours, minutes);

    }

    public static void change(int h, int m) {
        int minute;
        minute = (h * 60) + m;
        System.out.printf("The number of minutes after switching from %d hours %d minutes is: %d minutes", h, m, minute);
    }
}
