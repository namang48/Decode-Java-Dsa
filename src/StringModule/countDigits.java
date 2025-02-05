package StringModule;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        //Method 1
        int n = sc.nextInt();
        n=Math.abs(n);
        int num=n;

        int count = 0;
        for (; num > 0; num /= 10){
            count++;
        }
        System.out.println("Number of digits : "+ count);

        //Method 2
        String temp=""+n;
        System.out.println("Number of digits : "+ temp.length());


        //Method 3 using Integer.toString(int i) method
        temp=Integer.toString(n);
        System.out.println("Number of digits : "+ temp.length());

    }
}
