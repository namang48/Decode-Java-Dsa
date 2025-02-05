package Conditional;

import java.util.Scanner;

public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is least.");
            } else {
                System.out.println(c + " is least.");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is least.");
            } else {
                System.out.println(c + " is least.");
            }
        }
    }
}
