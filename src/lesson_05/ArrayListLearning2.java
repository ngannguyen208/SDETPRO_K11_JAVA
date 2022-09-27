package lesson_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearning2 {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);

        // Get 3 smallest number --> Expected output: [1, 1, 2]
        // Ham Set --> ascending & remove duplicate
        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);
        List<Integer> arrayListWithSet = new ArrayList<>(set);

        // Exclusive
        List<Integer> first3MinValues = arrayListWithSet.subList(0, 3); // lay 3 phan tu thi dien so 3
        System.out.println(first3MinValues);
    }
}
