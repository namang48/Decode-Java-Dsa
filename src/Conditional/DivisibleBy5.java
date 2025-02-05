package Conditional;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        boolean divBy5 = num % 5 == 0;
        if (divBy5) System.out.println(num + " is divisible by 5.");
        else System.out.println(num + " is not divisible by 5.");
    }
}
