package lesson_06;

public class StringLearning {

    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        //s2 = "Dog";
        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String("Cat");

        System.out.println("S1==S2?: " + (s1.equals(s2)));
        //System.out.println("S1==S3?: " + (s1 == s3));
        System.out.println("S1==S3?: " + (s1.equals(s3)));

        /*
        * String -> array characters
        * length is equal -> continue -> false
        * if continue: compare each character
         */
        /*
        char[] s1Characters = s1.toCharArray();
        char[] s3Characters = s3.toCharArray();
        boolean isEqual = false;
        */


    }
}
