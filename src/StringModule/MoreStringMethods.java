package StringModule;

import java.util.Scanner;

public class MoreStringMethods {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String s="Physics Wallah Skills";


        //startsWith() returns boolean value if the string Starts with specified string
        System.out.println(s.startsWith("Phy"));
        System.out.println(s.startsWith("Wa"));


        //contains() returns boolean value if the given string contains specified string as a part
        System.out.println(s.contains("alla"));
        System.out.println(s.contains("Kumar"));


        //endsWith() returns boolean value if the string Ends with specified string
        System.out.println(s.endsWith("lls"));
        System.out.println(s.endsWith("llah"));
    }
}