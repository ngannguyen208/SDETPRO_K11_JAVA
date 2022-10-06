package lesson_09_01;

import java.util.ArrayList;
import java.util.List;

import static lesson_09_01.HouseWithBuilder.Builder;

public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
//        builder.setColor("Pink");
//        builder.setMainDoors(10);
//        builder.setWindows(1);

        // Method chaining
        builder
                .setColor("Pink")
                .setMainDoors(10)
                .setWindows(1);

        HouseWithBuilder house = builder.build();
        System.out.println(house.getColor());
        System.out.println(house.getMainDoors());
        System.out.println(house.getWindows());

        List<HouseWithBuilder> houseList = new ArrayList<>();
        houseList.add(house);
        houseList.add(house);
        houseList.add(house);
        houseList.add(house);

    }
}
