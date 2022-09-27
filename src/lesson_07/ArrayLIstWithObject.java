package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstWithObject {

    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat meomeo = new RobotCat("Meomeo", 1);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

        System.out.println("RobotCat List size: " + robotCatList.size());
        robotCatList.get(robotCatList.size() - 1).setName("Doraemon");
        System.out.println(robotCatList.get(robotCatList.size() - 1).getName());

        System.out.println(robotCatList);
    }
}
