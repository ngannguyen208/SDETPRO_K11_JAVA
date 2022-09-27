package lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        // CRUD | Create, Read, Update, Delete
        /* INSERT
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(5);

        // 1, 2, 4
        int insertedIndex = 2;
        int insertedValue = 3;
        myList.add(insertedIndex, insertedValue);

        myList.set(3, 4);
        System.out.println(myList);
        */

        // REMOVE
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        System.out.println("Before removing: " + myList);
        myList.remove(new Integer(2));
        System.out.println("After removing: " + myList);

        // Is empty or not




        /*
        System.out.println(myList);
        // Example
        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        for (Integer value : myList) {
            System.out.println(value);
        }
        */

    }

}
