package lab_03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class lab_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of element in array: ");
        int arrayLength = scanner.nextInt();
        int[] a = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            a[i] = new SecureRandom().nextInt(100);
        }
        System.out.println("Random Array: " + Arrays.toString(a));

        int temp = 0;
        System.out.println("The array sorted in ascending order is: ");
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);

        }
    }
}
