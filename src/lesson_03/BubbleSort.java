package lesson_03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArr = {2, 2, 7, 6, 34, 99, 8, 11};
        int unsortedPosition = myArr.length - 1;

        while (unsortedPosition > 0) {
            for (int i = 0; i < unsortedPosition; i++) {
                if (myArr[i] > myArr[i+1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i+1];
                    myArr[i+1] = temp;
                }
            }
            unsortedPosition--;
        }

        // 0(n) ?
        // Big0 notation | Time complexity | space complexity

        /*
         * tmp = arr[i]
         * arr[i] = arr[i+1]
         * arr[i+1] = tmp
         *
         */

    }

}
