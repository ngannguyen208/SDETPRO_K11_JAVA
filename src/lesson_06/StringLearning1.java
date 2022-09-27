package lesson_06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringLearning1 {

    public static void main(String[] args) {


        // Immutable
        String badWordsContainer = "   bad, very bad, sth else, bad!!    ";
        String filteredStr = badWordsContainer.replace("bad", "b**");

        System.out.println(filteredStr.trim()); //trim: cut space anywhere

        // Substring, indexOf, split
        String url = "https://google.com";
        System.out.println(url.substring(0, 5)); // cat tu 0 -> 5 in ra
        System.out.println(url.substring(8)); // cat tu ky tu thu 8 den cuoi chuoi

        System.out.println(url.indexOf("o"));
        System.out.println(url.indexOf("https_"));

        // split = cat bo ky tu
        String[] splitStr = url.split("o");
        System.out.println(Arrays.toString(splitStr));

        // RegularExpression | Regex --> tach
        String cookingTimeStr = "105mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "");
        int cookingTimeNumber = Integer.parseInt(cookingTimeNumStr);
        System.out.println(cookingTimeNumber + 1);

        // Concat | Concatenation --> noi chuoi
        // StringBuilder
        System.out.println(cookingTimeStr.concat("Minutes").concat("fast") + "hahaha".concat("test"));

    }
}
