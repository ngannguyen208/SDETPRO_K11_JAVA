package lesson_03;

public class ArrayDeclarationException {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{1, 2, 'a'};

        for (int value : myIntArr) {
            System.out.println(value);
        }
    }
}
