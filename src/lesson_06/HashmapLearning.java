package lesson_06;

import java.util.HashMap;
import java.util.Map;

public class HashmapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");

        for(Integer key : emergencyList.keySet()) {
            //System.out.println(emergencyList.get(key));

            //C1:
            //if (emergencyList.get(key).equals("Others")) {
            //    emergencyList.remove(key);
            //}
            // C2
                emergencyList.remove(key, "Others");
        }

        emergencyList.replace(116, "Something else");
        emergencyList.replace(116, "Others", "Something else");

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
