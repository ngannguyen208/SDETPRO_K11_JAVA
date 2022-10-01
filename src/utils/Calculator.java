package utils;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Calculator {

    // Mechanism
    // Overloading: Same class, Compile time
    // Overriding: Inheritance(OOP), Run time

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(String num1, int num2) {
        return 0;
    }

    public static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int... nums){
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    public static int sum(String a, int... nums) {
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    // [1, 2, 3, 4, 5]


    // Vararg | Rest parameters
    public static void main(String... args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum("1, 2", 3));
    }
}
