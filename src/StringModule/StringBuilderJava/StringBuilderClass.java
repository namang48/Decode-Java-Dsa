package StringModule.StringBuilderJava;

import java.util.Scanner;

public class StringBuilderClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaration and initialisation
        StringBuilder sb=new StringBuilder("Physics Wallah skills");
        System.out.println(sb);


        //taking input in StringBuilder
        System.out.println("Enter a string : ");
        StringBuilder sbr=new StringBuilder(sc.nextLine());
        //or we can take input in a string
        // and pass it to StringBuilder constructor

        System.out.println(sbr);
    }
}
