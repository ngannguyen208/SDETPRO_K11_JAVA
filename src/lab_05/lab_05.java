package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_05 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (isContinuing) {
            System.out.println("===SIMPLE MENU===");
            printMenu();
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    addNumberIntoList(myList);
                    break;
                case 2:
                    printNumbers(myList);
                    break;
                case 3:
                    getMaximumNumber(myList);
                    break;
                case 4:
                    getMinimumNumber(myList);
                    break;
                case 5:
                    searchNumber(myList);
                    break;
                case 0:
                    isContinuing = false;
                    System.out.println("Thank you & Good bye!");
                    break;
                default:
                    System.out.println("Oh No! Please enter number from 1 to 6: ");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Add number into list");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("0. Exit!");
        System.out.println("--------------");
        System.out.print("Please enter number from 1 to 6: ");
    }

    public static void addNumberIntoList(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number to add into List: ");
        int lengthList = scanner.nextInt();
        System.out.println("Please enter number: ");
        for (int i = 0; i < lengthList; i++) {
            myList.add(i, scanner.nextInt());
        }
    }

    public static void printNumbers(List<Integer> myList) {
        System.out.println("List is: " +myList);
    }

    public static void getMaximumNumber(List<Integer> myList) {
        if(myList.isEmpty())
        {
            addNumberIntoList(myList);
        }
        int maximumNumber = myList.get(0);
        for (int value : myList) {
            if(maximumNumber < value) {
                maximumNumber = value;
            }
        }
        System.out.printf("The maximum number is %d\n",maximumNumber);
    }

    public static void getMinimumNumber(List<Integer> myList) {
        if(myList.isEmpty())
        {
            addNumberIntoList(myList);
        }
        int minimumNumber = myList.get(0);
        for (int value : myList) {
            if(minimumNumber > value) {
                minimumNumber = value;
            }
        }
        System.out.printf("The minimum number is %d\n",minimumNumber);
    }

    public static void searchNumber(List<Integer> myList) {
        System.out.print("Please enter a number to search: ");
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();
        int index = myList.indexOf(searchNum);

        if (myList.isEmpty()) {
            System.out.println("Sorry! No Array List!");
        } else if (index < 0) {
                System.out.println("Sorry! The number not in the Array List");
            } else {
                System.out.println(+searchNum+ " found in " +index + " position in array");
            }
    }

}
