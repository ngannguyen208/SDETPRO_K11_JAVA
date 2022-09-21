package lesson_3;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[ARRAY_LENGTH];

        // Iterate
        for (int index = 0; index < 5; index++) {
            myIntArray[index] = index;
        }

        // Print out values
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            System.out.println(myIntArray[index]);

        }
    }
}
