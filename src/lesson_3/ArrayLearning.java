package lesson_3;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[ARRAY_LENGTH];

        // Iterate
        for (int index = 0; index < 5; index++) {
            myIntArray[index] = index + 1;
        }

        // Print out values -- vòng lặp theo chỉ số
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            System.out.println(myIntArray[index]);
        }

        // Inhand for??
        for (int value : myIntArray) {
            System.out.println(value);
        }

        // Revert ...
        for (int array_length = ARRAY_LENGTH - 1; array_length >= 0; array_length--) {
            System.out.println(myIntArray[array_length]);
        }
    }
}
