package lab_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class lab_3_1 {
    public static void main(String[] args) {
        {
            int arrayLength, i;
            int evenCount = 0, oddCount = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter number of element in array: ");
            arrayLength = scanner.nextInt();
            int[] myIntArr = new int[arrayLength];

            for (i = 0; i < arrayLength; i++) {
                myIntArr[i] = new SecureRandom().nextInt(100);
            }
            System.out.println("Random Array: " + Arrays.toString(myIntArr));

            for(i = 0; i < arrayLength; i++)
            {
                if(myIntArr[i] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
            System.out.println("Total number of even numbers in array = " + evenCount);
            System.out.println("Total number of odd  numbers in array = " + oddCount);
        }
    }
}
