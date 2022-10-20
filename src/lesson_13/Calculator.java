package lesson_13;

public class Calculator {

    public static int divide(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            int result = Calculator.divide(a, b);
            System.out.printf("The result is: %d\n", result);

        } catch (ArithmeticException e) {
//            System.out.println("The second number can't be zero!");
            throw new IllegalArgumentException("The second number can't be zero!");
        }

        //System.out.printf("The result is: %d\n", result);
        System.out.println("Bye!");
    }
}
