package utils;

import java.util.Arrays;

public class Calculator {

    // Overlaoding: Same class, Compile time
    // Overriding: Inheritance(OOP), Run time

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(String num1, int num2) {
        return 0;
    }

    public static int sum(int... nums){
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    // Vararg | Rest parameters
    public static void main(String... args) {
        System.out.println(sum(1,2));
        System.out.println(sum("1, 2", 3));
    }
}
