package lab_2;

import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even number!");
        }
        else {
            System.out.println(n + " is odd number");
        }
    }
}
