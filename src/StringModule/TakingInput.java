package StringModule;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //nextLine() method takes characters until a new line character is reached.

        System.out.println("Enter a string again : ");
        String str=sc.nextLine();
        System.out.println(str);


        //next() method take character until a space is reached.

        System.out.println("Enter a string : ");
        str=sc.next();
        System.out.println(str);
    }
}
