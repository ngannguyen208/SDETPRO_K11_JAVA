package lab_2;

import java.util.Scanner;

public class lab_2_3 {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input Weight (kg): ");

        weight = scanner.nextDouble();

        System.out.print("Please input Height (m): ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.printf("Your BMI is %.1f\n", bmi);

        if (bmi < 18.5) {
            double increaseWeight_min = (18.5 - bmi) * (height * height);
            double increaseWeight_max = (24.9 - bmi) * (height * height);
            System.out.println("You are Underweight!");
            System.out.printf("You should increase from %.1f(kg) to %.1f(kg)", increaseWeight_min, increaseWeight_max);

        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are Normal Weight");
            System.out.println("Your body is in balance!");

        }
        else if (bmi >= 25 && bmi <= 29.9) {
            double decreaseWeight_min = (bmi - 18.5) * (height * height);
            double decreaseWeight_max = (bmi - 24.9) * (height * height);
            System.out.println("You are Overweight");
            System.out.printf("You should decrease from %.1f(kg) to %.1f(kg)",decreaseWeight_max, decreaseWeight_min);

        }
        else{
            double decreaseWeight_min = (bmi - 18.5) * (height * height);
            double decreaseWeight_max = (bmi - 24.9) * (height * height);
            System.out.println("You are Obesity");
            System.out.printf("You should decrease from %.1f(kg) to %.1f(kg)",decreaseWeight_max, decreaseWeight_min);

        }
    }
}
