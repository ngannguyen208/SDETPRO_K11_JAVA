package lab_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class lab_3_2 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter number of element in array: ");
            int arrayLength = scanner.nextInt();

            int[] a = new int[arrayLength];

            int minNum = a[0];
            int maxNum = a[0];

            for (int i = 0; i < arrayLength; i++) {
                a[i] = new SecureRandom().nextInt(100);
            }
            System.out.println("Random Array: " + Arrays.toString(a));

            for (int i = 1; i < arrayLength; i++)
            {
                if (a[i] < minNum) {
                    minNum = a[i];
                }
                if (a[i] > maxNum) {
                    maxNum = a[i];
                }
            }

            System.out.println("The minimum number in the array is " + minNum);
            System.out.println("The maximum number in the array is " + maxNum);
        }
    }
}
