package lab_06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lab_06_04 {
    public static void main(String[] args) {
        System.out.print("Please enter URL: ");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        checkProtocol(url);
        checkDomail(url);
    }

    public static void checkProtocol(String url) {
        String httpPro = "http";
        String httpsPro = "https";
        String[] strValue = url.split("://");
        if (strValue[0].equals(httpPro)) {
            System.out.println("Protocol is: " + httpPro);
        } else if (strValue[0].equals(httpsPro)) {
            System.out.println("Protocol is: " + httpsPro);
        } else {
            System.out.println("Sorry!Can't find Protocol http or https.");
        }
    }

    public static void checkDomail(String url) {
        String[] strValue = url.split("://");
        String dotCom = ".com";
        String dotNet = ".net";
        String nameDomain = url.substring(url.indexOf(strValue[1]), url.indexOf("."));
        System.out.println("Domain name is: " + nameDomain);

        String dotDomain = url.substring(url.indexOf("."));
        if (dotDomain.equals(dotCom)) {
            System.out.println("Domain is: " + dotCom);
        } else if (dotDomain.equals(dotNet)) {
            System.out.println("Domain is: " + dotNet);
        } else {
            System.out.println("Sorry!Can't find Domain .com or .net");
        }
    }
}
