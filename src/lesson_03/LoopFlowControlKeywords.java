package lesson_03;

public class LoopFlowControlKeywords {

    public static void main(String[] args) {
        // continue --> bỏ giá trị index = 3 sau đó tiếp tục số sau
        /*
        for (int index = 0; index < 10; index++) {
            if (index == 3) {
                continue;
            }
            System.out.println(index);
        } */

        // break --> đến < 3 stop
        for (int index = 0; index < 10; index++) {
            if (index == 3) {
                break;
            }
            System.out.println(index);
        }
    }
}
