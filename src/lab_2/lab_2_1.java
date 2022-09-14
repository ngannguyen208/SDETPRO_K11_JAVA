package lab_2;

import java.util.Scanner;

public class lab_2_1 {
    public static void main(String[] args) {
        double weight, height, BMI;
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input Weight (kg): ");
        weight = scanner.nextDouble();

        System.out.println("Please input Height (m): ");
        height = scanner.nextDouble();

        BMI = weight / (height * height);
        System.out.printf("Your BMI is %.1f\n", BMI);

        if (BMI < 18.5) {
            result = "You are Underweight!";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "Your body is Normal Weight!";

        } else if (BMI >= 25 && BMI <= 29.9) {
            result = "You are Overweight";
        } else {
            result = "You are Obesity";
        }
        System.out.println(result);
    }
}
